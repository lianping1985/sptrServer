package com.sptr.gateway.filter;

import com.alibaba.fastjson.JSONObject;
import com.sptr.gateway.common.Response;
import com.sptr.gateway.utils.JWTUtil;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

/**
 * @author：lianp
 * @description：
 * @date：19:47 2020/4/8
 */
@Component
public class JWTAuthFilter implements GlobalFilter, Ordered {
    @Override
    public int getOrder() {
        return -100;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String url = exchange.getRequest().getURI().getPath();
        //忽略以下url请求
        if(url.indexOf("/auth/") >= 0){
            return chain.filter(exchange);
        }
        //从请求头中取得token
        String token = exchange.getRequest().getHeaders().getFirst("authorization");
        if(StringUtils.isEmpty(token)){
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.OK);
            response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
            Response res = new Response(401, "401 unauthorized");
            byte[] responseByte = JSONObject.toJSON(res).toString().getBytes(StandardCharsets.UTF_8);
            DataBuffer buffer = response.bufferFactory().wrap(responseByte);
            return response.writeWith(Flux.just(buffer));
        }
        if (!token.startsWith("Bearer")) {
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.OK);
            response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
            Response res = new Response(403, "403 illegal");
            byte[] responseByte = JSONObject.toJSON(res).toString().getBytes(StandardCharsets.UTF_8);
            DataBuffer buffer = response.bufferFactory().wrap(responseByte);
            return response.writeWith(Flux.just(buffer));
        }
        System.out.println("url:"+url+",token:"+token);

        boolean verifyResult = JWTUtil.verify(token.substring(7));
        if(!verifyResult){
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.OK);
            response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");

            Response res = new Response(1004, "invalid token");
            byte[] responseByte = JSONObject.toJSON(res).toString().getBytes(StandardCharsets.UTF_8);

            DataBuffer buffer = response.bufferFactory().wrap(responseByte);
            return response.writeWith(Flux.just(buffer));
        }

        //请求中的token是否在redis中存在

        return chain.filter(exchange);
    }
}
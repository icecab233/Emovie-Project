package com.bjtu.emovie.job;

import redis.clients.jedis.Jedis;

public class RedisExample {
    public static void main(String[] args){
        Jedis jedis = new Jedis("localhost");
        System.out.println("Server is running: "+jedis.ping());
        // set key
        jedis.set("redis", "tencent");
        System.out.println("set key redis suc, value is: tencent");
        // get key
        String value = jedis.get("redis");
        System.out.println("get key redis is: " + value);
    }
}
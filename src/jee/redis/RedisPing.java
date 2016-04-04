package jee.redis;

import redis.clients.jedis.Jedis;

/**
 * Redis指令: Ping
 *
 * Created by bysocket on 16/3/25.
 */
public class RedisPing extends BaseRedis{

    public static void main(String[] args) {
        pingRedis();
    }

    public static void pingRedis(){
        System.out.println("Server is running: " + jedis.ping());
    }
}

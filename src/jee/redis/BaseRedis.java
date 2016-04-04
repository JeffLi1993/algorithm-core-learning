package jee.redis;

import redis.clients.jedis.Jedis;

/**
 * Redis连接基类
 *
 * Created by bysocket on 16/4/3.
 */
public class BaseRedis {
    public static Jedis jedis = new Jedis("localhost");
}

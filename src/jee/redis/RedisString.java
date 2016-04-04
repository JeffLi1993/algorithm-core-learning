package jee.redis;

/**
 * Redis指令: String操作
 *
 * Created by bysocket on 16/3/25.
 */
public class RedisString extends BaseRedis{
    public static void main(String[] args) {
        setGetString();
    }

    public static void setGetString() {
        // set redis string
        jedis.set("name","bysocket");
        // get redis string
        System.out.println(RedisPing.jedis.get("name"));

    }
}

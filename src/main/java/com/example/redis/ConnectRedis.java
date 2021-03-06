package com.example.redis;

import redis.clients.jedis.Jedis;

/**
 * @author clx 2018/10/11.
 */
public class ConnectRedis {

	public static void main(String[] args) {
		try (Jedis jedis = new Jedis("192.168.11.133", 6379)) {
			jedis.auth("test");
			System.out.println(jedis.ping());
			System.out.println(jedis.get("test"));
		}
	}
}

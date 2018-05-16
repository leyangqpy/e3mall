package cn.e3mall.jedis;

import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qianpyn on 2018/5/11.
 */
public class JedisTest {

    @Test
    public void testJedis()throws Exception{
        //创建一个jedis链接对象
        Jedis jedis = new Jedis("192.168.25.128",6379);
        jedis.set("test123","my first jedis test");
        String str = jedis.get("test123");
        System.out.println(str);
        jedis.close();
    }

    @Test
    public void testJedisPool()throws Exception{
        //创建一个连接池对象，两个参数host、port
        JedisPool jedisPool = new JedisPool("192.168.25.128", 6379);
        //从连接池获得一个连接，就是一个jedis对象。
        Jedis jedis = jedisPool.getResource();
        //使用jedis操作redis
        String string = jedis.get("test123");
        System.out.println(string);
        //关闭连接，每次使用完毕后关闭连接。连接池回收资源。
        jedis.close();
        //关闭连接池。
        jedisPool.close();
    }

    @Test
    public void testJedisCluster() throws Exception {
        //创建一个JedisCluster对象。有一个参数nodes是一个set类型。set中包含若干个HostAndPort对象。
        Set<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("192.168.25.128", 7001));
        nodes.add(new HostAndPort("192.168.25.128", 7002));
        nodes.add(new HostAndPort("192.168.25.128", 7003));
        nodes.add(new HostAndPort("192.168.25.128", 7004));
        nodes.add(new HostAndPort("192.168.25.128", 7005));
        nodes.add(new HostAndPort("192.168.25.128", 7006));
        JedisCluster jedisCluster = new JedisCluster(nodes);
        //直接使用JedisCluster对象操作redis。
        jedisCluster.set("test", "123");
        String string = jedisCluster.get("test");
        System.out.println(string);
        //关闭JedisCluster对象
        jedisCluster.close();
    }
}

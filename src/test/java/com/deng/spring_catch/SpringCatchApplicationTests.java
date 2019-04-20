package com.deng.spring_catch;

import com.deng.spring_catch.bean.Employee;
import com.deng.spring_catch.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCatchApplicationTests {

    @Autowired
    EmployeeMapper employeemapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

//    @Autowired
 //   RedisTemplate<String,Employee> empRedisTemplate;

    @Test
    public void test01(){
        //stringRedisTemplate.opsForValue().append("msg","hello");
        String msg = stringRedisTemplate.opsForValue().get("msg");
        System.out.print(msg);
    }


    @Test
    public void contextLoads() {
        Employee emp = employeemapper.getEmpByid(1);
        //将其存储到Redis中
        redisTemplate.opsForList().leftPush("1",emp);
        System.out.print(emp);
    }

    @Test
    public void test02(){
        Employee emp = employeemapper.getEmpByid(1);
        //empRedisTemplate.opsForList().leftPush("1",emp);
        System.out.print(emp);
    }

}

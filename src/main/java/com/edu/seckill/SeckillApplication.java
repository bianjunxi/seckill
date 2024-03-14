package com.edu.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:  SeckillApplication
 * Description:
 *
 * @author Jay
 * @version v1.0
 */
@SpringBootApplication
@MapperScan("com.edu.seckill.mapper")
public class SeckillApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeckillApplication.class, args);
    }
}

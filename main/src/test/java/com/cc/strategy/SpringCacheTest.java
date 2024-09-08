package com.cc.strategy;

import com.cc.designPatternDemo.DesignPatternDemoApplication;
import com.cc.dome.service.SpringCacheService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest(classes = DesignPatternDemoApplication.class)
public class SpringCacheTest {

    @Autowired
    private SpringCacheService springCacheService;


    /**
     *  成功缓存
     */
    @Test
    public void run(){
        log.info(".... Fetching books");
        log.info("isbn-1234 -->" + springCacheService.getByIsbn("isbn-1234"));
        log.info("isbn-4567 -->" + springCacheService.getByIsbn("isbn-4567"));
        log.info("isbn-1234 -->" + springCacheService.getByIsbn("isbn-1234"));
        log.info("isbn-4567 -->" + springCacheService.getByIsbn("isbn-4567"));
        log.info("isbn-1234 -->" + springCacheService.getByIsbn("isbn-1234"));
        log.info("isbn-1234 -->" + springCacheService.getByIsbn("isbn-1234"));
    }
}

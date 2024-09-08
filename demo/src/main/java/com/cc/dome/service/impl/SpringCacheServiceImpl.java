package com.cc.dome.service.impl;

import com.cc.dome.service.SpringCacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SpringCacheServiceImpl  implements SpringCacheService {
    @Cacheable("books")
    public String getByIsbn(String isbn) {
        simulateSlowService();
        return isbn;
    }

    public  void simulateSlowService() {
        long startTime = System.currentTimeMillis();



        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Method execution time (without cache): " + executionTime + " ms");
    }
}

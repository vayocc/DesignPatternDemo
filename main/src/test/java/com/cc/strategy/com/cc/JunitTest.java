package com.cc.strategy.com.cc;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class JunitTest {

    /**
     * 然后在每循环3次时执行某个操作。
     */
    @Test
    public void for3(){
        // 假设您有一个要循环的数组 nums
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11};

        for (int i = 0; i < nums.length; i++) {
            // 执行某个操作
            System.out.println(nums[i]);

            // 每循环3次执行一次某操作
            if ((i + 1) % 3 == 0 || i == nums.length - 1) {
                System.out.println("执行某操作");
            }
        }
    }


}

package com.cc.strategy.com.cc;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class ChannelTransferExample {
    /**
     * 我们从 3 个不同的文件中读取文件内容，并将其组合输出写入第四个文件。
     */
    @Test
    public  void channelTransferExample1() throws Exception {

        // System.setProperty("webdriver.gecko.driver", new ClassPathResource(File.separator + "temp" + File.separator + "test.txt").getFile().getAbsolutePath());
        //Input files
        String[] inputFiles = new String[]{"E:\\Users\\inputFile1.txt","E:\\Users\\inputFile2.txt","E:\\Users\\inputFile3.txt"};

        //Files contents will be written in these files
        String outputFile = "E:\\Users\\outputFile.txt";

        //Get channel for output file
        FileOutputStream fos = new FileOutputStream(new File(outputFile));
        WritableByteChannel targetChannel = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++)
        {
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
        }

        //finally close the target channel
        targetChannel.close();
        fos.close();
    }
}

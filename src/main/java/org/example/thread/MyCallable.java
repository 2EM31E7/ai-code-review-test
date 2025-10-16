package org.example.thread;

import java.util.concurrent.Callable;

/**
 * @Author: Bach912
 * @Description: TODO
 * @DateTime: 2025/10/9 13:16
 **/
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "my callable";
    }
}

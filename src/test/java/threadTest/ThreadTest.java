package threadTest;

import org.example.User;
import org.example.thread.MyCallable;
import org.example.thread.MyRunnable;
import org.junit.Test;

import java.beans.FeatureDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: Bach912
 * @Description: TODO
 * @DateTime: 2025/10/9 13:20
 **/
public class ThreadTest   {

    @Test
    public void  creatThreadByThread(){

    }
    @Test
    public void  creatThreadByRunnable(){
        MyRunnable myRunnable = new MyRunnable();
        User user = new User();

        Thread thread = new Thread(myRunnable);
        thread.start();
        Thread thread1 = Thread.currentThread();
        System.out.println(thread1);
        System.out.println(user.getA());
        user.f();
    }
    @Test
    public void  creatThreadByCallable(){
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            String s = futureTask.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

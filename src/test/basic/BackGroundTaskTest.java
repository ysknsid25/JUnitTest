package test.basic;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;
import org.junit.jupiter.api.Timeout;

import main.basic.BackgroundTask;

public class BackGroundTaskTest {
  @Test
  @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
  public void invokeRunOtherThread() throws Exception {
    // ! setup
    final AtomicReference<String> bgThreadName = new AtomicReference<String>();
    final CountDownLatch latch = new CountDownLatch(1);
    Runnable task = new Runnable() {
      @Override
      public void run() {
        bgThreadName.set(Thread.currentThread().getName());
        latch.countDown();
      }
    };
    BackgroundTask sut = new BackgroundTask(task);

    // ! exercise
    sut.invoke();
    latch.await();

    // ! verify
    String actual = bgThreadName.get();
    String expected = Thread.currentThread().getName();
    assertNotEquals(actual, expected);
  }
}

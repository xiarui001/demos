package four_tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestDeadLock {

    public static void createBusyThread(){
        Thread busyThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    ;
                }

            }
        }, "busyThread");
        busyThread.start();

    }

    public  static  void createDeadLockThread(final Object lock){

        Thread deadLockThread = new Thread(new Runnable() {
            public void run() {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("");
                }
            }
        }, "deadLockThread");
        deadLockThread.start();

    }

    public static void main(String[] args) throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        createBusyThread();
        reader.readLine();
        createDeadLockThread(new Object());
        System.out.println("mainThread-----Over");

    }
}

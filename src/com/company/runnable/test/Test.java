package com.company.runnable.test;

public class Test{

    public Test() {
    }

    public void one(Runnable one) {
        one.run();
    }

    public void two(Runnable two) throws InterruptedException {
        Thread.sleep(500);
        two.run();
    }

    public void three(Runnable three) throws InterruptedException {
        Thread.sleep(1000);
        three.run();
    }
}

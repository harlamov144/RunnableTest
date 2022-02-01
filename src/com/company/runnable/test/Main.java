package com.company.runnable.test;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();

        OrderedRunnable one = new OrderedRunnable("one");
        OrderedRunnable two = new OrderedRunnable("two");
        OrderedRunnable three = new OrderedRunnable("three");

        Thread first = new Thread(() -> {
            try {
                test.two(two);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread second = new Thread(() -> {
            test.one(one);
        });

        Thread third = new Thread(() -> {
            try {
                test.three(three);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        first.start();
        second.start();
        third.start();
    }
}

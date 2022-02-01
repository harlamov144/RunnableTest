package com.company.runnable.test;

public class OrderedRunnable implements Runnable {

   private String order;

    public OrderedRunnable(String order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.print(order);
    }
}

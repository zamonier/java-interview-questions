package com.company;

public class Main {

    private static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Start task");
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Do job");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        new Thread(new Task()).start();
        System.out.println("End main");
    }
}

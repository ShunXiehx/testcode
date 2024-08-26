package com.example.demotest;

public class TestRun implements Runnable{

    public void run() {
        try{
            Thread.sleep(5000);
        }catch (Exception e) {
        }
        System.out.println("1");
    }

    private void complete() {
        System.out.println("2");
    }

    private void runMethod() {
        new Thread(this).run();
        complete();
    }

    private void startMethod() {
        new Thread(this).start();
        complete();
    }

    public static void main(String[] args) {
        TestRun t = new TestRun();
        t.runMethod();
        t.startMethod();
    }
}

package com.lizhuquan.concurrency.chapter11;

public class Test {

    private String chenYuan;

    public void fanFang() {
        String juBU = "hello";
        this.chenYuan = juBU;
    }

    public String getChenYuan() {
        return this.chenYuan;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.fanFang();
        System.out.println(test.getChenYuan());
    }
}
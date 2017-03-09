package com.sda.Queue;

public class Main {

    public static void main(String[] args) {

        QueueElements queue = new QueueElements();

        queue.add("test");
        queue.add("drugi test");
        queue.add("trzeci test");

        queue.show();
        queue.ile();
    }
}

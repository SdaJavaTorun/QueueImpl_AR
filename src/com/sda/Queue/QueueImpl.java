package com.sda.Queue;

/* Created by Artur Rózgowski on 3/9/17 */
public class QueueImpl {

    private String value; // wartosc do wstawienia do kolejki
    private QueueImpl next; // wskazuje na nastepny element

    public QueueImpl (String value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueueImpl getNext() {
        return next;
    }

    public void setNext(QueueImpl next) {
        this.next = next;
    }




}

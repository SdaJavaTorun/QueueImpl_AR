package com.sda.Queue;

/* Created by Artur Rózgowski on 3/9/17 */
public class QueueElements {

    private QueueImpl first;
    private QueueImpl last;

    public QueueElements () {
        first = last = null;
    }

    public QueueImpl getFirst() {
        return first;
    }

    public void setFirst(QueueImpl first) {
        this.first = first;
    }

    public QueueImpl getLast() {
        return last;
    }

    public void setLast(QueueImpl last) {
        this.last = last;
    }

    public void add (String value) {
        // nowy element w kolejce
        QueueImpl queue = new QueueImpl(value);
        // jezeli kolejka jest pusta to element in
        // jest pierwszy i ostatni
        if (first == null) {
            first = last = queue;
        }
        else {
            // jezeli kolejka nie jest pusta
            // to element przychodzacy jest ustawiany
            // jako ostatni
            last.setNext(queue);
            last = queue;
        }
    }
    public void show () {
        if (first != null) {
            QueueImpl element = first;

            while (element != null) {
                System.out.println(element.getValue());
                element = element.getNext();
            }
        }
    }

    public void ile () {
        int counter = 0;
        if (first != null) {
            QueueImpl element = first;

            while (element != null) {
                element = element.getNext();
                counter++;
            }
        }
        System.out.println("\nIlość elementów w kolejce: " + counter);
    }
}

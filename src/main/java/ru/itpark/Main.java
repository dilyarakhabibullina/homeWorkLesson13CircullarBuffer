package ru.itpark;

import org.apache.commons.collections4.queue.CircularFifoQueue;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        CircularFifoQueue<Integer> buffer = new CircularFifoQueue<Integer>(10);
        buffer.add(10);
        buffer.add(20);
        buffer.add(30);
        buffer.add(40);
        buffer.add(50);
        buffer.add(60);
        buffer.add(70);
        buffer.add(80);
        buffer.add(90);
        buffer.add(100);
        buffer.add(110);
        buffer.add(120);
        buffer.add(130);
        System.out.println(buffer);

        CircularFifoQueue<ElectronicQueue> queue = new CircularFifoQueue<ElectronicQueue>(5);
queue.add (new ElectronicQueue(1,"Sharapova"));
queue.add (new ElectronicQueue(2,"Navratilova"));
queue.add (new ElectronicQueue(3,"Williams S."));
queue.add (new ElectronicQueue(4,"Williams V."));
queue.add (new ElectronicQueue(5,"Kerber"));
queue.add (new ElectronicQueue(6,"Ivanovic"));
        System.out.println(queue);
        }


}





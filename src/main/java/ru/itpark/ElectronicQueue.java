package ru.itpark;

import org.apache.commons.collections4.queue.CircularFifoQueue;

public class ElectronicQueue {
    private int ticketNumber;
    private String surname;

    public ElectronicQueue(int ticketNumber, String surname) {
        this.ticketNumber = ticketNumber;
        this.surname = surname;
    }
  public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return ("Next:  " + ticketNumber + "_"+ surname);
    }
}

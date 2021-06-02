package com.star.java.oop.exceptions;

public class Student {

    private int note;

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if (note > 10 || note < 1) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Note should be between 1 and 10");
            throw illegalArgumentException;
        }
        this.note = note;
    }
}

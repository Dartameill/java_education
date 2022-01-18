package com.company.lesson5_and_lesson6_rewrite;

public enum Position {

    WORKER(2),
    DIRECTOR(5);
    int rate;

    Position() {
    }

    Position(int rate) {
        this.rate = rate;
    }
}

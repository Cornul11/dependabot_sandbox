package org.example;

import ch.qos.logback.core.LogbackException;


public class Main {
    public static void main(String[] args) {
        LogbackException ex = new LogbackException("Exception");
        System.out.println(ex.getMessage());


    }
}
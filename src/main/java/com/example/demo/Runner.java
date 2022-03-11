package com.example.demo;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Runner {
    private static volatile boolean wPressed = false;
    public static boolean isWPressed() {
        synchronized (Runner.class) {
            return wPressed;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(ke -> {
            System.out.println(ke.toString());
            return true;
        });

        Runnable runnable = () -> {
            int i = 0;
            while(i < 9) {
                try {
                    Thread.sleep(1000);
                    System.out.println(i);
                } catch (InterruptedException e) {
                }
                i++;

            }
        };
        runnable.run();

    }
}

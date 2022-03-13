package com.github.viniclee.springprometheusdemo;

import java.util.Random;

import org.springframework.stereotype.Service;
/**
 * mock Product B api 
 */

 @Service
public class ServiceBApiMock {

    private Random rand = new Random();

    public void request() {
        try {
            Thread.sleep(rand.nextInt(300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

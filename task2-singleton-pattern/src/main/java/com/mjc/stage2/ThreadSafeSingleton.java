package com.mjc.stage2;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

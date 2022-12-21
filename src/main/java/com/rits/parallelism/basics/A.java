package com.rits.parallelism.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/05/22
 */
public class A {

    Object key1 = new Object();
    Object key2 = new Object();

    public void a(){
        synchronized (key1) {
            System.out.println("I am in a");
            b();
        }

    }
    public void b(){
        synchronized (key2){
            System.out.println("I am in B");
            c();
        }

    }
    public void c(){
        synchronized (key1){
            System.out.println("I am in c");
        }

    }

}

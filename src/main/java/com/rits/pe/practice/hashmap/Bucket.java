package com.rits.pe.practice.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rits
 * @created on 08/01/2024
 * @project dsa
 */
public class Bucket {
    List<List<Integer>> bucket;

    public Bucket(){
        bucket = new ArrayList<>();
    }
    public void update(int key, int value){
        boolean isAvailable = false;
        for (int i = 0; i < bucket.size(); i++) {
            if (key == bucket.get(i).get(0)){
                this.bucket.get(i).set(1,value);
                isAvailable = true;
                break;
            }

        }
        if (!isAvailable){
            this.bucket.add(Arrays.asList(key,value));
        }
    }
    public int get(int key) {
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).get(0) == key)
                return bucket.get(i).get(1);
        }
        return -1;
    }
    public void remove(int key) {
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).get(0) == key) {
                bucket.remove(i);
                break;
            }
        }
    }
}

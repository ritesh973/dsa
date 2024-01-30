package com.rits.pe.practice.hashmap;

/**
 * @author rits
 * @created on 08/01/2024
 * @project dsa
 */
public class DesignHashMap {

    int bucket[];
    int keySpace;
    public DesignHashMap(int keySpace) {
        this.keySpace = keySpace;
        this.bucket = new int[keySpace];
        for (int i = 0; i < keySpace; i++) {
            bucket[i] = -1;
        }
    }

    public void put(int key, int value) {
        int hash = getHash(key);
        bucket[hash] = value;
    }

    public int get(int key) {
        int hash = getHash(key);
        return bucket[hash];
    }

    public void remove(int key) {
        int hash = getHash(key);
        bucket[hash] = -1;

    }
    private int getHash(int key){
        return key % keySpace;
    }
}

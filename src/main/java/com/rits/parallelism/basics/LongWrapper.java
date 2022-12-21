package com.rits.parallelism.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/05/22
 */
public class LongWrapper {

    private long l;

    private Object o = new Object();

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getL() {
        return l;
    }

    public void incrementValue(long l) {
        synchronized (o) {
            this.l = l + 1;
        }
    }
}

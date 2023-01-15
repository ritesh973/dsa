package com.rits.common;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 15/01/23
 */
public class Pair<F,S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
    public static <F,S> Pair<F,S> of(F first, S second){
        return new Pair<>(first, second);
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public Pair() {
    }


}

package com.rits.bag;


/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 22/12/22
 */
public class LlBagDriver {

    public static void main(String[] args) {
        LlBag<Integer> bag = new LlBag<>();
        bag.add(10);
        bag.add(20);
        bag.add(23);
        for (Integer data: bag) {
            System.out.println(data);
        }
    }
}

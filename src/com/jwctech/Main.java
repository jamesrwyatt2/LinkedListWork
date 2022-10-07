package com.jwctech;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apples");
        shoppingList.add("bananas");
        shoppingList.add("bread");

        System.out.println(shoppingList);

        shoppingList.add(1,"pizza");

        System.out.println(shoppingList);

        shoppingList.removeFirst();

        System.out.println(shoppingList);



    }
}

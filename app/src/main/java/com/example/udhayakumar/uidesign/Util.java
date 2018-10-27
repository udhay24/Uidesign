package com.example.udhayakumar.uidesign;

import java.util.ArrayList;

public class Util {

    public static ArrayList<ArrayList> getItem(){
        ArrayList item1 = new ArrayList();
        item1.add(R.drawable.dish11);
        item1.add(R.drawable.dish12);
        item1.add(R.drawable.dish13);
        item1.add("Fruity BreakFast");
        item1.add("9 recipes");

        ArrayList item2 = new ArrayList();
        item2.add(R.drawable.dish21);
        item2.add(R.drawable.dish22);
        item2.add(R.drawable.dish23);
        item2.add("Tasty Low-Cal");
        item2.add("25 recipes");

        ArrayList item3 = new ArrayList();
        item3.add(R.drawable.dish31);
        item3.add(R.drawable.dish32);
        item3.add(R.drawable.dish33);
        item3.add("Healthy Desserts");
        item3.add("2 recipes");


        ArrayList<ArrayList> recipes = new ArrayList<>();
        recipes.add(item1);
        recipes.add(item2);
        recipes.add(item3);

        return recipes;
    }
}

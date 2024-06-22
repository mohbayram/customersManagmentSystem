package com.example.customermanagmentsystem;

import java.util.ArrayList;
import java.util.Random;

public class IDGenerator {
    private static ArrayList<Integer> ids;

    public static Integer generateID(){
        Integer i = new Random().nextInt(99999) + 10000;
        while (ids.contains(i)){
            i = new Random().nextInt(99999) + 10000;
        }
        ids.add(i);
        return i;
    }

    public static boolean deleteID(Integer d){
        return ids.remove(d);
    }
}

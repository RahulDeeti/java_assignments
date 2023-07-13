package com.assignments.a7.a7_4.factories;
import com.assignments.a7.a7_4.implementations.Unicycle;
public class UnicycleFactory {
    public static Unicycle createUnicycle() {
        System.out.println("Creating a new unicycle.");
        return new Unicycle();
    }
}

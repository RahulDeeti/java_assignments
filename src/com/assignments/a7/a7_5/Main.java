package com.assignments.a7.a7_5;
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass("Hello");

        OuterClass.InnerClass inner = outer.new InnerClass("World");
        inner.displayData();

        DerivedClass derived = new DerivedClass(outer, "Inner Data", "Derived Data");
        derived.displayData();
        derived.displayDerivedData();
    }
}

package com.assignments.a7.a7_5;

class DerivedClass extends OuterClass.InnerClass {
    private String derivedData;

    public DerivedClass(OuterClass outer, String innerData, String derivedData) {
        outer.super(innerData);
        this.derivedData = derivedData;
    }

    public void displayDerivedData() {
        System.out.println("Derived data: " + derivedData);
    }
}

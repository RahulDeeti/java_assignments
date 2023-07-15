package com.assignments.a7.a7_4.factories;
import com.assignments.a7.a7_4.Cycle;
import com.assignments.a7.a7_4.implementations.Bicycle;

public class BicycleFactory implements CycleFactory{

    @Override
    public Cycle createCycle() {
        return new Bicycle();
    }
}

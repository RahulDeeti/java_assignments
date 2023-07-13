package com.assignments.a8;
public class Main {
    public static void throwExceptions() throws CustomException1, CustomException2, CustomException3 {
        // throw Exception
        throw new CustomException1();
        // throw new CustomException2();
        // throw new CustomException3();
    }

    public static void main(String[] args) {
        try {
            throwExceptions();
        } catch (CustomException1 | CustomException2 | CustomException3 e) {
            System.out.println("Caught exception: " + e);
        } finally {
            System.out.println("Finally block always executed");
        }
    }
}


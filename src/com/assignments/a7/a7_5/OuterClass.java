package com.assignments.a7.a7_5;

class OuterClass {
    private String outerData;

    public OuterClass(String outerData) {
        this.outerData = outerData;
    }

    class InnerClass {
        private String innerData;

        public InnerClass(String innerData) {
            this.innerData = innerData;
        }

        public void displayData() {
            System.out.println("Outer data: " + outerData);
            System.out.println("Inner data: " + innerData);
        }
    }
}

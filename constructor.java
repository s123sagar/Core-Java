package com.company;

public class constructor {
   //public static class Main{
        int modelYear;
        String modelName;

        public constructor(int year, String name) {
            modelYear = year;
            modelName = name;
        }

        public static void main(String[] args) {
            constructor myCar = new constructor(1969, "Mustang");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
        }
    }


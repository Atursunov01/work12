package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array =  {1,2,3,4,5};

        Class1 class1 = new Class1(15,"soz",array );
        for (int i = 0; i <class1.array.length; i++) {
            System.out.println(class1.array[i]);

        }

        System.out.println(class1.number+ "," + class1.word);
      //  System.out.println(class1.word);

    }
}

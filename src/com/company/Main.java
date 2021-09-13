package com.company;

public class Main {

    public static void main(String[] args) {
        int [] array = new int[] {4, -3, -5, 9, 1, 11};
        int m = 1;
        System.out.println("The smaller values are: ");

        {
            for (int j : array)
                if (j < m)
                    System.out.println(j);
        }

        System.out.println(" ");

        System.out.println("The larger values are: ");

            {
                for (int j : array)
                    if (m < j)
                        System.out.println(j);
            }

    }
}

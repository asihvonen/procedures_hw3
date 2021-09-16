package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[] values = {1, 7, -3 ,10, 0};
        int[] valuesTwo = {7, 4, 5};
        System.out.println (any (values, valuesTwo));
    }

    static boolean contains (int[] array, int value)
    {
        boolean result = false;
        for (int i = 0; i < array.length && !result; i++) //i is index of array
        {
            if (array[i] == value)
                result = true;
        }
        return result;
    }

    static boolean any (int[] array, int[] b)
    {
        boolean result = false;
        for (int j = 0; j < b.length; j++) //j is index of int[] b
        {
            if (contains (array, b[j]))
                result = true;
        }
        return result;
    }
}
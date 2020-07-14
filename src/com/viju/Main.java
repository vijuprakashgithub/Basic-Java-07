package com.viju;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
	int[][] number1 = {{1,2},{4,10},{13},{12,4,8},{50,23,45}};
	float[][] number2 = {{12.45F, 32.84F},{101.432F, 903.12940F, 89.482F}};

	System.out.println("Integer array values in forward direction are");

	for(int i = 0; i<number1.length; i++)
    {
        System.out.println(Arrays.toString(number1[i]));
    }

	System.out.println("Float array values in backward direction are");

	for(int j = number2.length-1; j>=0; j--)
	{
        System.out.println(Arrays.toString(number2[j]));
    }
    }
}

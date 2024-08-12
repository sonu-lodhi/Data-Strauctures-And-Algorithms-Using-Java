package org.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter the size of array : ");
            int size =  input.nextInt();
            int []arr = new int[size];

            System.out.println("Enter the elements to insert into the array");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            System.out.println("Array: "+ Arrays.toString(arr));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            input.close();
        }
    }
}

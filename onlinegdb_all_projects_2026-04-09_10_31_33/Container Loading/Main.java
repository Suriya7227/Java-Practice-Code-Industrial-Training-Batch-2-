/*
Container Loading Problem:
Problem
We are given:
A container with limited capacity
A set of items with weights
Objective
1)Load the maximum number of items into the container
2)The total weight must not exceed the capacity
Example
Container capacity = 20
Weights = 4, 8, 1, 5, 12
Read number of items
Read weights
Sort the weights in ascending order
Add weights one by one until capacity is full
Count how many items are loaded
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int w[] = {4, 8, 1, 5, 12};   
        int capacity = 20;
        Arrays.sort(w);   
        int sum = 0;
        int count = 0;
        for(int i = 0; i < w.length; i++) {
            if(sum + w[i] <= capacity) {
                sum = sum + w[i];
                count++;
            }
        }
        System.out.println("Items loaded = " + count);
        System.out.println("Total weight = " + sum);
    }
}
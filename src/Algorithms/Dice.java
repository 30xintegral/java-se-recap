package Algorithms;

import java.util.*;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] result = new int[7];
        int n=1000;
        while(n-- > 0){
            int p = rand.nextInt(1,7);
            result[p] +=1;
        }
        System.out.println(Arrays.toString(result));
    }

}

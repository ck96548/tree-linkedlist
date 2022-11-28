package genericTree;
import java.io.*;
import java.util.Scanner;
public class GenTree {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner (System.in);
//        int n = scn.nextInt();
//        long arr [] = new long [n];
//        
//        for(int i = 0 ; i < n ; i++) {
//        	arr[i] = scn.nextInt();       
//        }
        
        long arr [] = {15,5};
        System.out.println(cubic(arr));
     }

	public static int cubic(long arr[]) {
		int n = arr.length;
		int count = 0;
        for(int i = 0 ; i <=Math.cbrt(n) ; i++) {
        	int cb  = i*i*i;
        	
        	int diff = n - cb;
        	
        	int cbrtDiff = (int) Math.cbrt(diff);
            
            // If yes, then increment count
            if (cbrtDiff*cbrtDiff*cbrtDiff == diff)
                count++;
        }
        
        return count;
	}

}

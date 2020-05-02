// This work is mine unless otherwise cited -Robert McMaster

import java.util.Scanner;
import java.io.*;

class BruteForceAlgorithm{
	public static int bruteforce(String text,String tobematched){
		int length = text.length();//length of the text
		int plength = tobematched.length();//length of the pattern;

		//loop condition
		for(int i=0;i<length-plength;i++){
			//initialization of j
			int j=0;
			while((j < plength) && (text.charAt(i+j) == tobematched.charAt(j))){
				j++;
			}
			if(j == plength){
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args){
		BruteForceAlgorithm obj = new BruteForceAlgorithm();
		Scanner sc1 =  new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
		//text
    System.out.println("Enter text to be scanned: ");
		String text = sc1.nextLine();
		//word that want to be matched in the text
    System.out.println("Enter 3 letter phrase to be matched: ");
		String phrasetomatch = sc2.nextLine();
		//calling the function
    long startTime = System.nanoTime();
		int position = obj.bruteforce(text,phrasetomatch);
		int endindex = position+1;
		if(position == -1){
			System.out.println("Pattern is not matched");
		}else{
			System.out.println("Found at position: " + (position+1));
			System.out.println("End at the position: " + (endindex + phrasetomatch.length()));
      //System.out.println("Pattern is matched at " + (position+1) + " - " + (position+3));
		}
    long endTime = System.nanoTime();
    long runTime = endTime - startTime;
    System.out.println("The runtime was " + runTime + " nano seconds");
	}
}

// Ayman Tawfeeq; 20845240
//Assignment 5 question 2
//2020-02-14
// This program prompts the user for many integers and prints the total even sum and maximum of the even numbers. 
import java.util.Scanner;
public class EvenSums {
	public static void main(String[] args) {
		int sum = 0;
		
		int oldNum=0;
		int max=0;
		
		
		 System.out.print("how many integers?");	//accept the first word the user inputs
		 Scanner in = new Scanner( System.in ); 
		 int input = in.nextInt();
			for(int a= 0; a < input ;a++) {
				System.out.print("next integer");
			int	num = in.nextInt();
				if (num %2 == 0) {
					sum = sum + num;
			}
			if(num%2==0) {
				if(num>oldNum) {
					max=num;
				}}}
		System.out.println("even sum = "+ sum);
		System.out.println("even max = "+ max);
	}
}

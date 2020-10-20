// Ayman Tawfeeq; 20845240
//Assignment 5 question 3
//2020-02-14
//allows the user to play a reverse guessing game in which the user thinks up an integer and the computer makes guesses until the it gets it right. For each guess the user will specify whether it is the right answer (y/n)

import java.util.Scanner;
import java.util.Random;

public class ReverseGuess {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		WelcomeIntro();
		int a = 0; 
		int maxGuess=0;
		int games = 0;
		String Yes = "y";
		Yes = Yes.toLowerCase();

		// GuessNum();
		while (!Yes.startsWith("n")) {
			int g = GuessNum();
			Yes = in.next();
			a = a + g;
			games++;
			if (maxGuess < g) {
				maxGuess = g;

			}
		}
		System.out.println();
		Results(a, games, maxGuess);

	}

	public static void WelcomeIntro() { //intoduction method
		System.out.println("This program has you, the user, choose a number");
		System.out.println("between 1 and 10, then I, the computer, will try");
		System.out.println("my best to guess it.");
		System.out.println();
	}

	public static int GuessNum() { //game method that runs the game one time

		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		String No = "n";
		int count = 0;
		int input = 0;
		while (!No.startsWith("y")) {
			int n = rand.nextInt(10) + 1;
			System.out.print("Is it " + n + "?");
			No = in.next();
			No = No.toLowerCase();
			input = n;
			count++;

		}
		System.out.println();

		System.out.println("I got your number " + input + " in " + count + " guesses.");
		System.out.println("Do you want to play agaian?");

		return count;

	}

	public static void Results(int q, int w, int e) { // resluts method that prints out the final results when the user is done playing
		System.out.println("Overall results:");
		System.out.println("total games = " + w);
		System.out.println("total guesses = " + q);
		System.out.println("guesses/game  = " + q / w);
		System.out.println("max guesses   = " + e);

	}
}

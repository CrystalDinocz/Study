package org.cyril.helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		for (int x = 1; x < 101; x++) {
			if (x % 15 == 0) {
				System.out.println(x + " FizzBuzz");
			} else if (x % 5 == 0) {
				System.out.println(x + " Buzz");
			} else if (x % 3 == 0) {
				System.out.println(x + " Fizz");
			} else {
				System.out.println(x);
			}
		}
		String[] strs = { "-1", "2", "3" };
		Rovnice.main(strs);
	}
}
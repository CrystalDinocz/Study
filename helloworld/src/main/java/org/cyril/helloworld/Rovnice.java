package org.cyril.helloworld;

public class Rovnice {
	public static void main(String[] args) {
		Rovnice rovnice = new Rovnice();
		rovnice.calc(args);

	}

	public void calc(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double dis = (b * b) - (4 * a * c);
		double dis2 = Math.pow(dis, 0.5);
		if (dis < 0) {
			System.out.println("Rovnice nemá řešení.");
		} else if (dis == 0) {
			double x = -b / 2 * a;
			System.out.println("x = " + x);
		} else {
			double x1 = (-b + dis2) / (2 * a);
			double x2 = (-b - dis2) / (2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}

	}
}

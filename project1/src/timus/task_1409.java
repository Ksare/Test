package timus;

import java.util.Scanner;
import java.io.PrintWriter;

public class task_1409 {

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		Scanner bullets = new Scanner(System.in);
		int a = bullets.nextInt();
		int b = bullets.nextInt();
		
		int bulletsOnpots = a + b - 1;
		
		int bulletsgarry = bulletsOnpots - a;
		int bulletslarry = bulletsOnpots - b;
		
		out.println(bulletsgarry + " " + bulletslarry);
		out.flush();
		
		bullets.close();
	}

}

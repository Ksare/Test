package timus;

import java.util.Scanner;


public class task_1877 {

	public static void main(String[] args) {
		Scanner code = new Scanner(System.in);

		int try1 = code.nextInt();
		int try2 = code.nextInt();
		
		if(try1 % 2 == 0|| try2 % 2 !=0 ) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
		code.close();
	}

}

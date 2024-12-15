package timus;

import java.util.Scanner;

public class task_1264 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int numberofM = M + 1;
		
		int result = N * numberofM;
		
		System.out.println(result);
		
		in.close();
	}

}

package project1;

import java.util.Scanner;

public class lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.print("Введите целое число: ");
	        
	    int n = number.nextInt();
	    if (n >= 5 && n <= 10) {
	    	System.out.println("Введенное число находится в диапозоне от 5 до 10 включительно.");
        } else {
            System.out.println("Введенное число не находится в диапозоне от 5 до 10 включительно.");
	        }
	    number.close();
		

	}

}

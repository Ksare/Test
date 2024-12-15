package project1;

import java.util.Scanner;

public class lesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);
		System.out.print("Введите целое число: ");
	        
	    int n = number.nextInt();
	    if (n % 4 == 0 && n >= 10) {
	    	System.out.println("Введенное число удовлетворяет заданным критериям.");
        } else {
            System.out.println("Введенное число не удовлетворяет заданным критериям.");
	        }
	    number.close();

	}

}

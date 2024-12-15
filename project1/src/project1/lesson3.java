package project1;

import java.util.Scanner;

public class lesson3 {

	public static void main(String[] args) {
	
		 
		Scanner number = new Scanner(System.in);
		System.out.print("Введите целое число: ");
	        
	    int n = number.nextInt();
	    if (n % 5 == 2 && n % 7 == 1) {
	    	System.out.println("Введенное число удовлетворяет заданным критериям.");
        } else {
            System.out.println("Введенное число не удовлетворяет заданным критериям.");
	        }
	    number.close();
	    }

	}


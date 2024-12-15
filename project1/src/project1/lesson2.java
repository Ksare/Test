package project1;

import java.util.Scanner;

public class lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner number = new Scanner(System.in);
		System.out.print("Введите целое число: ");
	        
	    int n = number.nextInt();
	    if (n % 3 == 0) {
	            System.out.println("Введенное число на 3 делится.");
	        } else {
	            System.out.println("Введенное число на 3 не делится.");
	           
	        }
	    number.close();
	    }

	}


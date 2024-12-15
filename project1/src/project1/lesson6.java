package project1;

import java.util.Scanner;

public class lesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);

        System.out.print("Введите число:");
        int num = number.nextInt();
        String numbertext = String.valueOf(num);

        int thousandmax = num / 1000;
        char thousandmin = numbertext.charAt(numbertext.length() - 4);

        System.out.println("Всего тысяч в числе: " + thousandmax);
        System.out.println("Четвертая цифра справа в десятичном представлении числа: " + thousandmin);

        number.close();
	}

}

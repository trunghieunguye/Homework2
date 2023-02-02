package Homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Phuong trinh co dang ax^2+bx+c=0 voi : ");
        System.out.print("a = ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("b = ");
        double b = new Scanner(System.in).nextDouble();
        System.out.print("c = ");
        double c = new Scanner(System.in).nextDouble();
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            System.out.println("Phuong trinh vo nghiem");
        }else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem duy nhat la " + (-b / 2 * a));
        }else {
            System.out.println("Phuong trinh co hai nghiem phan biet la " + ((-b+ Math.sqrt(delta))/(2*a)) + " va " + ((-b- Math.sqrt(delta))/(2*a)));
        }


    }
}

package Homework2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.print("nhap chieu dai : ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("nhap chieu rong : ");
        double b = new Scanner(System.in).nextDouble();
        double p = (a+b)*2;
        double s = a * b;
        System.out.println("Chu vi hinh chu nhat la "+ p);
        System.out.println("Dien tich hinh chu nhat la "+ s);

    }
}

package Homework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws ParseException {
        System.out.print("Nhap ngay thang nam sinh : ");
        String birthday = new Scanner(System.in).nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date ngaySinh = simpleDateFormat.parse(birthday);
        Date ngayHientai = new Date();
        int age = ngayHientai.getYear() - ngaySinh.getYear();
        System.out.println("Tuoi cua ban la " + age);




    }
}

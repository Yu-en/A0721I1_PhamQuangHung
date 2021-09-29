package ss1_introduction_to_java.thuc_hanh.kiem_tra_nam_nhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Nhap so nam");
        year=sc.nextInt();
        if ((year%4==0 && year%100!=0)||(year%100==0 && year%400==0 )){
            System.out.println(year +" la nam nhuan");
        } else {
            System.out.println(year+" khong phai nam nhuan");
        }
    }
}

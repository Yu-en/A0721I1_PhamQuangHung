package ss1_introduction_to_java.bai_tap.ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double vnd=23000;
        double usd;
        System.out.println("Enter USD: ");
        usd= sc.nextDouble();
        double rate= usd*23000;
        System.out.println("VND = "+rate);
    }
}

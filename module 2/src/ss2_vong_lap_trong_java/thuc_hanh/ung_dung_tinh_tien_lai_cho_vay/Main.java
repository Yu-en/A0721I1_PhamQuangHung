package ss2_vong_lap_trong_java.thuc_hanh.ung_dung_tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double money=1.0;
        int month=1;
        double interestRate=1.0;
        System.out.println("Tien dau tu: ");
        money=sc.nextDouble();
        System.out.println("So thang gui: ");
        month=sc.nextInt();
        System.out.println("Lai suat hang nam: ");
        interestRate=sc.nextDouble();
        double totalInterest=0;
        for (int i=0;i<month;i++){
            totalInterest+=money*(interestRate/100)/12*month;
        }
        System.out.println("Lai suat = "+totalInterest);
    }
}

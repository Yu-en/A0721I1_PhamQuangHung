package ss2_vong_lap_trong_java.bai_tap.hien_thi_cac_so_nguyen_to_nho_hon_100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so nguyen to can kiem tra");
        number=sc.nextInt();
        if (number<2){
            System.out.println("khong phai so nguyen to");
        }
        for ( number=1;number<100;++number){
            int count=0;
            for (int i=2;i<=Math.sqrt(number);i++){
                if (number%i==0){
                    count++;
                }
            }
            if (count ==0 && number >1)
                System.out.println("Cac so nguyen to nho hon 100 la: "+number);
        }
    }
}

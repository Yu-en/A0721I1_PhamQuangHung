package ss2_vong_lap_trong_java.thuc_hanh.tim_uoc_so_chung_lon_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Input a: ");
        a=sc.nextInt();
        System.out.println("Input b: ");
        b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0) {
            System.out.println("No greatest common factor");
        }else {
            while (a!=b){
                if (a>b){
                    a=a-b;
                }else {
                    b=b-a;
                }
            }
            System.out.println("Greatest common factor: "+a);
        }
    }
}

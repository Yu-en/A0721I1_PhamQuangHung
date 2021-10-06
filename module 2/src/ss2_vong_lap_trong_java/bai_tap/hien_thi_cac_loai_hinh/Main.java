package ss2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice=-1;
        int height;
        int width;
        Scanner sc=new Scanner(System.in);
        while (choice!=4){
            System.out.println("Menu: ");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Input height: ");
                    height=sc.nextInt();
                    System.out.println("Input width: ");
                    width=sc.nextInt();
                    for(int i = 1; i <= height; i++){
                        for(int j = 1; j <= width; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                   break;
                case 2:
                    System.out.println("Input height: ");
                    height=sc.nextInt();
                    for (int i = 1; i <= height; ++i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                    for (int i = height; i >= 1; --i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Input height");
                    height=sc.nextInt();
                    for(int i = 1; i <= height; i++) {
                        for(int j = 1; j <= height-i; j++) {
                            System.out.print("  ");
                        }
                        for(int k = 1; k <= 2*i-1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}

package ss1_introduction_to_java.bai_tap.ung_dung_doc_so_thanh_chu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to read: ");
        int number=sc.nextInt();
        if (number>=0 && number<10){
            switch (number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                case 2:
                    System.out.println();
            }
        }
    }
}

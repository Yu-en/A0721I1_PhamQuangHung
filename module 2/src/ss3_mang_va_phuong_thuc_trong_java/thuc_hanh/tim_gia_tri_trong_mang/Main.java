package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh.tim_gia_tri_trong_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] Students={"hung","phuong","nhi","hoa","huong"};
        Scanner sc=new Scanner(System.in);
        String input_name=sc.nextLine();
        boolean isExist=false;
        for (int i = 0; i < Students.length; i++) {
            if (Students[i].equals(input_name)){
                System.out.println("Position of the student in list "+input_name+" is "+(i+1));
                isExist=true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found "+input_name+" in list");
        }
    }
}

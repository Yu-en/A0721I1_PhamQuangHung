package ss3_mang_va_phuong_thuc_trong_java.bai_tap.gop_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar1;
        int ar2;
        int arr1[];
        int arr2[];
        int arr3[];
        System.out.println("Nhap so phan tu mang 1");
        ar1=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so phan tu mang 2");
        ar2=Integer.parseInt(sc.nextLine());
        arr1=new int[ar1];
        arr2=new int[ar2];
        String text1 = "";
        String text2="";
        String text3="";
        for (int i=0;i<arr1.length;i++){
            System.out.println("Nhap phan tu thu "+i+" cua mang 1");
            arr1[i]=Integer.parseInt(sc.nextLine());
            text1= (text1 +arr1[i]+"  ");
        }
        for (int i=0;i<arr2.length;i++){
            System.out.println("Nhap phan tu thu "+i+" cua mang 2");
            arr2[i]=Integer.parseInt(sc.nextLine());
            text2=(text2+arr2[i]+"  ");
        }
        arr3=new int[arr1.length+arr2.length];
        for (int i=0;i<arr3.length;i++){
            if (i<arr1.length){
                arr3[i]=arr1[i];
                text3=text3+arr3[i]+"  ";
            }else {
                arr3[i]=arr2[(i-(arr1.length))];
                text3=text3+arr3[i]+"  ";
            }
        }
        System.out.println("Arr1: "+text1);
        System.out.println("Arr3: "+text2);
        System.out.println("Arr2: "+text3);
    }
}

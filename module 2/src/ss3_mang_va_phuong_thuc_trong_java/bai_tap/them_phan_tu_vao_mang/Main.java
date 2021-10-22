package ss3_mang_va_phuong_thuc_trong_java.bai_tap.them_phan_tu_vao_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so can` chen`: ");
        int num=sc.nextInt();
        System.out.println("Nhap vi tri can chen`: ");
        int index=sc.nextInt();
        if (index <= 1 || index >= arr.length-1){
            System.out.println("Khong the chen`!!");
        }else {
            for (int i = 0; i < arr.length; i++) {
                if (index == i) {
                    for (int j = arr.length - 1; j >= i + 1; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[i] = num;
                }
            }

        }
        System.out.println("Mang sau khi them phan tu "+num+" vao vi tri "+index);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"   ");
        }
    }
}

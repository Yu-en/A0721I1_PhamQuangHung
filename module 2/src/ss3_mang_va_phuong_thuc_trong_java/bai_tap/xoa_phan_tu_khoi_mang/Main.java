package ss3_mang_va_phuong_thuc_trong_java.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        int A[]={1,2,3,4,5};
        System.out.println("Nhập số nguyên cần xóa: ");
        int k = scanner.nextInt();
        for (c = i = 0; i < A.length; i++) {
            if (A[i] != k) {
                A[c] = A[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}

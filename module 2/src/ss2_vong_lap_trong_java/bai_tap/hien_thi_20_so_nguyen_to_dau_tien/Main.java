package ss2_vong_lap_trong_java.bai_tap.hien_thi_20_so_nguyen_to_dau_tien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int status = 1;
        int N = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("So luong so nguyen to can hien thi:");
        number = scanner.nextInt();
        if (number >= 1)
        {
            System.out.println(number+" so nguyen to can hien thi la:");
        }
        for ( int i = 2 ; i <=number ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(N) ; j++ )
            {
                if ( N%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(N);
                i++;
            }
            status = 1;
            N++;
        }
    }
}

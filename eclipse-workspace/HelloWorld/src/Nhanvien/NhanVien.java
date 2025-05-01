package Nhanvien;
import java.util.Scanner;

public class NhanVien {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] danhSachNhanVien = new String[n];
     
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên nhân viên thứ " + (i + 1) + ": ");
            danhSachNhanVien[i] = scanner.nextLine();
        }
       
        System.out.println("Danh sách nhân viên:");
        for (String ten : danhSachNhanVien) {
            System.out.println("- " + ten);
        }

        scanner.close();
    }
}


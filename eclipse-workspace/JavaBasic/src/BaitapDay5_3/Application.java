package BaitapDay5_3;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("===== QUẢN LÝ NHÂN VIÊN THEO PHÒNG BAN =====");
        System.out.println("Chọn phòng ban:");
        System.out.println("1. Developer");
        System.out.println("2. Tester");
        System.out.println("3. BA");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập số lượng nhân viên: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        Employee[] danhSach = new Employee[soLuong];

        for (int i = 0; i < soLuong; i++) {
            System.out.println("\n--- Nhập thông tin cho nhân viên thứ " + (i + 1) + " ---");
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Mã NV: ");
            String maNV = sc.nextLine();
            System.out.print("SĐT: ");
            String sdt = sc.nextLine();

            Employee nv;
            switch (choice) {
                case 1:
                    nv = new Developer();
                    break;
                case 2:
                    nv = new Tester();
                    break;
                case 3:
                    nv = new Ba();
                    break;
                default:
                    System.out.println("Thông tin không hợp lệ. Kết thúc chương trình.");
                    return;
            }

            nv.setHoTen(hoTen);
            nv.setMaNV(maNV);
            nv.setSdt(sdt);
            danhSach[i] = nv;
        }

        System.out.println("\n===== DANH SÁCH NHÂN VIÊN =====");
        for (Employee nv : danhSach) {
            nv.inThongTin();
        }

        sc.close();
    }


	}



package BaitapDay5_1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron hinhTron = new HinhTron(5);
        hinhTron.setTenHinh("Hình Tròn");
        System.out.println("Tên: " + hinhTron.getTenHinh());
        hinhTron.tinhDienTich();

        HinhChuNhat hinhCN = new HinhChuNhat(4, 6);
        hinhCN.setTenHinh("Hình Chữ Nhật");
        System.out.println("Tên: " + hinhCN.getTenHinh());
        hinhCN.tinhDienTich();
    }
	}



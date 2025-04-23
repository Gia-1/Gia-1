package Day_4;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HinhTron ht = new HinhTron();
	        ht.setTenHinh("Tròn 1");
	        ht.banKinh = 5;
	        ht.tinhDienTich();

	        System.out.println("====================");

	        HinhChuNhat hcn = new HinhChuNhat();
	        hcn.setTenHinh("Chữ nhật 1");
	        hcn.chieuDai = 4;
	        hcn.chieuRong = 6;
	        hcn.tinhDienTich();
	    }
	
	}



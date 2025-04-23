package day5_2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Giaovien gv1 = new Giaovien();
		gv1.hoten = "Nguyễn Văn A";
		gv1.tuoi = 30;
		gv1.maGv = "Gv_NguyenVanA";
		gv1.soNamGiangDay = 10;
		gv1.diAn();
		gv1.diChoi();
		 gv1.inSoNamKinhNghiem();

	        System.out.println("======================================");

	        Sinhvien sv1 = new Sinhvien();
	        sv1.hoten = "Nguyễn Văn B";
	        sv1.tuoi = 19;
	        sv1.soTinChiTichLuy = 15;
	        sv1.inThongTin();
	        sv1.diAn();
	        sv1.diChoi();
	        sv1.diHoc();
	}
	}
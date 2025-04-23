package BaitapDay5_1;

public class HinhTron extends HinhHoc {
	 public int banKinh;

	    public HinhTron(int banKinh) {
	        this.banKinh = banKinh;
	    }

	    @Override
	    public void tinhDienTich() {
	        double dienTich = 3.14 * banKinh * banKinh;
	        System.out.println("Diện tích hình tròn: " + dienTich);
	    }
	}



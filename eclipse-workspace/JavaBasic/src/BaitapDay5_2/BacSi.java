package BaitapDay5_2;

public class BacSi {
	  public void tinhLuong(double luongCoBan, double heSoLuong) {
	        double luong = luongCoBan * heSoLuong;
	        System.out.println("Lương: " + luong);
	    }

	    public void tinhLuong(double luongCoBan, double heSoLuong, int namKinhNghiem) {
	        double luong = luongCoBan * heSoLuong * (1 + namKinhNghiem * 0.05);
	        System.out.println("Lương: " + luong);
	    }

	    public void tinhLuong(double luongCoBan, double heSoLuong, int namKinhNghiem, int loai) {
	        double phuCap = 0;
	        if (loai == 1) {
	            phuCap = luongCoBan * 0.2;
	        } else if (loai == 2) {
	            phuCap = luongCoBan * 0.45;
	        }
	        double luong = luongCoBan * heSoLuong * (1 + namKinhNghiem * 0.05) + phuCap;
	        System.out.println("Lương: " + luong);
	    }

	    public static void main(String[] args) {
	        BacSi bs = new BacSi();
	        double luongCoBan = 10000000;

	        bs.tinhLuong(luongCoBan, 2.0);
	        bs.tinhLuong(luongCoBan, 2.0, 5);
	        bs.tinhLuong(luongCoBan, 2.0, 5, 1);
	        bs.tinhLuong(luongCoBan, 2.0, 5, 2);
	    }
	}



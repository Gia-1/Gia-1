package BaitapDay5_1;

public class HinhChuNhat extends HinhHoc{
	 public int chieuDai;
	    public int chieuRong;

	    public HinhChuNhat(int chieuDai, int chieuRong) {
	        this.chieuDai = chieuDai;
	        this.chieuRong = chieuRong;
	    }

	    @Override
	    public void tinhDienTich() {
	        int dienTich = chieuDai * chieuRong;
	        System.out.println("Diện tích hình chữ nhật: " + dienTich);
	    }

}

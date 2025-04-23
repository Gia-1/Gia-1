package Day_4;

public class HinhTron  extends HinhHoc {
	public int banKinh;

    @Override
    public void tinhDienTich() {
        double S = 3.14 * banKinh * banKinh;
        System.out.println("Diện tích hình " + getTenHinh() + " là: " + S);
    }
}



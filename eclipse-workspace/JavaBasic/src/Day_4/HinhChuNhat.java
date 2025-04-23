package Day_4;

public class HinhChuNhat extends HinhHoc {
    public int chieuDai;
    public int chieuRong;

    @Override
    public void tinhDienTich() {
        int S = chieuDai * chieuRong;
        System.out.println("Diện tích hình " + getTenHinh() + " là: " + S);
    }
}



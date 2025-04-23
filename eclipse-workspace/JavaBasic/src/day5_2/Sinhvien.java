package day5_2;

public class Sinhvien extends Nguoi {
    public int soTinChiTichLuy;

    @Override
    public void diChoi() {
        System.out.println("Đi chơi khi nào thích");
    }

    @Override
    public void diAn() {
        System.out.println("Ăn trái cây");
    }

    public void diHoc() {
        System.out.println("Sinh viên đi học mỗi sáng");
    }
}


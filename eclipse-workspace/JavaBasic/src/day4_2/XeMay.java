package day4_2;

public class XeMay {
	public static void main(String[] args) {
        Xe xeMay = new Xe();
        xeMay.setTenXe("Honda Winner");
        xeMay.setLoaiXe("Xe Máy");
        xeMay.setVanTocMax(150);

        System.out.println("Xe Máy:");
        System.out.println("Tên xe: " + xeMay.getTenXe());
        System.out.println("Loại xe: " + xeMay.getLoaiXe());
        System.out.println("Vận tốc tối đa: " + xeMay.getVanTocMax() + " km/h");
    }
}



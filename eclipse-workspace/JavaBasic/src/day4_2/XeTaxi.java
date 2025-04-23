package day4_2;

public class XeTaxi {
	  public static void main(String[] args) {
	        Xe xeTaxi = new Xe();
	        xeTaxi.setTenXe("Toyota Vios");
	        xeTaxi.setLoaiXe("Taxi");
	        xeTaxi.setVanTocMax(120);

	        System.out.println("Xe Taxi:");
	        System.out.println("Tên xe: " + xeTaxi.getTenXe());
	        System.out.println("Loại xe: " + xeTaxi.getLoaiXe());
	        System.out.println("Vận tốc tối đa: " + xeTaxi.getVanTocMax() + " km/h");
	    }
	}



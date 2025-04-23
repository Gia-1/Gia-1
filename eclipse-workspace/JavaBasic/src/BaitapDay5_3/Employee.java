package BaitapDay5_3;

public abstract class Employee {
	 private String hoTen;
	    private String maNV;
	    private String sdt;

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public void setMaNV(String maNV) {
	        this.maNV = maNV;
	    }

	    public void setSdt(String sdt) {
	        this.sdt = sdt;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public String getMaNV() {
	        return maNV;
	    }

	    public String getSdt() {
	        return sdt;
	    }

	    public abstract void inThongTin();
	}



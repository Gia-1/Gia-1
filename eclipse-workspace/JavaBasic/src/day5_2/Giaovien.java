package day5_2;

public class Giaovien extends Nguoi {
	public String maGv;
	public int soNamGiangDay;
	
	@Override
	public void diChoi()
	{
		System.out.println("Giáo viên đi chơi vào ngày nghỉ và có tiền");
	}
	public void inSoNamKinhNghiem()
	{
		 System.out.println("Kinh nghiệm của giáo viên " + maGv + " là " + soNamGiangDay + " năm.");

	}

}

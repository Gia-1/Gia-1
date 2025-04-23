package JavaBasic;

public class MainArray {
	public static void main(String[] args) {
		// khởi tạo Mảng nặc danh 
        int[] c = {1,2,3,4,5,6};
        System.out.println("Mảng c: ");
        for (int i=0; i < c.length; i++) {
        	 System.out.print(c[i] + " ");
        }
        System.out.println(); // Xuống dòng

        // 2. Khởi tạo mảng bằng vòng lặp for, mảng có độ dài là 10
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            b[i] = i + 1;
        }
        System.out.println("Mảng b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println(); // Xuống dòng

        // 3. Gọi hàm in mảng arr
        printArray();
    }

    public static void printArray() {
        System.out.println("=> Cho dãy số ban đầu là: 5, 1, 4, 2, 8, 7, 3, 0, 6 ==");
        int[] arr = {5, 1, 4, 2, 8, 7, 3, 0, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
        
	

	

package day4;

public class Developer {
    public static void main(String[] args) {
        Employee dev1 = new Employee("01", "GấuMập", "2000");
        
        Employee dev2 = new Employee("02", "GấuBéo", "2500");
        System.out.println("== Developer 1 ==");
        System.out.println("ID: " + dev1.getEmployee_id());
        System.out.println("Tên: " + dev1.getEmployee_name());
        System.out.println("Lương: " + dev1.getEmployee_salary());

        System.out.println("\n== Developer 2 ==");
        System.out.println("ID: " + dev2.getEmployee_id());
        System.out.println("Tên: " + dev2.getEmployee_name());
        System.out.println("Lương: " + dev2.getEmployee_salary());
    }
}

// Việc không cho phép thay đổi lương từ bên ngoài package là một kỹ thuật tốt để bảo vệ dữ liệu. Chỉ những ai có quyền mới có thể chỉnh sửa được lương 

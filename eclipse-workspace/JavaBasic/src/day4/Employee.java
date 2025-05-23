package day4;

public class Employee {
    private String employee_id;
    private String employee_name;
    private String employee_salary;

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }
    public Employee(String id, String name, String salary) {
        this.employee_id = id;
        this.employee_name = name;
        this.employee_salary = salary;
    }
}


package day5_3;

public class Application {

    public static void main(String[] args) {
        Adder myAdd = new Adder();

        System.out.println(myAdd.Add(1, 56789));             
        System.out.println(myAdd.Add(324, 600, 846));         
        System.out.println(myAdd.Add(324.87, 600.56));       
    }
}


package main;

public class Person {
    public static void main(String[] args) {
        System.out.println("Name: Auto class thang 4");
        System.out.println("Phone number: 123456789");
        printLargerNumber(334, 3);
    }
    public static void printLargerNumber(float nb1, int nb2) {
        if (nb1 > nb2) {
            System.out.println("So lon hon: " + nb1);
        } else {
            System.out.println("So lon hon la: " + nb2);
        }
    } 
    public static void printLargerNumber(double nb1, double nb2) {
        if (nb1 > nb2) {
            System.out.println("Larger number is: " + nb1);
        } else {
            System.out.println("Larger number is: " + nb2);
        }
    }
}

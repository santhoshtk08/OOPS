public class Calculator {

    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5, 10));
        System.out.println(calculator.add(5, 10, 15)); 
        System.out.println(calculator.add(2.5, 3.5)); 

    }
}

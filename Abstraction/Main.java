
abstract class Shape {
    abstract double Area();
}

class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    double Area() {
        return length * length;
    }
}

public class Main {
    public static void main(String[] args) {
        Square sq = new Square(5);
        System.out.println(sq.Area());
    }
}

class Human {
    private String name;
    private int age;

    public void getName(String name) {
        this.name = name;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public String setName() {
        return name;
    }

    public int setAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.getAge(22);
        obj.getName("Allen");

        System.out.println(obj.setAge() + " " + obj.setName());

    }
}
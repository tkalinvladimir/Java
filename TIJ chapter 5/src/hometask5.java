public class hometask5 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark('1');
        dog.bark(1);
        dog.bark("1");

    }
}

class Dog {

    public void bark(int i) {
        System.out.println("Гав - гав инт " + i);
    }
    public void bark(String i) {
        System.out.println("Гав - гав стринг " + i);
    }
    public void bark(char i) {
        System.out.println("Гав - гав чар " + i);
    }
}
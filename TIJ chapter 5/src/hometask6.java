public class hometask6 {

    public static void main(String[] args) {

        Dog2 dog = new Dog2();
        dog.bark(1, "str");
        dog.bark("str" ,1);

    }
}

class Dog2 {

    public void bark(int i, String j) {
        System.out.println("Гав - гав инт и стринг " + i + " " + j);
    }
    public void bark(String i, int j) {
        System.out.println("Гав - гав стринг и инт " + i + " " + j);
    }
}
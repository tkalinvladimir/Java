public class test_this2 {
    public static void main(String[] args) {
        System.out.println("Новая персона - съесть яблоко - новое яблоко");
        new Person().eatApple(new Apple());
    }
}

class Person {
    Person() {
        System.out.println("Создаем человека");
    }

    void eatApple(Apple apple) {
        System.out.println("Я человек, прошу помыть яблоко");
        Apple washedApple = apple.getWashed();
        System.out.println("Я человек, я захавал яблоко");
    }
}

class Apple {
    Apple() {
        System.out.println("Создаем яблоко");
    }

    Apple getWashed() {
        System.out.println("Я яблоко, я хочу чтоб меня помыли");
        return WashingMachine.wash(this);
    }
}

class WashingMachine {
    WashingMachine() {
        System.out.println("Создаем мойку");
    }

    static Apple wash(Apple apple) {
        System.out.println("Я мойка, я мою яблоко");
        return apple;
    }
}
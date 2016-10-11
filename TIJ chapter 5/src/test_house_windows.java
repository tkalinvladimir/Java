public class test_house_windows {

    public static void main(String[] args) {
        House h = new House();
        h.f();
    }

}


class House {
    Window w1 = new Window(1);    
    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    public void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}

class Window {
    Window (int count) {
        System.out.println("Window  ("+count+")");
    }
}
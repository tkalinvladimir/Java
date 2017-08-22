public class ex18 {
    static int x = 0; // сюда зайддет только при комплияции
    final int y = x++; // сюда зайдет при создании объекта
    final static int z = x++; // сюда зайддет только при комплияции

    public String toString() {
        return "x: " + x + " y: " + y + " z: " + z;
    }


    public static void main(String[] args)
    {
        // во время компиляции х = 0 и з = 0
        // потом х = 1


        ex18 ex18_obj = new ex18();
        // х = 2, у = 1, з = 0
        System.out.println(ex18_obj);
        // теперь х = 2


        ex18 ex18_obj2 = new ex18();
        // х = 3 потому что в з не заходит
        System.out.println(ex18_obj2);

    }
}

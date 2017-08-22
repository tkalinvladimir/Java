
class Art{
    Art(){System.out.println("Конструктор Art");}
}

class Drawing extends  Art{
    Drawing(){System.out.println("Конструктор Drawing");}
}

public class ex3 extends Drawing{
   // public ex3(){System.out.println("Конструктор ex3");}
    public static void main(String args[])
    {
        ex3 ex3= new ex3();
    }
}

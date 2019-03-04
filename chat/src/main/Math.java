package main;

import java.util.logging.LogManager;
import org.apache.log4j.*;

public class Math {
    private int a,b;

    public Math(int a, int b) {
        this.a = a;
        this.b = b;
        Logger logger = LogManager.getLogger("123");
    }

    public int getSum() {
        return this.a+this.b;
    }

}

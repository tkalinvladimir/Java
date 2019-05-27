import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
  public static final Logger LOGGER = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        LOGGER.info("Начало работы");

        try {
            LOGGER.warn("деление на ноль");
            System.out.println(12/0);
        } catch (ArithmeticException e) {
            LOGGER.error("Ошибка");
        }


    }
}

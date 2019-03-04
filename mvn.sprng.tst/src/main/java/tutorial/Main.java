package tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tutorial.config.Tutorial1Config;
import tutorial.services.DummyService;
import tutorial.services.DummyServiceImpl;

//@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // w/o spring
        DummyService dummyService = new DummyServiceImpl();
        System.out.println(" DummyService returned: "+dummyService.test());
        // spring
        //ApplicationContext ctx = new AnnotationConfigApplicationContext("tutorial");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Tutorial1Config.class);
        System.out.println(" Spring Tutorial 1: Hello World config within this class ");
        DummyService dummyService1 = (DummyService) ctx.getBean("dummyService");
        DummyService dummyService2 = (DummyService) ctx.getBean(DummyService.class);
        System.out.println(" DummyService returned: "+dummyService.test() + ";   2: "+dummyService2.test());

      //  ConfigurableApplicationContext ctx2 = SpringApplication.run(Main.class, args);
      //  System.out.println(" Spring Tutorial 1: Hello World with Spring Boot. ");
      //  DummyService dummyService3 = (DummyService) ctx2.getBean(DummyService.class);
      //  System.out.println(" DummyService returned: "+dummyService3.test());
    }
}

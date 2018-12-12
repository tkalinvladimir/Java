package org.tkalinvladimir.animals.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tkalinvladimir.animals.WeekDay;
import org.tkalinvladimir.animals.days.*;
import org.tkalinvladimir.animals.entities.Cat;
import org.tkalinvladimir.animals.entities.Dog;
import org.tkalinvladimir.animals.entities.Parrot;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
public class MyConfig {
    /*@Bean
    public Cat getCat() {
        return new Cat();
    }*/
    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }
    @Bean
    public Dog getDog() {
        return new Dog();
    }
    @Bean("parrot-kesha")
    public Parrot getParrot() {
        return new Parrot();
    }
    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();
        }
    }
}

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        //Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from Spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //***CricketCoach
        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        //Call methods on the bean
//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(theCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        //Close the context
        context.close();
    }
}

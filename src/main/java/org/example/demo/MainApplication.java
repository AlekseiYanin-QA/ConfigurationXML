package org.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        // Создание ApplicationContext на основе XML конфигурации
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получаем экземпляры бинов для проверки их создания
        ServiceB primaryServiceB = context.getBean("primaryServiceB", ServiceB.class);
        ServiceB secondaryServiceB = context.getBean("secondaryServiceB", ServiceB.class);
        ServiceC serviceC = context.getBean("serviceC", ServiceC.class);
        RequestIdGenerator requestIdGenerator = context.getBean("requestIdGenerator", RequestIdGenerator.class);

        // Выполняем методы, чтобы продемонстрировать, что бины созданы и работают
        primaryServiceB.incrementCounter();
        secondaryServiceB.incrementCounter();
        System.out.println("Request ID from ServiceC: " + serviceC.getRequestId());

        // Печатаем информацию о генераторе ID
        System.out.println("Request ID Generator created: " + requestIdGenerator);
    }
}

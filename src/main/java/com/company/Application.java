package com.company;

import com.company.tasks.Print;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Task:
 * Создать проект для планирования задач.
 * Пусть будет бин, который делает банковскую операцию из списка задач
 * (задача - это Java класс). Список задач будет задаваться в
 * конфигурации. Использовать Spring, использовать xml конфигурацию.
 *
 *  + Добавить в проект АОП и реализовать с помощью АОП вывод текущего времени перед выполнением задачи и после выполнения задачи.
* */

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Print print = (Print) applicationContext.getBean("printBuy");
        print.printTask();
        System.out.println("\n");
        print = (Print) applicationContext.getBean("printBank");
        print.printTask();

    }
}

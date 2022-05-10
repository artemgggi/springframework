package ru.artemgggi.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseContextWithSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        /*
        context.register(Store.class);
        context.register(StartUI.class);
        */
        context.scan("ru.artemgggi.spring");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Artem Ivanov");
        ui.add("Ivan ivanov");
        ui.print();
    }
}

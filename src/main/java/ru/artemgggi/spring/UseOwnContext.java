package ru.artemgggi.spring;

public class UseOwnContext {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Artem Ivanov");
        ui.add("Ivan ivanov");
        ui.print();
    }
}

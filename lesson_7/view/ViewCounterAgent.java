package view;

import java.util.Scanner;

import model.Model;

public class ViewCounterAgent {
    private Model model;

    public ViewCounterAgent(Model model) {
        this.model = model;
    }

    public void print() {
        System.out.println("\nВыберите необходимое действие:\n");
        System.out.println("1 - Посмотреть список контрагентов.\n"
                + "2 - Найти контрагента по названию. Посмотреть подробную информацию о нём.\n"
                + "3 - Добавить контрагента.\n" + "4 - Удалить контрагента.\n"
                + "5 - Добавить новый способ связаться с контрагентом.\n"
                + "6 - Удалить способ связаться с контрагентом.\n");
        System.out.println("Введите число:");
        Scanner viewScanner = new Scanner(System.in);
        int viewChoice = viewScanner.nextInt();
        boolean flag = false;
        while (!flag) {
            switch (viewChoice) {
                case 1:
                    model.show();
                    break;
                case 2:
                    model.findAgentNameInput();
                    break;
                case 3:
                    model.addAgent();
                    break;
                case 4:
                    model.removeAgent();
                    break;
                case 5:
                    model.addContact();
                    break;
                case 6:
                    model.removeContact();
                    break;
            }
            flag = true;
        }
        print();
        viewScanner.close();
    }

}

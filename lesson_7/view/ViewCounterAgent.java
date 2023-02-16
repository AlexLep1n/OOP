package view;

import java.util.Scanner;

import model.Model;

public class ViewCounterAgent {
    private Model model;

    public ViewCounterAgent(Model model) {
        this.model = model;
    }

    public void menu() {
        System.out.println("\nВыберите необходимое действие:\n");
        System.out.println("1 - Посмотреть список контрагентов.\n"
                + "2 - Найти контрагента по названию. Посмотреть подробную информацию о нём.\n"
                + "3 - Добавить контрагента.\n"
                + "4 - Удалить контрагента.\n"
                + "5 - Добавить новый способ связаться с контрагентом.\n"
                + "6 - Удалить способ связаться с контрагентом.\n"
                + "7 - Выход.\n");
        System.out.println("Введите число:");
    }

    public void print() {
        Scanner viewScanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            menu();
            int viewChoice = viewScanner.nextInt();
            switch (viewChoice) {
                case 1:
                    System.out.println("\nCписок контрагентов:");
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
                case 7:
                    flag = true;
                    break;
            }
        }
        viewScanner.close();
    }

}

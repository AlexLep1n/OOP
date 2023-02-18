package presenter;

import java.util.Scanner;

import model.Model;
import view.ViewCounterAgent;

public class Presenter {
    private Model model;
    private ViewCounterAgent view;

    public Presenter(Model model, ViewCounterAgent view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner viewScanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            view.printMenu();
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

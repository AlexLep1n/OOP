package model;

import java.util.List;
import java.util.Scanner;

public class Model {
    private List<CounterAgent> agentsList;

    public Model(List<CounterAgent> agentsList) {
        this.agentsList = agentsList;
    }

    public void show() {
        for (CounterAgent counterAgent : agentsList) {
            System.out.println(counterAgent.getName());
        }
    }

    public CounterAgent findAgent(String agentName) {
        CounterAgent cAgent = new CounterAgent(null, null);
        for (CounterAgent counterAgent : agentsList) {
            if (counterAgent.getName().equals(agentName)) {
                // System.out.println(counterAgent);
                cAgent = counterAgent;
                return counterAgent;
            }
        }
        return cAgent;
    }

    public void addAgent(String agentName) {
        agentsList.add(new CounterAgent(agentName));
        System.out.printf("Контакт %s добавлен!\n", agentName);
    }

    public void removeAgent(String agentName) {
        agentsList.remove(findAgent(agentName));
        System.out.printf("Контакт %s удален!\n", agentName);
    }

    public void addContact() {
        System.out.println("Какому контакту необходимо добавить способ связи?");
        Scanner nameScan = new Scanner(System.in);
        String nameChoice = nameScan.nextLine();
        CounterAgent counterAgent = findAgent(nameChoice);
        System.out.println("Какой способ связи вы хотите добавить?");
        System.out.println("1 - Phone\n" + "2 - VK\n" + "3 - Telegram\n" + "4 - Address\n" + "5 - Email\n");
        Scanner scannerContact = new Scanner(System.in);
        int contactChoice = scannerContact.nextInt();
        System.out.println("Введите данные выбраного способа связи.");
        Scanner scannerConData = new Scanner(System.in);
        String contactData = scannerConData.next();
        switch (contactChoice) {
            case 1:
                counterAgent.getContacts().add(new PhoneNumber("Phone", contactData));
                break;
            case 2:
                counterAgent.getContacts().add(new VK("VK", contactData));
                break;
            case 3:
                counterAgent.getContacts().add(new Telegram("Telegram", contactData));
                break;
            case 4:
                counterAgent.getContacts().add(new Address("Address", contactData));
                break;
            case 5:
                counterAgent.getContacts().add(new Email("Email", contactData));
                break;
        }
        scannerConData.close();
        scannerContact.close();
        nameScan.close();
    }

    public void deleteContact() {
        System.out.println("Какому контакту необходимо удалить способ связи?");
        Scanner nameScan = new Scanner(System.in);
        String nameChoice = nameScan.nextLine();
        CounterAgent counterAgent = findAgent(nameChoice);
        System.out.println("Какой способ связи вы хотите удалить?");
        System.out.println("1 - Phone\n" + "2 - VK\n" + "3 - Telegram\n" + "4 - Address\n" + "5 - Email\n");
        Scanner scannerContact = new Scanner(System.in);
        int contactChoice = scannerContact.nextInt();
        // if (counterAgent.getContacts().contains(contactChoice)) {

        // }
        System.out.println("Введите данные выбраного способа связи.");
        Scanner scannerConData = new Scanner(System.in);
        String contactData = scannerConData.next();
        switch (contactChoice) {
            case 1:
                counterAgent.getContacts().remove(new PhoneNumber("Phone", contactData));
                break;
            case 2:
                counterAgent.getContacts().remove(new VK("VK", contactData));
                break;
            case 3:
                counterAgent.getContacts().remove(new Telegram("Telegram", contactData));
                break;
            case 4:
                counterAgent.getContacts().remove(new Address("Address", contactData));
                break;
            case 5:
                counterAgent.getContacts().remove(new Email("Email", contactData));
                break;
        }
        scannerConData.close();
        scannerContact.close();
        nameScan.close();
    }

}

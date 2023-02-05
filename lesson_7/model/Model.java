package model;

import java.util.LinkedList;
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
                cAgent = counterAgent;
                return counterAgent;
            }
        }
        return cAgent;
    }

    public void findAgentNameInput() {
        System.out.println("Введите имя контрагента.");
        Scanner findScanner = new Scanner(System.in);
        String agentName = findScanner.next();
        CounterAgent cAgent = findAgent(agentName);
        System.out.println("\nИскомый контрагент:");
        System.out.println(cAgent);
        // findScanner.close();
    }

    public void addAgent() {
        System.out.println("Введите имя контрагента, которого необходимо добавить.");
        Scanner addScanner = new Scanner(System.in);
        String agentName = addScanner.next();
        List<Contact<String>> contacts = new LinkedList<>();
        if (!(agentsList.contains(findAgent(agentName)))) {
            agentsList.add(new CounterAgent(agentName, contacts));
            System.out.printf("Контрагент %s добавлен!\n", agentName);
        } else {
            System.out.println("Контрагент с таким именем уже существует!");
        }
        // addScanner.close();
    }

    public void removeAgent() {
        System.out.println("Введите имя контрагента, которого необходимо удалить.");
        Scanner removeScanner = new Scanner(System.in);
        String agentName = removeScanner.next();
        if (agentsList.contains(findAgent(agentName))) {
            agentsList.remove(findAgent(agentName));
            System.out.printf("Контрагент %s удален!\n", agentName);
        } else {
            System.out.println("Такого контрагента нет!");
        }
        // removeScanner.close();
    }

    public void addContact() {
        System.out.println("Какому контрагенту необходимо добавить способ связи?");
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
                System.out.println("Phone добавлен контрагенту!");
                break;
            case 2:
                counterAgent.getContacts().add(new VK("VK", contactData));
                System.out.println("VK добавлен контрагенту!");
                break;
            case 3:
                counterAgent.getContacts().add(new Telegram("Telegram", contactData));
                System.out.println("Telegram добавлен контрагенту!");
                break;
            case 4:
                counterAgent.getContacts().add(new Address("Address", contactData));
                System.out.println("Address добавлен контрагенту!");
                break;
            case 5:
                counterAgent.getContacts().add(new Email("Email", contactData));
                System.out.println("Email добавлен контрагенту!");
                break;
        }
        // scannerConData.close();
        // scannerContact.close();
        // nameScan.close();
    }

    public void removeContact() {
        System.out.println("Какому контрагенту необходимо удалить способ связи?");
        Scanner nameScanRemove = new Scanner(System.in);
        String nameChoiceRemove = nameScanRemove.next();
        CounterAgent counterAgent = findAgent(nameChoiceRemove);
        System.out.println("Какой способ связи вы хотите удалить?");
        System.out.println("1 - Phone\n" + "2 - VK\n" + "3 - Telegram\n" + "4 - Address\n" + "5 - Email\n");
        Scanner scannerContactRemove = new Scanner(System.in);
        int contactChoice = scannerContactRemove.nextInt();
        switch (contactChoice) {
            case 1:
                for (int i = 0; i < counterAgent.getContacts().size(); i++) {
                    if (counterAgent.getContacts().get(i).getContactLabel().equals("Phone")) {
                        counterAgent.getContacts().remove(counterAgent.getContacts().get(i));
                        System.out.println("Phone удален у контрагента!");
                    }
                }
                break;
            case 2:
                for (int i = 0; i < counterAgent.getContacts().size(); i++) {
                    if (counterAgent.getContacts().get(i).getContactLabel().equals("VK")) {
                        counterAgent.getContacts().remove(counterAgent.getContacts().get(i));
                        System.out.println("VK удален у контрагента!");
                    }
                }
                break;
            case 3:
                for (int i = 0; i < counterAgent.getContacts().size(); i++) {
                    if (counterAgent.getContacts().get(i).getContactLabel().equals("Telegram")) {
                        counterAgent.getContacts().remove(counterAgent.getContacts().get(i));
                        System.out.println("Telegram удален у контрагента!");
                    }
                }
                break;
            case 4:
                for (int i = 0; i < counterAgent.getContacts().size(); i++) {
                    if (counterAgent.getContacts().get(i).getContactLabel().equals("Address")) {
                        counterAgent.getContacts().remove(counterAgent.getContacts().get(i));
                        System.out.println("Address удален у контрагента!");
                    }
                }
                break;
            case 5:
                for (int i = 0; i < counterAgent.getContacts().size(); i++) {
                    if (counterAgent.getContacts().get(i).getContactLabel().equals("Email")) {
                        counterAgent.getContacts().remove(counterAgent.getContacts().get(i));
                        System.out.println("Email удален у контрагента!");
                    }
                }
                break;
            default:
                System.out.println("Выбранного способа связи нет у данного контрагента!");
                break;
        }
        // scannerContactRemove.close();
        // nameScanRemove.close();
    }

}

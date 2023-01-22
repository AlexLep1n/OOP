package model;

import java.util.List;

public class CounterAgent {
    private String name;
    private List<Contact<String>> contacts;

    public CounterAgent(String name, List<Contact<String>> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public CounterAgent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Contact<String>> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return name + ":\n" + contacts + "\n";
    }

}

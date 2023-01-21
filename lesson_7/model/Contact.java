package model;

import java.util.LinkedList;
import java.util.List;

public abstract class Contact<T1> {
    private String contactLabel;
    private List<T1> contactList = new LinkedList<>();
    private T1 contactData;

    public Contact(String contactLabel, T1 contactData) {
        this.contactLabel = contactLabel;
        this.contactData = contactData;
        contactList.add(contactData);
    }

    @Override
    public String toString() {
        return "Contact " + contactLabel + ", " + contactList;
    }

}

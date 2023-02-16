package model;

import java.util.LinkedList;
import java.util.List;

public abstract class ContactAbstract implements Contact<String> {
    private String contactLabel;
    private List<String> contactList = new LinkedList<>();
    private String contactData;

    public ContactAbstract(String contactLabel, String contactData) {
        this.contactLabel = contactLabel;
        contactList.add(contactData);
    }

    @Override
    public String getContactLabel() {
        return contactLabel;
    }

    @Override
    public List<String> getContactList() {
        return contactList;
    }

    @Override
    public String getContactData() {
        return contactData;
    }

    @Override
    public String toString() {
        return contactLabel + ": " + contactList.iterator().next();
    }
}

package model;

import java.util.LinkedList;
import java.util.List;

public class VK implements Contact<String> {
    private String contactLabel;
    private List<String> contactList = new LinkedList<>();
    private String contactData;

    public VK(String contactLabel, String contactData) {
        this.contactLabel = contactLabel;
        this.contactData = contactData;
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

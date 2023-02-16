package model;

import java.util.List;

public interface Contact<T> {

    public T getContactLabel();

    public List<T> getContactList();

    public T getContactData();

}

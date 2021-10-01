package com.bl.addressbook.service;

import com.bl.addressbook.models.Contact;

public interface IAddressBookService {
    boolean addContact(Contact contact);
    Contact getAllContacts();


}

package com.bl.addressbook.service;

import com.bl.addressbook.models.Contact;

public class AddressBookService implements IAddressBookService {
    private Contact contact;

    @Override
    public boolean addContact(Contact contact) {
        this.contact = contact;
        return true;
    }

    @Override
    public Contact getAllContacts() {
        return this.contact;
    }

}



package com.bl.addressbook.controller;

import com.bl.addressbook.models.Contact;
import com.bl.addressbook.service.AddressBookService;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookController {


    public static void main(String[] args) {

            ArrayList<Contact> contacts=new ArrayList<>();
            AddressBookService addressBookService=new AddressBookService(contacts);
            Scanner consoleInputReader = new Scanner(System.in);
            addressBookService.readEmployeePayrollData(consoleInputReader);
            addressBookService.writeEmployeePayrollData();

        }
    }


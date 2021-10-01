package com.bl.addressbook.controller;

import com.bl.addressbook.models.Contact;
import com.bl.addressbook.service.AddressBookService;
import com.bl.addressbook.service.IAddressBookService;

import java.util.Scanner;

public class AddressBookController {
     Scanner scanner;
    IAddressBookService addressBookService;

    public AddressBookController() {
        this.scanner = new Scanner(System.in);

        this.addressBookService = new AddressBookService();
    }

    public static void main(String[] args) {
        AddressBookController addressBookController= new AddressBookController();
        new AddressBookController().addContact();
        Contact contact = addressBookController.getContacts();

        System.out.println(contact);


    }


    public void addContact() {

        System.out.println("Enter First Name: ");
        String firstName = this.scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName =this.scanner.nextLine();


        System.out.println("Enter Address:");
        String address =this.scanner.nextLine();

        System.out.println("Enter City:");
        String city =this.scanner.nextLine();

        System.out.println("Enter State:");
        String state =this.scanner.nextLine();

        System.out.println("Enter Zip Code:");
        int zipCode =this.scanner.nextInt();

        System.out.println("Enter Mobile No:");
        long mobileNo = this.scanner.nextLong();

        Contact contact = new Contact(firstName,lastName,address,city,state,zipCode,mobileNo);

        this.addressBookService.addContact(contact);
    }

    public Contact getContacts(){
        return this.addressBookService.getAllContacts();

}
}

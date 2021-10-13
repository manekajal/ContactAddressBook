package com.bl.addressbook.controller;

import com.bl.addressbook.models.Contact;
import com.bl.addressbook.service.AddressBookService;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class AddressBookController {





        public ArrayList<Contact>addbook() {
            ArrayList<Contact>arrayList=new ArrayList<>();

            boolean flag = true;
            Scanner scanner = new Scanner(System.in);
            while (flag) {

                AddressBookService addbook = new AddressBookService();
                System.out.println("Enter 1 for add, 2 for edit, 3 for delete,4 for print, 5 for exit");
                System.out.println("Enter your Choice :");
                switch (scanner.nextInt()) {
                    case 1:

                        addbook.addData();
                        System.out.println();
                        break;
                    case 2:

                        addbook.edit();
                        break;
                    case 3:
                        addbook.delete();
                        System.out.println("________________");
                        break;
                    case 4:
                        addbook.showData();

                        break;

                    case 5:
                        flag = false;
                        break;
                }


            }
            return arrayList;
        }
}



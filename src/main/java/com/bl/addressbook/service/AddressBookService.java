package com.bl.addressbook.service;

import com.bl.addressbook.models.Contact;

import java.util.*;
import java.util.stream.Stream;

public class AddressBookService {
    ArrayList<Contact> arrayList = new ArrayList<Contact>();


    Scanner scanner;

    public AddressBookService() {
        scanner = new Scanner(System.in);
    }

    public void addData() {
        System.out.println("Enter all the details");

        System.out.print(" Enter First Name : ");
        String firstName = scanner.nextLine();

        System.out.print(" Enter Last Name : ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Address : ");
        String address = scanner.nextLine();
        System.out.print("Enter City : ");
        String city = scanner.nextLine();

        System.out.print("Enter state : ");
        String state = scanner.nextLine();
        System.out.print("Enter zip : ");
        String zipCode = scanner.nextLine();
        System.out.print("Enter Mobile Number : ");
        String mobileNo = scanner.nextLine();
        System.out.print("Enter the Email ID : ");
        String emailId = scanner.nextLine();
        for(int i=0;i<arrayList.size();i++){

            if(arrayList.get(i).getFirstName().equals(firstName))
            {
                System.out.println(" Sorry Name is already Exist :");
                return;
            }

        }
        arrayList.add(new Contact(firstName, lastName, address, city, state, zipCode, mobileNo, emailId));
        System.out.println("Data added Successfully");


    }

    public void showData() {
        for(int i =0 ;i<arrayList.size();i++){
            System.out.println(arrayList.get(i).getFirstName());
            System.out.println(arrayList.get(i).getLastName());
            System.out.println(arrayList.get(i).getAddress());
            System.out.println(arrayList.get(i).getCity());
            System.out.println(arrayList.get(i).getZipCode());
            System.out.println(arrayList.get(i).getState());
            System.out.println(arrayList.get(i).getMobileNo());
            System.out.println(arrayList.get(i).getEmailId());
        }

    }

    public void delete() {
        boolean found = false;
        System.out.println(" Enter the name to search :");
        String firstName = scanner.nextLine();
        System.out.println("_____________________________");
        Iterator<Contact> it = arrayList.iterator();
        while (it.hasNext()) {
            Contact contact = it.next();
            if (contact.getFirstName().equals(firstName)) {
               it.remove();
                found = true;
            }


            if (!found) {
                System.out.println(" name is not found");
            }else
            {
                System.out.println(" Record is deleted Successfully :");
            }
            break;
        }

    }

    public void edit() {
        boolean found = false;
        System.out.println(" Enter the name to edit :");
        String firstName = scanner.nextLine();
        System.out.println("_____________________________");
        ListIterator<Contact>li= arrayList.listIterator();

        while (li.hasNext()) {
            Contact contact = li.next();
            if (contact.getFirstName().equals(firstName)) {
                System.out.println("Enter all the details");

                System.out.print(" Enter First Name : ");
                String fName = scanner.nextLine();

                System.out.print(" Enter Last Name : ");
                String lastName = scanner.nextLine();
                System.out.print("Enter Address : ");
                String address = scanner.nextLine();
                System.out.print("Enter City : ");
                String city = scanner.nextLine();

                System.out.print("Enter state : ");
                String state = scanner.nextLine();
                System.out.print("Enter zip : ");
                String zipCode = scanner.nextLine();
                System.out.print("Enter Mobile Number : ");
                String mobileNo = scanner.nextLine();
                System.out.print("Enter the Email ID : ");
                String emailId = scanner.nextLine();

                li.set(new Contact(firstName, lastName, address, city, state, zipCode, mobileNo, emailId));



                found = true;
            }


            if (!found) {
                System.out.println(" name is not found");
            }else
            {
                System.out.println(" Record is edited Successfully :");
            }
            break;
        }
    }
    public void search() {
        boolean found = false;

        System.out.println(" Enter the city to search :");
        String city = scanner.nextLine();
        System.out.println(" Enter the state");
        String state = scanner.nextLine();
        System.out.println("_____________________________");
        Iterator<Contact> it = arrayList.iterator();
        while (it.hasNext()) {
            Contact contact = it.next();
            if (contact.getCity().equals(city)) {
                System.out.println(contact);

                found = true;
            }
            if (contact.getState().equals(state)) {
                System.out.println(contact);

                found = true;
            }

            if (!found) {
                System.out.println(" city is not found");
            }
            break;
        }


  //      public void viewCity();
  //      {
  //          System.out.println("Enter the City or State");
   //        String  cityOrState = scanner.nextLine();
  //          arrayList.stream()
   //                 .map(Contact::getCity)
   //                 .distinct()
     //               .forEach(System.out::println);
//

  //      }
    }

    public void viewCity(){
        System.out.println("Enter the City or State");
        String  cityOrState = scanner.nextLine();
        List<Contact> contactList1 = new ArrayList<>();
        arrayList.stream()
                .map(Contact::getCity)
                .distinct()
                .forEach(System.out::println);
    }

}

    

package com.company;

// this is main class contains main method
public class Main{

    public static void main(String [] args){
        // creating new ContactManger object
        ContactManager myContactsManager = new ContactManager();

        // creating new contacts and adding information for friends
        Contact friendBharadwaj = new Contact();
        friendBharadwaj.name = "Bharadwaj";
        friendBharadwaj.phoneNumber = "03135781016";

        // friend Theja
        Contact friendTheja = new Contact();
        friendTheja.name = "Theja";
        friendTheja.phoneNumber = "04058375313";

        // adding contacts to contactManager
        myContactsManager.addContact(friendBharadwaj);
        myContactsManager.addContact(friendTheja);

        // searching for contact Theja and displaying phone number
        System.out.println("Contact No is: " + myContactsManager.searchContact("Theja").phoneNumber);
    }
}
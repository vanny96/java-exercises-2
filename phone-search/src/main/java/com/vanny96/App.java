package com.vanny96;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        PhoneRegister register = new PhoneRegister(reader);
        AddressRegister addressRegister = new AddressRegister(reader);

        System.out.println("phone search\navailable operations:\n1 add a number\n2 search for a number\n3 search for a person by phone number");
        System.out.println("4 add an address\n5 search for personal information\n6 delete personal information\n7 filtered listing\nx quit\n");
        
        char option;
        String name;
        boolean quitting = false;

        while(!quitting){
            System.out.print("\ncommand: ");
            option = reader.nextLine().charAt(0);

            switch(option){
                case '1':
                    register.add();
                    break;

                case '2':
                    register.searchByName();
                    break;

                case '3':
                    register.searchByNumber();
                    break;

                case '4':
                    addressRegister.addAddress();
                    break;

                case '5':
                    System.out.print("whose information: ");
                    name = reader.nextLine();
                    
                    addressRegister.searchAddressnByName(name);
                    register.searchByName(name);

                    break;

                case '6':
                    System.out.print("whose information: ");
                    name = reader.nextLine();

                    register.removeByName(name);
                    addressRegister.removeByName(name);
                    
                    break;
                
                case '7':
                    filteredSearch(addressRegister, register, reader);

                    break;
                case 'x':
                    quitting = true;
                    break;

            }
        }
    }

    private static void filteredSearch(AddressRegister addressRegister, PhoneRegister phoneRegister, Scanner reader){
        System.out.print("keyword (if empty, all listed): ");
        String keyWord = reader.nextLine();

        Set<String> names = new HashSet<String>();

        for(String name : addressRegister.filteredSearch(keyWord)){
            names.add(name);
        }

        for(String name : phoneRegister.filteredSearch(keyWord)){
            names.add(name);
        }

        for(String name : names){
            System.out.println("\n" + name);
            addressRegister.searchAddressnByName(name);
            phoneRegister.searchByName(name);
        }
    }
}

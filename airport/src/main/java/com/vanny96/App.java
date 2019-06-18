package com.vanny96;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport(reader);

        airportPanel(airport, reader);
        System.out.println();
        flightService(airport, reader);
    }

    private static void airportPanel(Airport airport, Scanner reader){

        System.out.println("Airport panel\n--------------------\n");

        boolean leaving = false;
        while(!leaving){
            System.out.println("Choose operation:\n[1] Add airplane\n[2] Add flight\n[x] Exit");
            char choice = reader.nextLine().charAt(0);

            switch(choice){
                case '1':
                    airport.addPlane();
                    break;
                case '2':
                    airport.addFlight();
                    break;
                case 'x':
                    leaving = true;
                    break;
                default:
                    System.out.println("Not a valid comand");                
            }
        }
    }

    private static void flightService(Airport airport, Scanner reader){

        System.out.println("Flight service\n------------\n");


        boolean leaving = false;
        while(!leaving){
            System.out.println("Choose operation:\n[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit");
            char choice = reader.nextLine().charAt(0);

            switch(choice){
                case '1':
                    airport.printPlanes();
                    break;
                case '2':
                    airport.printFlights();
                    break;
                case '3':
                    airport.printPlane();
                    break;
                case 'x':
                    leaving = true;
                    break;
                default:
                    System.out.println("Not a valid comand");                
            }
        }
    }
}

package com.vanny96;

import java.util.ArrayList;
import java.util.HashMap;

public class App 
{
    public static void main( String[] args )
    {
        VehicleRegister vehicleRegister = new VehicleRegister();
        RegistrationPlate plate = new RegistrationPlate("FI", "ABC-123");

        vehicleRegister.add(plate, "Giovanni");
        vehicleRegister.add(new RegistrationPlate("FI", "UXE-465"), "Paolo");
        vehicleRegister.add(new RegistrationPlate("D", "B WQ-431"), "Marco");

        System.out.println("Vehicles:");
        vehicleRegister.printVehicles();

        vehicleRegister.add(plate, "Giovanni");

        System.out.println("\nPlates:");
        vehicleRegister.printRegistrationPlate();
        System.out.println("\nOwners:");
        vehicleRegister.printOwners();

        vehicleRegister.delete(plate);
        vehicleRegister.delete(new RegistrationPlate("Test", "Shouldn't delete"));

        System.out.println("\nVehicles:");
        vehicleRegister.printVehicles();
    }
}

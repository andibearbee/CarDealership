package com.pluralsight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.pluralsight.Dealership.*;
import static com.pluralsight.DealershipFileManager.getDealership;


public class UserInterface {
    static Scanner scanner = new Scanner(System.in);

    public static void init() throws IOException {
        getDealership();
    }

    public static void display() throws IOException {
        init();
        menu();
        int menuSwap = scanner.nextInt();
        switch(menuSwap) {
            case 1:
                processGetAllVehicleRequest();
                break;
            case 2:
                processAddVehicleRequest();
                break;
            case 3:
                processRemoveVehicleRequest();
                break;
            case 4:
                processGetByPriceRequest();
                break;
            case 5:
                processGetByMakeModelRequest();
                break;
            case 6:
                processGetByYearRequest();
                break;
            case 7:
                processGetByColorRequest();
                break;
            case 8:
                processGetByMileageRequest();
                break;
            case 9:
                processGetByVehicleTypeRequest();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Sorry, please try again using a number between 0 - 9!");
                menu();
                break;
        }
    }

    public static void processGetByPriceRequest() throws IOException {
        getVehiclesByPrice();

    }

    public static void processGetByMakeModelRequest() throws IOException {
        getVehiclesByMakeModel();

    }

    public static void processGetByYearRequest() throws IOException {
        getVehiclesByYear();

    }

    public static void processGetByColorRequest() throws IOException {
        getVehiclesByColor();


    }

    public static void processGetByMileageRequest() throws IOException {
        getVehiclesByMileage();

    }

    public static void processGetByVehicleTypeRequest() throws IOException {
        getVehiclesByType();

    }

    public static void processGetAllVehicleRequest() throws IOException {
        getAllVehicles();
    }

    public static void processAddVehicleRequest() throws IOException {
        addVehicle();

    }

    public static void processRemoveVehicleRequest()throws IOException {
        removeVehicle();

    }

    public static void displayVehicles(ArrayList<Vehicle> displayList) throws IOException {
        for(Vehicle vehicle: displayList) {
            System.out.println(" VIN: " + vehicle.getVin() +
                    " Year: " + vehicle.getYear() +
                    " Make: " + vehicle.getMake() +
                    " Model: " + vehicle.getModel() +
                    " Type: " + vehicle.getVehicleType() +
                    " Color: " + vehicle.getColor() +
                    " Mileage: " + vehicle.getOdometer() +
                    " Price: " + vehicle.getPrice());
        }
    }

    public static void menu() {
        String welcome = "Welcome to GlobalCar, the one stop shop for all things used vehicles.\n" +
                "Enter the number of the menu option you wish to view: \n" +
                "1) View All Vehicles\n" +
                "2) Add A Vehicle\n" +
                "3) Remove A Vehicle\n" +
                "4) Filter Vehicles By Price\n" +
                "5) Filter Vehicles By Make/Model\n" +
                "6) Filter Vehicles By Year\n" +
                "7) Filter Vehicles By Color\n" +
                "8) Filter Vehicles By Mileage\n" +
                "9) Filter Vehicles By Type\n" +
                "0) Exit";
        System.out.println(welcome);
    }
}

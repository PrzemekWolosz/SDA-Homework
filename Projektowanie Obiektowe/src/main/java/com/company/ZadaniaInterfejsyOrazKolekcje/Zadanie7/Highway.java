package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie7;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Highway {

    List<VehicleInfo> vehicleList = new ArrayList<>();

    public Highway(List<VehicleInfo> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void vehicleEntry(String registrationNumber, CarType carType) throws VehicleAlreadyOnHighwayExeption {
        for (VehicleInfo vehicleInfo : vehicleList) {
            if (vehicleInfo.getRegistartionNumber().equals(registrationNumber)) {
                throw new VehicleAlreadyOnHighwayExeption();
            }
        }
        Date enterDate = new Date();
        vehicleList.add(new VehicleInfo(registrationNumber, carType, enterDate));
        System.out.println("New vehicle on Highway: " + carType + ", " + registrationNumber + ", enter time: " + enterDate);
    }

    public void searchVehicle(String registrationNumber) {
        for (VehicleInfo vehicleInfo : vehicleList) {
            if (vehicleInfo.getRegistartionNumber().equals(registrationNumber)) {
                System.out.println(vehicleInfo.toString());
                break;
            }
        }
    }

    public void vehicleLeave(String registrationNumber) {
        for (VehicleInfo vehicleInfo : vehicleList) {
            if (vehicleInfo.getRegistartionNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicleInfo);
                Date leaveDate = new Date();
                System.out.println("Vehicle " + registrationNumber + " has left highway.");
                long timeOnHighway = new Date().getTime() - vehicleInfo.getEnterDate().getTime();
                System.out.println("Time on highway: " + timeOnHighway + " seconds.");
                double highwayFee = timeOnHighway*vehicleInfo.getCarType().getPriceForSecondOnHighway();
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                System.out.println("You have to pay " + decimalFormat.format(highwayFee) + " pln.");
                break;
            }
        }
    }
}
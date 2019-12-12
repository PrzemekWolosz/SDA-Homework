package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws VehicleAlreadyOnHighwayExeption {

        Highway highway = new Highway(new ArrayList<>());

        highway.vehicleEntry("GD7789E", CarType.TRUCK);
        highway.vehicleEntry("ST67701", CarType.CAR);
        highway.vehicleEntry("GA1001A",CarType.MOTORCYCLE);

        highway.searchVehicle("GD7789E");

        highway.vehicleLeave("GD7789E");

        highway.vehicleEntry("GA1001A",CarType.MOTORCYCLE);
    }
}

package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie7;

import java.util.Date;

public class VehicleInfo {

    private String registartionNumber;
    CarType carType;
    Date enterDate;

    public VehicleInfo(String registartionNumber, CarType carType, Date enterDate) {
        this.registartionNumber = registartionNumber;
        this.carType = carType;
        this.enterDate = enterDate;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "registartionNumber= '" + registartionNumber + '\'' +
                ", carType= " + carType +
                ", enterDate= " + enterDate +
                '}';
    }

    public String getRegistartionNumber() {
        return registartionNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public Date getEnterDate() {
        return enterDate;
    }
}

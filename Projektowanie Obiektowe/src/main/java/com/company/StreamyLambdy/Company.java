package com.company.StreamyLambdy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Company {
    private String name; // nazwa firmy
    private String cityHeadquarters; // siedziba firmy
    private int employees; // ilość pracowników
    private List<Purchase> purchaseList; // lista zakupów wykonanych przez firmę (co firma kupiła)


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cityHeadquarters='" + cityHeadquarters + '\'' +
                ", employees=" + employees +
                ", purchaseList=" + purchaseList +
                "}\n";
    }
}
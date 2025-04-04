package com.service;

import com.model.HelperBean;
import org.springframework.stereotype.Service;

@Service
public class HelperService {

    public double calculateTotalCost(HelperBean helper) {
        double costPerHour = 0;
        switch (helper.getServiceType()) {
            case "ACService":
                costPerHour = 400;
                break;
            case "WashingMachineService":
                costPerHour = 500;
                break;
            case "RefrigeratorService":
                costPerHour = 300;
                break;
        }
        helper.setServiceCostPerHour(costPerHour);
        double totalCost = costPerHour * helper.getNoOfHours();
        helper.setServiceCost(totalCost);
        return totalCost;
    }
}
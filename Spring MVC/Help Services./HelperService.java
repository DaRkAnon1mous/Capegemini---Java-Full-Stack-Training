package com.service;
import org.springframework.stereotype.Component;

import com.model.HelperBean;
@Component
public class HelperService {
	
	
	public double calculateTotalCost(HelperBean helperBean)
	{
		switch(helperBean.getServiceType()) {
		case "ACService":
			helperBean.setServiceCostPerHour(400);
			break;
		case "WashingMachineService":
			helperBean.setServiceCostPerHour(500);
			break;
		case "RefrigeratorService":
			helperBean.setServiceCostPerHour(300);
			break;
		}
		
		return helperBean.getNoOfHours()*helperBean.getServiceCostPerHour();
		
		
	}

}

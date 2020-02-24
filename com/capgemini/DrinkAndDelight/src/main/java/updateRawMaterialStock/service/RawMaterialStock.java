package updateRawMaterialStock.service;

import java.util.Date;
import updateRawMaterialStock.Controller.RawMaterialStockInterface;
import updateRawMaterialStock.beans.*;
import updateRawMaterialStock.dao.*;

public class RawMaterialStock implements RawMaterialStockInterface {

//	Checking raw material order id into the database
	public void orderId(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj) {
		int checkDatabase;
		for (checkDatabase = 0; checkDatabase < myDaoObj.rawMaterialOrderId.size(); checkDatabase++) {
			if (myBeanObj.getOrderId().equals(myDaoObj.rawMaterialOrderId.get(checkDatabase))) {
				break;
			}
		}
		if (checkDatabase == myDaoObj.rawMaterialOrderId.size()) {
			System.out.println("You enter the wrong order Id");
			System.exit(0);
		}

	}

//	Set process date of that Id
	public Date processDate(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj) {
		myDaoObj.rawMaterialProcessDate.add(myBeanObj.getProcessDate());
		return myDaoObj.rawMaterialProcessDate.get(0);
	}

//	Updating manufacturing date
//	Assumption : Manufacturing date must be greater then the process date
	public Date manufacturingDate(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj) {
		if (myBeanObj.getManufacturingDate().compareTo(myBeanObj.getProcessDate()) > 0) {
			myDaoObj.rawMaterialManufacturingDate.add(myBeanObj.getManufacturingDate());
			return myDaoObj.rawMaterialManufacturingDate.get(0);
		} else {
			System.out.println("Error : Manufacturing date must be greater then the manufacturing date");
			System.exit(0);
		}
		return null;

	}

//	Updating expire date
//	Assumption : Expire date must be greater then the manufacturing date
	public Date expiryDate(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj) {
		if (myBeanObj.getExpiryDate().compareTo(myBeanObj.getManufacturingDate()) > 0) {
			myDaoObj.rawMaterialExpiryDate.add(myBeanObj.getExpiryDate());
			return myDaoObj.rawMaterialExpiryDate.get(0);
		} else {
			System.out.println("Error : Expiry date must be greater then the manufacturing date");
			System.exit(0);
		}
		return null;
	}

//	Updating the quality check
	public String qualityCheck(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj) {
		myDaoObj.rawMaterialQualityCheck.add(myBeanObj.getQualityCheck());
		return myDaoObj.rawMaterialQualityCheck.get(0);
	}

}

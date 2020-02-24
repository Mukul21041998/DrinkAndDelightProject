package updateRawMaterialStock.client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import updateRawMaterialStock.beans.*;
import updateRawMaterialStock.dao.DrinkAndDelightRepository;
import updateRawMaterialStock.service.RawMaterialStock;

public class Source {

	public static void main(String[] args) {

//		Creating the object of RawMaterialStockClass
		RawMaterialStockBean myBeanObj = new RawMaterialStockBean();

//		Creating object of RawMaterialStock
		RawMaterialStock myControllerObj = new RawMaterialStock();

//		Creating object of DrinkAndDelightRepository class
		DrinkAndDelightRepository myDaoObj = new DrinkAndDelightRepository();
		Scanner sc = new Scanner(System.in);

//		Checking the order id
		System.out.println("Enter the raw material order Id");
		myBeanObj.setOrderId(sc.nextLine());
		myControllerObj.orderId(myBeanObj, myDaoObj);

//		Adding process date into the database
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println("Enter the process date of raw material in the format Month-Day-Year");
		String processDate = sc.nextLine();
		try {
			myBeanObj.setProcessDate(dateFormat.parse(processDate));
			myControllerObj.processDate(myBeanObj, myDaoObj);
		} catch (ParseException e) {
			System.err.println(e);
		}

//		Updating the  manufacturing date
		System.out.println("Enter the manufacturing date of raw material in the format Month-Day-Year to update");
		String manufacturingDate = sc.nextLine();
		try {
			myBeanObj.setManufacturingDate(dateFormat.parse(manufacturingDate));
			myControllerObj.manufacturingDate(myBeanObj, myDaoObj);
		} catch (ParseException e) {
			System.err.println(e);
		}

//		Updating the expire date
		System.out.println("Enter the expiry date of raw material in the format Month-Day-Year to update");
		String expiryDate = sc.nextLine();
		try {
			myBeanObj.setExpiryDate(dateFormat.parse(expiryDate));
			myControllerObj.expiryDate(myBeanObj, myDaoObj);
		} catch (ParseException e) {
			System.err.println(e);
		}

//		Updating the quality check
		System.out.println("Enter the quality of raw material to update");
		String qualityCheck = sc.nextLine();
		sc.close();
		myBeanObj.setQualityCheck(qualityCheck);
		myControllerObj.qualityCheck(myBeanObj, myDaoObj);

//		Showing all the update details
		System.out.println("Process Date of raw material is :" + myControllerObj.processDate(myBeanObj, myDaoObj));
		System.out.println(
				"Manufacturing Date of raw material is :" + myControllerObj.manufacturingDate(myBeanObj, myDaoObj));
		System.out.println("Expiry Date of raw material is :" + myControllerObj.expiryDate(myBeanObj, myDaoObj));
		System.out.println("Quality of raw material is :" + myControllerObj.qualityCheck(myBeanObj, myDaoObj));

	}

}

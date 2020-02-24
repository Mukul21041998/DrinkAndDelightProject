package rawMaterialStockServiceTest;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;
import updateRawMaterialStock.beans.RawMaterialStockBean;
import updateRawMaterialStock.dao.DrinkAndDelightRepository;
import updateRawMaterialStock.service.RawMaterialStock;

public class RawMaterialStockTest {
	RawMaterialStock myControllerObj = new RawMaterialStock();
	RawMaterialStockBean myBeanObj = new RawMaterialStockBean();
	DrinkAndDelightRepository myDaoObj = new DrinkAndDelightRepository();

//	Test process date of the raw material
	@Test
	public void testProcessDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		try {
			myBeanObj.setProcessDate(dateFormat.parse("01-01-2015"));
		} catch (ParseException e) {
			System.err.println(e);
		}
		myDaoObj.rawMaterialProcessDate.add(myBeanObj.getProcessDate());
		assertEquals(myDaoObj.rawMaterialProcessDate.get(0), myControllerObj.processDate(myBeanObj, myDaoObj));
	}

//	Test manufacturing date of the raw material
	@Test
	public void testManufacturingDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		try {
			myBeanObj.setProcessDate(dateFormat.parse("01-01-2015"));
		} catch (ParseException e) {
			System.err.println(e);
		}
		myDaoObj.rawMaterialProcessDate.add(myBeanObj.getProcessDate());
		try {
			myBeanObj.setManufacturingDate(dateFormat.parse("01-01-2020"));
		} catch (ParseException e) {
			System.err.println(e);
		}
		myDaoObj.rawMaterialManufacturingDate.add(myBeanObj.getProcessDate());
		assertEquals(myDaoObj.rawMaterialProcessDate.get(0), myControllerObj.manufacturingDate(myBeanObj, myDaoObj));
	}

//	Test expire date of the raw material
	@Test
	public void testExpiryDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		try {
			myBeanObj.setManufacturingDate(dateFormat.parse("01-01-2020"));
		} catch (ParseException e) {
			System.err.println(e);
		}
		try {
			myBeanObj.setExpiryDate(dateFormat.parse("01-01-2030"));
		} catch (ParseException e) {
			System.err.println(e);
		}

		myDaoObj.rawMaterialExpiryDate.add(myBeanObj.getExpiryDate());
		assertEquals(myDaoObj.rawMaterialExpiryDate.get(0), myControllerObj.expiryDate(myBeanObj, myDaoObj));
	}

//	Test quality of the raw material
	@Test
	public void testQualityCheck() {

		myBeanObj.setQualityCheck("Best");
		myDaoObj.rawMaterialQualityCheck.add(myBeanObj.getQualityCheck());
		assertEquals(myDaoObj.rawMaterialQualityCheck.get(0), myControllerObj.qualityCheck(myBeanObj, myDaoObj));
	}

}

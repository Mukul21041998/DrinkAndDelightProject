package updateRawMaterialStock.Controller;

import java.util.Date;

import updateRawMaterialStock.beans.RawMaterialStockBean;
import updateRawMaterialStock.dao.DrinkAndDelightRepository;

public interface RawMaterialStockInterface {
	public void orderId(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj);

	public Date processDate(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj);

	public Date manufacturingDate(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj);

	public Date expiryDate(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj);

	public String qualityCheck(RawMaterialStockBean myBeanObj, DrinkAndDelightRepository myDaoObj);

}

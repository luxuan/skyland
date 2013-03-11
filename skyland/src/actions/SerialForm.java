package actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import beans.Serial;

import jsp.Controller;
import jsp.SerialSearch;

public class SerialForm extends ActionForm{
	private int serial;
	private SerialSearch ser;
	
	public void setSerial(int serial){this.serial=serial;}
	public int getSerial(){return this.serial;}
	
	public SerialSearch getSerialSearch(){return this.ser;}
	
	public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest request) {
	    ActionErrors errors = new ActionErrors();
	    if(serial==0)errors.add("serialError",new ActionMessage("serial.noSerial"));
	    else{
	    	ser=searchSerial(this.serial);
	    	if(ser==null)errors.add("serialError",new ActionMessage("serial.searchFail"));
	    }
	    return errors;
	}

	
	private SerialSearch searchSerial(int serialNum){
		String hql="from Serial serial where serial.serial='"+serialNum+"'";
		Serial serial=Controller.get(hql);

		if(serial!=null){
			SerialSearch ser=new SerialSearch();
			ser.setSerial(serial.getSerial());
			
			int goodsNum=serial.getGoodsNum();
			hql="select goods.name,goods.specification,goods.shopNum from Goods goods where goods.num='"+goodsNum+"'";
			Object[] obj=Controller.get(hql);
			ser.setName(obj[0].toString());
			ser.setSpecification(obj[1].toString());
			
			int shopNum=(Integer)obj[2];
			hql="select shop.name from Shop shop where shop.num='"+shopNum+"'";
			Object shopName=Controller.get(hql);
			ser.setSoldShop(shopName.toString());
			
			return ser;
		}
		return null;
	}

}

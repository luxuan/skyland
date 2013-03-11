package jsp;

import java.sql.Timestamp;

public class SerialSearch {
	private int serial;
	private String name;
	private String specification;
	private String soldShop;
	private Timestamp soldTime;
	
	public void setSerial(int serial){this.serial=serial;}
	public int getSerial(){return this.serial;}
	
	public void setName(String name){this.name=name;}
	public String getName(){return this.name;}
	
	public void setSpecification(String specification){this.specification=specification;}
	public String getSpecification(){return this.specification;}
	
	public void setSoldShop(String soldShop){this.soldShop=soldShop;}
	public String getSoldShop(){return this.soldShop;}
	
	public void setSoldTime(Timestamp soldTime){this.soldTime=soldTime;}
	public Timestamp getSoldTime(){return this.soldTime;}

}

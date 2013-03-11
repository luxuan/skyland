package beans;

import jsp.Controller;

public class City extends BaseObject {
	private int provinceNum;
	
	public void setProvinceNum(int provinceNum){this.provinceNum=provinceNum;}
	public int getProvinceNum(){return this.provinceNum;}

	public static String getName(int num){
		String hql="select city.name from City city where city.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (String)obj;
	}
	
	public static int getProvinceNum(int num){
		String hql="select city.provinceNum from City city where city.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (Integer)obj;
	}

}

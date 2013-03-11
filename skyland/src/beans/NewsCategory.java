package beans;

import jsp.Controller;

public class NewsCategory extends BaseObject {
	private boolean isUsed;
	
	public void setIsUsed(boolean isUsed){this.isUsed=isUsed;}
	public boolean getIsUsed(){return isUsed;}
	
	public static String getName(int num){
		String hql="select nc.name from NewsCategory nc where nc.num='"+num+"'";
		Object name=Controller.get(hql);
		return (String)name;
	}

}

package beans;

import jsp.Controller;

public class Category extends BaseObject {
	private boolean isHot;
	private boolean isUsed;

	
	public void setIsHot(boolean isHot){this.isHot=isHot;}
	public boolean getIsHot(){return this.isHot;}
	
	public void setIsUsed(boolean isUsed){this.isUsed=isUsed;}
	public boolean getIsUsed(){return this.isUsed;}
	
	public static String getName(int num){
		String hql="select cg.name from Category cg where cg.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (String)obj;
	}

	
}

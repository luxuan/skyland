package beans;

import jsp.Controller;

public class Shop {
	private int num;		
	private int cityNum;
	private int adminNum;
	private int ID;
	private int goodCommentCount;
	private int goodsCount;
	private int soldCount;
	private String name;
	private String address;	
	private String phone;
	private String pic;		//shop pic path
	private String license;	//license pic path
	private String qq;
	private String email;
	private String fax;
	private boolean isUsed;
	private String detail;
	
	public static String getName(int num){
		String hql="select shop.name from Shop shop where shop.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (String)obj;
	}
	
	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}
	
	public void setCityNum(int cityNum){this.cityNum=cityNum;}
	public int getCityNum(){return this.cityNum;}
	
	public void setAdminNum(int adminNum){this.adminNum=adminNum;}
	public int getAdminNum(){return this.adminNum;}
	
	public void setGoodCommentCount(int goodCommentCount){this.goodCommentCount=goodCommentCount;}
	public int getGoodCommentCount(){return this.goodCommentCount;}
	
	public void setGoodsCount(int goodsCount){this.goodsCount=goodsCount;}
	public int getGoodsCount(){return this.goodsCount;}
	
	public void setSoldCount(int soldCount){this.soldCount=soldCount;}
	public int getSoldCount(){return this.soldCount;}
	
	public void setName(String name){this.name=name;}
	public String getName(){return this.name;}
	
	public void setAddress(String address){this.address=address;}
	public String getAddress(){return this.address;}
	
	public void setPhone(String phone){this.phone=phone;}
	public String getPhone(){return this.phone;}
	
	public void setQq(String qq){this.qq=qq;}
	public String getQq(){return this.qq;}
	
	public void setPic(String pic){this.pic=pic;}
	public String getPic(){return this.pic;}
	
	public void setLicense(String license){this.license=license;}
	public String getLicense(){return this.license;}
	
	public void setFax(String fax){this.fax=fax;}
	public String getFax(){return this.fax;}
	
	public void setEmail(String email){this.email=email;}
	public String getEmail(){return this.email;}
	
	public void setIsUsed(boolean isUsed){this.isUsed=isUsed;}
	public boolean getIsUsed(){return this.isUsed;}
	
	public void setDetail(String detail){this.detail=detail;}
	public String getDetail(){return this.detail;}
	
}

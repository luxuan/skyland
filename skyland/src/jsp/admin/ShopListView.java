package jsp.admin;

public class ShopListView {
	private int num;
	private int goodsCount;
	private int soldCount;
	private String phone;
	private String email;	
	private String shopName;
	
	private String adminName;

	
	
	public void setShopName(String shopName){this.shopName=shopName;}
	public String getShopName(){return this.shopName;}
	
	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}
	
	public void setAdminName(String adminName){this.adminName=adminName;}
	public String getAdminName(){return this.adminName;}
	
	public void setGoodsCount(int goodsCount){this.goodsCount=goodsCount;}
	public int getGoodsCount(){return this.goodsCount;}
	
	public void setSoldCount(int soldCount){this.soldCount=soldCount;}
	public int getSoldCount(){return this.soldCount;}
	
	public void setPhone(String phone){this.phone=phone;}
	public String getPhone(){return this.phone;}
	
	public void setEmail(String email){this.email=email;}
	public String getEmail(){return this.email;}
}

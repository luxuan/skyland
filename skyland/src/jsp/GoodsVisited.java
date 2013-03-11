package jsp;

public class GoodsVisited extends Visited {

	private String city;
	private String shopName;
	private float price;	
	
	public GoodsVisited(int num){super(num);}
	
	public void setCity(String city){this.city=city;}
	public String getCity(){return this.city;}
	
	public void setShopName(String shopName){this.shopName=shopName;}
	public String getShopName(){return this.shopName;}

	public void setPrice(float price){this.price=price;}
	public float getPrice(){return this.price;}
}

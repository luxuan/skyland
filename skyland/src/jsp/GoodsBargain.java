package jsp;

public class GoodsBargain extends Visited {
	private float price;
	private float originalPrice;

	public GoodsBargain(int num){super(num);}
	
	public void setPrice(float price){this.price=price;}
	public float getPrice(){return this.price;}
	
	public void setOriginalPrice(float originalPrice){this.originalPrice=originalPrice;}
	public float getOriginalPrice(){return this.originalPrice;}
	
}

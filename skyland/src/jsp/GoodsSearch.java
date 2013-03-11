package jsp;

public class GoodsSearch extends Visited {
	private float price;
	private String category;
	private String caption;
	
	public GoodsSearch(int num){super(num);}
	
	public void setPrice(float price){this.price=price;}
	public float getPrice(){return this.price;}
	
	public void setCategory(String category){this.category=category;}
	public String getCategory(){return this.category;}
	
	public void setCaption(String caption){this.caption=caption;}
	public String getCaption(){return this.caption;}
	

}

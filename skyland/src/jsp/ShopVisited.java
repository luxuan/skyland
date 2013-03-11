package jsp;

public class ShopVisited extends Visited {
	private String address;
	private String phone;
	
	public ShopVisited(int num){super(num);}
	
	public void setAddress(String address){this.address=address;}
	public String getAddress(){return this.address;}
	
	public void setPhone(String phone){this.phone=phone;}
	public String getPhone(){return this.phone;}
	
}

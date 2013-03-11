package jsp;

public class CartGoods extends GoodsVisited {
	private int buyCount=1;
	public CartGoods(int num){super(num);}
	public void setBuyCount(int buyCount){this.buyCount=buyCount;}
	public int getBuyCount(){return this.buyCount;}
	public void increase(int increaseCount){this.buyCount+=increaseCount;}
}

package beans.user;

public class GoodsCart extends UserBase{
	private int goodsNum;//购物车中商品索引号
	private int goodsCount;
	
	public int getGoodsNum(){return this.goodsNum;}
	public void setGoodsNum(int goodsNum){this.goodsNum=goodsNum;}
	
	public int getGoodsCount(){return this.goodsCount;}
	public void setGoodsCount(int goodsCount){this.goodsCount=goodsCount;}
	
}

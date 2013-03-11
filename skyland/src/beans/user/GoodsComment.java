package beans.user;

public class GoodsComment extends UserBase {
	private int goodsNum;//评论的商品索引号
	private String content;//评论内容
	
	public int getGoodsNum(){return this.goodsNum;}
	public void setGoodsNum(int goodsNum){this.goodsNum=goodsNum;}
	
	public String getContent(){return this.content;}
	public void setContent(String content){this.content=content;}
	
}

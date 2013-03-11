package beans.user;

public class ShopComment extends UserBase {
	private int shopNum;//评论的商铺索引号
	private String content;//评论内容
	
	public int getShopNum(){return this.shopNum;}
	public void setShopNum(int shopNum){this.shopNum=shopNum;}
	
	public String getContent(){return this.content;}
	public void setContent(String content){this.content=content;}
	
}

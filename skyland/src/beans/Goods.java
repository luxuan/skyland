package beans;

import java.util.Date;

public class Goods {
	
	private int num;
	private int brandNum;
	private int categoryNum;
	private int shopNum;
	private float price;
	private float originalPrice;
	private int soldCount;
	private int goodCommentCount;
	private int weight;
	private String name;
	private String pic;	
	private String colour;
	private String specification;	//规格
	private String type;		//型号
	private String company;	
	private String detail;
	private String produceTime;	
	private Date addTime;
	private boolean isRecommend;
	private boolean isBargain;
	private boolean isHot;
	private boolean isFresh;	
	private boolean isUsed;
	
	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}

	public void setBrandNum(int brandNum){this.brandNum=brandNum;}
	public int getBrandNum(){return this.brandNum;}

	public void setCategoryNum(int categoryNum){this.categoryNum=categoryNum;}
	public int getCategoryNum(){return this.categoryNum;}

	public void setShopNum(int shopNum){this.shopNum=shopNum;}
	public int getShopNum(){return this.shopNum;}

	public void setPrice(float price){this.price=price;}
	public float getPrice(){return this.price;}

	public void setOriginalPrice(float originalPrice){this.originalPrice=originalPrice;}
	public float getOriginalPrice(){return this.originalPrice;}

	public void setSoldCount(int soldCount){this.soldCount=soldCount;}
	public int getSoldCount(){return this.soldCount;}

	public void setGoodCommentCount(int goodCommentCount){this.goodCommentCount=goodCommentCount;}
	public int getGoodCommentCount(){return this.goodCommentCount;}
	
	public void setWeight(int weight){this.weight=weight;}
	public int getWeight(){return this.weight;}
	
	public void setColour(String colour){this.colour=colour;}
	public String getColour(){return this.colour;}
	
	public void setName(String name){this.name=name;}
	public String getName(){return this.name;}
	
	public void setPic(String pic){this.pic=pic;}
	public String getPic(){return this.pic;}
	
	public void setSpecification(String specification){this.specification=specification;}
	public String getSpecification(){return this.specification;}
	
	public void setType(String type){this.type=type;}
	public String getType(){return this.type;}
	
	public void setCompany(String company){this.company=company;}
	public String getCompany(){return this.company;}
	
	public void setProduceTime(String produceTime){this.produceTime=produceTime;}
	public String getProduceTime(){return this.produceTime;}	
	
	public void setDetail(String detail){this.detail=detail;}
	public String getDetail(){return this.detail;}	
	
	public void setAddTime(Date addTime){this.addTime=addTime;}
	public Date getAddTime(){return this.addTime;}
	
	public void setIsRecommend(boolean isRecommend){this.isRecommend=isRecommend;}
	public boolean getIsRecommend(){return isRecommend;}
	
	public void setIsBargain(boolean isBargain){this.isBargain=isBargain;}
	public boolean getIsBargain(){return isBargain;}
	
	public void setIsHot(boolean isHot){this.isHot=isHot;}
	public boolean getIsHot(){return isHot;}
	
	public void setIsFresh(boolean isFresh){this.isFresh=isFresh;}
	public boolean getIsFresh(){return isFresh;}
	
	public void setIsUsed(boolean isUsed){this.isUsed=isUsed;}
	public boolean getIsUsed(){return isUsed;}
	
}

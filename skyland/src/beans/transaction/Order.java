package beans.transaction;

import java.util.Date;

public class Order {
	private int num;			
	private int userNum;
	private int addressNum;		//收信人地址索引号
	private int goodsNum;		
	private int goodsCount;		//商品数量
	private int payment;		//支付方式
	private int status;			//交易状态
	private float price;		
	private boolean isPay;		//是否付款
	private Date orderTime;		//下单时间
	private Date shipTime;		//发货时间
	private Date successTime;	//买家确认收货时间
	private String userMessage;	//买家留言
	private String shopMessage;	//卖家留言
	
	/*
	private String recipientName;	//邮件收信人姓名
	private String recipientAddress;//收信人地址
	private String recipientPhone;	//收信人联系方式
	private String recipientPostcode; //收信人邮编
	*/
	
	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}

	public void setUserNum(int userNum){this.userNum=userNum;}
	public int getUserNum(){return this.userNum;}	
	
	public void setAddressNum(int addressNum){this.addressNum=addressNum;}
	public int getAddressNum(){return this.addressNum;}
	
	public void setGoodsNum(int goodsNum){this.goodsNum=goodsNum;}
	public int getGoodsNum(){return this.goodsNum;}

	
	public void setGoodsCount(int goodsCount){this.goodsCount=goodsCount;}
	public int getGoodsCount(){return this.goodsCount;}
	
	public void setPayment(int payment){this.payment=payment;}
	public int getPayment(){return this.payment;}
	
	public void setStatus(int status){this.status=status;}
	public int getStatus(){return this.status;}

	public void setPrice(float price){this.price=price;}
	public float getPrice(){return this.price;}

	public void setIsPay(boolean isPay){this.isPay=isPay;}
	public boolean getIsPay(){return this.isPay;}
	
	public void setOrderTime(Date orderTime){this.orderTime=orderTime;}
	public Date getOrderTime(){return this.orderTime;}
	
	public void setShipTime(Date shipTime){this.shipTime=shipTime;}
	public Date getShipTime(){return this.shipTime;}
	
	public void setSuccessTime(Date successTime){this.successTime=successTime;}
	public Date getSuccessTime(){return this.successTime;}
	
	public void setUserMessage(String userMessage){this.userMessage=userMessage;}
	public String getUserMessage(){return this.userMessage;}
	
	public void setShopMessage(String shopMessage){this.shopMessage=shopMessage;}
	public String getShopMessage(){return this.shopMessage;}
	
	/*
	public void setRecipientName(String recipientName){this.recipientName=recipientName;}
	public String getRecipientName(){return this.recipientName;}
	
	public void setRecipientAddress(String recipientAddress){this.recipientAddress=recipientAddress;}
	public String getRecipientAddress(){return this.recipientAddress;}
	
	public void setRecipientPhone(String recipientPhone){this.recipientPhone=recipientPhone;}
	public String getRecipientPhone(){return this.recipientPhone;}
	
	public void setRecipientPostcode(String recipientPostcode){this.recipientPostcode=recipientPostcode;}
	public String getRecipientPostcode(){return this.recipientPostcode;}
	*/


}

package action.transaction;

import org.apache.struts.action.ActionForm;

//UserOrderForm extends Order,ActionForm ?
public class UserOrderForm extends ActionForm {
	private int num;			
	//private int userNum;		
	private int goodsNum;
	private int addressNum;
	private int goodsCount;		//商品数量
	private int payment;		//支付方式
	//private int status;			//交易状态
	//private float price;		
	//private boolean isPay;		//是否付款
	//private Date orderTime;		//下单时间
	//private Date shipTime;		//发货时间
	//private Date successTime;	//买家确认收货时间
	private String userMessage;	//买家留言
	//private String shopMessage;	//卖家留言
	
	/*
	private String recipientName;	//邮件收信人姓名
	private String recipientAddress;//收信人地址
	private String recipientPhone;	//收信人联系方式
	private String recipientPostcode; //收信人邮编
	*/
	
	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}
	
	public void setAddressNum(int addressNum){this.addressNum=addressNum;}
	public int getAddressNum(){return this.addressNum;}
	
	public void setGoodsNum(int goodsNum){this.goodsNum=goodsNum;}
	public int getGoodsNum(){return this.goodsNum;}

	
	public void setGoodsCount(int goodsCount){this.goodsCount=goodsCount;}
	public int getGoodsCount(){return this.goodsCount;}
	
	public void setPayment(int payment){this.payment=payment;}
	public int getPayment(){return this.payment;}
	
	public void setUserMessage(String userMessage){this.userMessage=userMessage;}
	public String getUserMessage(){return this.userMessage;}
	
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

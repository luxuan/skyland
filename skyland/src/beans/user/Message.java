package beans.user;

public class Message extends UserBase {
	private int toUserNum;	//消息接收者的索引号
	private String content;	//消息内容

	public int getToUserNum(){return this.toUserNum;}
	public void setToUserNum(int toUserNum){this.toUserNum=toUserNum;}
	
	public String getContent(){return this.content;}
	public void setContent(String content){this.content=content;}
	
}

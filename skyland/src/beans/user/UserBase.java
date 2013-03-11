package beans.user;

import java.util.Date;

public class UserBase {
	private int num;		//对象主键，索引号
	private int userNum;	//用户索引号
	private Date time;		//添加时间
	private boolean useable;//是否有效
	
	
	public int getNum(){return this.num;}
	public void setNum(int num){this.num=num;}
	
	public int getUserNum(){return this.userNum;}
	public void setUserNum(int userNum){this.userNum=userNum;}
		
	public Date getTime(){return this.time;}
	public void setTime(Date time){this.time=time;}	
	
	public boolean getUseable(){return this.useable;}
	public void setUseable(boolean useable){this.useable=useable;}
}

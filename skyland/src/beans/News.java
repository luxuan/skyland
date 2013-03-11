package beans;

import java.sql.Timestamp;

public class News {
	private int num;		
	private int categoryNum;
	private int adminNum;
	private int viewCount;
	private String title;
	private String detail;
	private Timestamp time;
	private Boolean isUsed;
	

	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}

	public void setCategoryNum(int categoryNum){this.categoryNum=categoryNum;}
	public int getCategoryNum(){return this.categoryNum;}

	public void setAdminNum(int adminNum){this.adminNum=adminNum;}
	public int getAdminNum(){return this.adminNum;}

	public void setViewCount(int viewCount){this.viewCount=viewCount;}
	public int getViewCount(){return this.viewCount;}
	
	public void setTitle(String title){this.title=title;}
	public String getTitle(){return this.title;}
	
	public void setDetail(String detail){this.detail=detail;}
	public String getDetail(){return this.detail;}	
	
	public void setTime(Timestamp time){this.time=time;}
	public Timestamp getTime(){return this.time;}
	
	public void setIsUsed(Boolean isUsed){this.isUsed=isUsed;}
	public Boolean getIsUsed(){return this.isUsed;}
}

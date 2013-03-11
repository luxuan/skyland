package jsp;

import java.sql.Timestamp;

public class NewsList {
	private int num;
	private int categoryNum;
	private String title;
	private String categoryTitle;
	private Timestamp time;

	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}

	
	public void setCategoryNum(int categoryNum){this.categoryNum=categoryNum;}
	public int getCategoryNum(){return this.categoryNum;}	
	
	public void setTitle(String title){this.title=title;}
	public String getTitle(){return this.title;}

	public void setCategoryTitle(String categoryTitle){this.categoryTitle=categoryTitle;}
	public String getCategoryTitle(){return this.categoryTitle;}
	
	public void setTime(Timestamp time){this.time=time;}
	public Timestamp getTime(){return this.time;}

}

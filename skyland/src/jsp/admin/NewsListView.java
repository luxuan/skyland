package jsp.admin;

public class NewsListView {
	
	public Boolean isUsed;
	private int num;
	private String title;
	
	private String categoryName;
	private String author;
	private String date;
	
	public void setIsUsed(Boolean isUsed){this.isUsed=isUsed;}
	public Boolean getIsUsed(){return this.isUsed;}
	
	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}
	
	public void setTitle(String title){this.title=title;}
	public String getTitle(){return this.title;}
	
	public void setCategoryName(String categoryName){this.categoryName=categoryName;}
	public String getCategoryName(){return this.categoryName;}
	
	public void setAuthor(String author){this.author=author;}
	public String getAuthor(){return this.author;}
	
	public void setDate(String date){this.date=date;}
	public String getDate(){return this.date;}
}

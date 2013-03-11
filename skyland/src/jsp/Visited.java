package jsp;

public class Visited {
	protected int num;
	protected String name;
	private String pic;
	
	public Visited(int num){this.num=num;}
	
	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}

	public void setName(String name){this.name=name;}
	public String getName(){return this.name;}
	
	public void setPic(String pic){this.pic=pic;}
	public String getPic(){return this.pic;}
	
	public boolean equals(Visited visitedObject){
		if(this.num==visitedObject.num)return true;
		return false;
	}
}

package beans;

public class GoodsBrand extends BaseObject {

	private int score;
	private boolean isUsed;
	
	public void setScore(int score){this.score=score;}
	public int getScore(){return this.score;}
	
	public void setIsUsed(boolean isUsed){this.isUsed=isUsed;}
	public boolean getIsUsed(){return isUsed;}
}

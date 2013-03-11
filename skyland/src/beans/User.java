package beans;

import jsp.Controller;

public class User {
	private int num;
	private int score;
	private Integer defaultAddressNum;
	private boolean useable;
	private boolean speakable;
	private String username;
	private String password;
	private String realName;
	private String phone;
	private String email;
	private String address;
	private String zip;
	private String lastLoginTime;
	private String registerTime;
	private String remark;
	
	@Override
	public String toString(){return this.username;}
	
	public static String getUsername(int num){
		String hql="select user.username from User user where user.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (String)obj;
	}
	
	public int getNum(){return this.num;}
	public void setNum(int num){this.num=num;}
	
	public Integer getDefaultAddressNum(){return this.defaultAddressNum;}
	public void setDefaultAddressNum(Integer defaultAddressNum){this.defaultAddressNum=defaultAddressNum;}
	
	public int getScore(){return this.score;}
	public void setScore(int score){this.score=score;}
	
	public boolean getUseable(){return this.useable;}
	public void setUseable(boolean useable){this.useable=useable;}
	
	public boolean getSpeakable(){return this.speakable;}
	public void setSpeakable(boolean speakable){this.speakable=speakable;}
	
	public void setUsername(String username){this.username=username;}
	public String getUsername(){return this.username;}
	
	public void setPassword(String password){this.password=password;}
	public String getPassword(){return this.password;}
	
	public void setRealName(String realName){this.realName=realName;}
	public String getRealName(){return this.realName;}
	
	public void setPhone(String phone){this.phone=phone;}
	public String getPhone(){return this.phone;}
	
	public void setEmail(String email){this.email=email;}
	public String getEmail(){return this.email;}
	
	public void setAddress(String address){this.address=address;}
	public String getAddress(){return this.address;}
	
	public void setZip(String zip){this.zip=zip;}
	public String getZip(){return this.zip;}

	public void setLastLoginTime(String lastLoginTime){this.lastLoginTime=lastLoginTime;}
	public String getLastLoginTime(){return this.lastLoginTime;}
	
	public void setRegisterTime(String registerTime){this.registerTime=registerTime;}
	public String getRegisterTime(){return this.registerTime;}
	
	public void setRemark(String remark){this.remark=remark;}
	public String getRemark(){return this.remark;}	
}

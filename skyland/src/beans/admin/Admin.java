package beans.admin;

import java.util.Date;

import jsp.Controller;

public class Admin {
	private int num;
	private int shopNum;
	private int grade;
	private String ID;
	private String adminName;
	private String password;
	private String email;
	private String realName;
	private String mobil;
	private String homePhone;
	private String officePhone;
	private String lastIp;
	private String remark;
	private Date lastLoginTime;
	private Date registerTime;
	
	@Override
	public String toString(){return this.adminName;}
	
	public static String getRealName(int num){
		String hql="select admin.realName from Admin admin where admin.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (String)obj;
	}
	
	public static String getAdminName(int num){
		String hql="select admin.adminName from Admin admin where admin.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (String)obj;
	}
	
	public int getNum(){return this.num;}
	public void setNum(int num){this.num=num;}
	
	
	public void setShopNum(int shopNum){this.shopNum=shopNum;}
	public int getShopNum(){return this.shopNum;}
	
	public void setID(String ID){this.ID=ID;}
	public String getID(){return this.ID;}
	
	public int getGrade(){return this.grade;}
	public void setGrade(int grade){this.grade=grade;}
	
	public void setAdminName(String adminName){this.adminName=adminName;}
	public String getAdminName(){return this.adminName;}

	public void setPassword(String password){this.password=password;}
	public String getPassword(){return this.password;}
	
	public void setEmail(String email){this.email=email;}
	public String getEmail(){return this.email;}

	public void setRealName(String realName){this.realName=realName;}
	public String getRealName(){return this.realName;}
	
	public void setMobil(String mobil){this.mobil=mobil;}
	public String getMobil(){return this.mobil;}

	public void setHomePhone(String homePhone){this.homePhone=homePhone;}
	public String getHomePhone(){return this.homePhone;}

	public void setOfficePhone(String officePhone){this.officePhone=officePhone;}
	public String getOfficePhone(){return this.officePhone;}

	public void setLastIp(String lastIp){this.lastIp=lastIp;}
	public String getLastIp(){return this.lastIp;}
	
	public void setRemark(String remark){this.remark=remark;}
	public String getRemark(){return this.remark;}

	public void setLastLoginTime(Date lastLoginTime){this.lastLoginTime=lastLoginTime;}
	public Date getLastLoginTime(){return this.lastLoginTime;}
	
	public void setRegisterTime(Date registerTime){this.registerTime=registerTime;}
	public Date getRegisterTime(){return this.registerTime;}

}

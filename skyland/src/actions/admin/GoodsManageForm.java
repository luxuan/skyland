package actions.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import org.apache.struts.upload.FormFile;

import web.filter.ConvertEncoding;

import beans.Goods;



public class GoodsManageForm extends ActionForm{

	private FormFile pic;
	private Goods goods=new Goods();

	public void setNum(int num){this.goods.setNum(num);}
	public int getNum(){return this.goods.getNum();}
	
	public void setName(String name){this.goods.setName(ConvertEncoding.toUTF(name));}
	public String getName(){return this.goods.getName();}
	
	public void setBrandNum(int brandNum){this.goods.setBrandNum(brandNum);}
	public int getBrandNum(){return this.goods.getBrandNum();}

	public void setCategoryNum(int categoryNum){this.goods.setCategoryNum(categoryNum);}
	public int getCategoryNum(){return this.goods.getCategoryNum();}

	public void setShopNum(int shopNum){this.goods.setShopNum(shopNum);}
	public int getShopNum(){return this.goods.getShopNum();}

	public void setPrice(float price){this.goods.setPrice(price);}
	public float getPrice(){return this.goods.getPrice();}
	
	public void setWeight(int weight){this.goods.setWeight(weight);}
	public int getWeight(){return this.goods. getWeight();}
	
	public void setColour(String colour){this.goods.setColour(ConvertEncoding.toUTF(colour));}
	public String getColour(){return this.goods.getColour();}
	
	public void setSpecification(String specification){this.goods.setSpecification(ConvertEncoding.toUTF(specification));}
	public String getSpecification(){return this.goods.getSpecification();}
	
	public void setType(String type){this.goods.setType(ConvertEncoding.toUTF(type));}
	public String getType(){return this.goods.getType();}
	
	public void setCompany(String company){this.goods.setCompany(ConvertEncoding.toUTF(company));}
	public String getCompany(){return this.goods.getCompany();}
	
	public void setProduceTime(String produceTime){this.goods.setProduceTime(produceTime);}
	public String getProduceTime(){return this.goods.getProduceTime();}
	
	public void setDetail(String detail){this.goods.setDetail(ConvertEncoding.toUTF(detail));}
	public String getDetail(){return this.goods.getDetail();}
	
	public void setPic(FormFile pic){this.pic=pic;}
	public FormFile getPic(){return this.pic;}
	
	
	public void setIsRecommend(boolean isRecommend){this.goods.setIsRecommend(isRecommend);}
	public boolean getIsRecommend(){return goods.getIsRecommend();}
	
	public void setIsBargain(boolean isBargain){this.goods.setIsBargain(isBargain);}
	public boolean getIsBargain(){return goods.getIsBargain();}
	
	public void setIsHot(boolean isHot){this.goods.setIsHot(isHot);}
	public boolean getIsHot(){return goods.getIsHot();}
	
	public void setIsFresh(boolean isFresh){this.goods.setIsFresh(isFresh);}
	public boolean getIsFresh(){return goods.getIsFresh();}
	
	public Goods getGoods(){return this.goods;}

	public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
	    ActionErrors errors = new ActionErrors();
	    return errors;
	}
	public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
		
	}

}

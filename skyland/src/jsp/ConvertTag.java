package jsp;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

import config.ErrorDo;

public class ConvertTag extends BodyTagSupport {
	private String fuction;
	private String value;
	
	public void setFunction(String function){this.fuction=function;}
	public void setValue(String value){this.value=value;}

	public int doStartTag()throws JspException{
		return EVAL_BODY_BUFFERED;
	}
	
	public int doEndTag() throws JspException{
		JspWriter jw=pageContext.getOut();
		String context=null;
		String num;
		BodyContent bc=this.getBodyContent();
		if(bc==null){
			if(this.value==null){return EVAL_PAGE;}
			else num=this.value;
		}else{
			String body=bc.getString();
			int index=0;
			num="";
			while(body.charAt(index)<'0'||body.charAt(index)>'9')index++;
			while(!(body.charAt(index)<'0'||body.charAt(index)>'9')){
				num+=body.charAt(index);
				index++;
			}
		}

		if("shopName".equals(this.fuction)){
			context=getShopName(num);
		}else if("goodsName".equals(this.fuction)){
			context=getGoodsName(num);
		}else if("goodsPrice".equals(this.fuction)){
			context=""+getGoodsPrice(num);
		}else{
			context="NULL";
		}
	
		try {
			jw.write(context);
		} catch (IOException e) {
			ErrorDo.log(e.toString());
		}
		return EVAL_PAGE;
	}
	
	public String getShopName(String num){
		String hql="select shop.name from Shop shop where shop.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (String)obj;
	}
	
	public String getGoodsName(String num){
		String hql="select goods.name from Goods goods where goods.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (String)obj;
	}
	
	public float getGoodsPrice(String num){
		String hql="select goods.price from Goods goods where goods.num='"+num+"'";
		Object obj=Controller.get(hql);
		return (Float)obj;
	}
}

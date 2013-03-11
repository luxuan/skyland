package actions.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.Controller;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

import web.filter.ConvertEncoding;

import config.Name;
import config.Page;

import beans.Category;

public class GoodsCategoryManageAction extends DispatchAction {
	
	//处理事务：新增大类管理
	public ActionForward add(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		DynaActionForm form=(DynaActionForm)actionForm;
		String name=(String)form.get("name");
		String isHotStr=form.get("isHot").toString();
		boolean isHot;
		if("true".equals(isHotStr))isHot=true;
		else isHot=false;
		name=ConvertEncoding.toUTF(name);

		Category category =new Category();
		category.setName(name);
		category.setIsHot(isHot);
		category.setIsUsed(true);

		String successStr;
		if(Controller.save(category)){
			Page.addGoodsCategory(category);
			
			successStr="成功添加大类 "+name+"<br/>\n";
			successStr+="<a href=\"goodsCategory-select.do?method=updateView&property="+category.getNum()+"\">重新修改</a><br/>\n";
		}else{
			successStr="添加 "+name+"失败，<br/>\n";
			successStr+="<a href=\"goods_category_add.jsp\">重试</a><br/>\n";
		}
		
		successStr+="<a href=\"goods_category_view.do?method=viewList\">返回大类管理列表</a>";
		
		request.getSession().setAttribute(Name.AdminSuccessInfo, successStr);
		return mapping.findForward("success");
	}
	
	//初始化新闻列表页面
	public ActionForward viewList(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		String newsHql="from Category category";
		List<Category> list=Controller.getList(newsHql);
		
		//直接使用Category类的信息填充
		request.getSession().setAttribute(Name.AdminGoodsCategoryList, list);
		return mapping.findForward("success");
	}
	
	//处理事务：开启新闻或是关闭新闻，不使用ActionForm，主键通过URL由HttpServletRequest对象获取
	public ActionForward setIsUsed(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		int num=Integer.parseInt(request.getParameter(Name.Property));
		Category category=Page.getGoodsCategory(num);
		boolean visible=true;
		if(category==null){
			String hql="from Category c where c.num='"+num+"'";
			category=Controller.get(hql);
			visible=false;
		}
		String code=request.getParameter("code");
		if("start".equals(code)){
			category.setIsUsed(true);
			if(!visible){Page.addGoodsCategory(category);}
		}else{
			category.setIsUsed(false);
			if(visible){Page.remvoeGoodsCategory(num);}
		}
		Controller.update(category);
		
		
		response.sendRedirect("goods_category_view.do?method=viewList");
		return null;
	}
	
	//初始化更新新闻页面，不使用ActionForm，主键通过URL由HttpServletRequest对象获取
	public ActionForward updateView(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		int num=Integer.parseInt(request.getParameter(Name.Property));
		Category category=Page.getGoodsCategory(num);
		if(category==null){
			String hql="from Category c where c.num='"+num+"'";
			category=Controller.get(hql);
		}
		
		request.getSession().setAttribute(Name.AdminGoodsCategory, category);
		response.sendRedirect("goods_category_update.jsp");
		return null;
	}	

	
	//处理事务：更新新闻
	public ActionForward update(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 

		DynaActionForm form=(DynaActionForm)actionForm;
		String name=(String)form.get("name");
		String isHotStr=form.get("isHot").toString();
		boolean isHot;
		if("true".equals(isHotStr))isHot=true;
		else isHot=false;
		name=ConvertEncoding.toUTF(name);

		//category可能是全局托管对象，也可能是更新前在数据库中查找到的对象
		Category category =(Category)request.getSession().getAttribute(Name.AdminGoodsCategory);
		category.setName(name);
		category.setIsHot(isHot);

		String successStr;
		if(Controller.update(category)){
			successStr="成功更新大类 "+name+"<br/>\n";
			successStr+="<a href=\"goodsCategory-select.do?method=updateView&property="+category.getNum()+"\">重新修改</a><br/>\n";
		}else{
			successStr="更新 "+name+"失败，<br/>\n";
			successStr+="<a href=\"goodsCategory-select.do?method=updateView&property="+category.getNum()+"\">重试</a><br/>\n";
		}
		
		successStr+="<a href=\"goods_category_view.do?method=viewList\">返回大类列表</a>";
		request.getSession().setAttribute(Name.AdminSuccessInfo, successStr);
		return mapping.findForward("success");
	}

	
}

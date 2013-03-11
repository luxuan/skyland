package actions.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import jsp.Controller;
import config.Name;
import actions.AbstractManageAction;
import actions.tools.Filer;
import beans.Goods;
import beans.admin.Admin;

public class GoodsManageAction extends AbstractManageAction {

	
	//处理事务：新增大类管理
	public ActionForward add(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session=request.getSession();
		GoodsManageForm form=(GoodsManageForm)actionForm;
		Goods goods=form.getGoods();
		goods.setIsUsed(true);
		
		Admin admin=(Admin)session.getAttribute(Name.Admin);
		int shopNum=admin.getShopNum();
		goods.setShopNum(shopNum);
		
		FormFile picFile=form.getPic();
		if(picFile.getContentType()!=null){
			String picPathName=Filer.saveFile(picFile);
			goods.setPic(picPathName);
		}

		String successStr;
		if(Controller.save(goods)){
			successStr="成功添加商品 "+goods.getName()+"<br/>\n";
			successStr+="<a href=\"goods-select.do?method=updateView&property="+goods.getNum()+"\">重新修改</a><br/>\n";
		}else{
			successStr="添加商品 "+goods.getName()+"失败，<br/>\n";
			successStr+="<a href=\"goods_add.jsp\">重试</a><br/>\n";
		}
		
		successStr+="<a href=\"goods_view.do?method=viewList\">返回商品管理列表</a>";
		
		request.getSession().setAttribute(Name.AdminSuccessInfo, successStr);
		return mapping.findForward("success");
	}
	
	//初始化商品列表页面
	public ActionForward viewList(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		System.out.println("GoodsManageAction.viewList.....................");
		String hql="from Goods goods";
		List<Goods> list=Controller.getList(hql);
		
		//直接使用Category类的信息填充
		request.getSession().setAttribute(Name.AdminGoodsList, list);
		return mapping.findForward("success");
	}
	
	//处理事务：开启商品或是关闭商品，不使用ActionForm，主键通过URL由HttpServletRequest对象获取
	public ActionForward setIsUsed(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		int num=Integer.parseInt(request.getParameter(Name.Property));
		String hql="from Goods goods where goods.num='"+num+"'";
		Goods goods=Controller.get(hql);
		String code=request.getParameter("code");
		if("start".equals(code)){
			goods.setIsUsed(true);
		}else{
			goods.setIsUsed(false);
		}
		Controller.update(goods);
		
		response.sendRedirect("goods_view.do?method=viewList");
		return null;
	}
	
	//初始化更新商品页面，不使用ActionForm，主键通过URL由HttpServletRequest对象获取
	public ActionForward updateView(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		int num=Integer.parseInt(request.getParameter(Name.Property));
		String hql="from Goods goods where goods.num='"+num+"'";
		Goods goods=Controller.get(hql);
		
		request.getSession().setAttribute(Name.AdminGoods, goods);
		response.sendRedirect("goods_update.jsp");
		return null;
	}	

	
	//处理事务：更新商品
	public ActionForward update(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 

		GoodsManageForm form=(GoodsManageForm)actionForm;
		Goods formGoods=form.getGoods();
		Goods goods =(Goods)request.getSession().getAttribute(Name.AdminGoods);
		
		//将formGoods复制到托管对象，？是否能将普通对象变为托管对象
		goods.setCategoryNum(formGoods.getCategoryNum());
		goods.setName(formGoods.getName());
		goods.setPrice(formGoods.getPrice());
		goods.setBrandNum(formGoods.getBrandNum());
		goods.setSpecification(formGoods.getSpecification());
		goods.setColour(formGoods.getColour());
		goods.setWeight(formGoods.getWeight());
		goods.setCompany(formGoods.getCompany());
		goods.setProduceTime(formGoods.getProduceTime());
		goods.setIsRecommend(formGoods.getIsRecommend());
		goods.setIsBargain(formGoods.getIsBargain());
		goods.setIsHot(formGoods.getIsHot());
		goods.setIsFresh(formGoods.getIsFresh());
		goods.setDetail(formGoods.getDetail());
		
		FormFile picFile=form.getPic();
		if(picFile.getContentType()!=null){
			String picPathName=Filer.saveFile(picFile);
			goods.setPic(picPathName);
		}

		String successStr;
		if(Controller.update(goods)){
			successStr="成功更新商品 "+goods.getName()+"<br/>\n";
			successStr+="<a href=\"goods-select.do?method=updateView&property="+goods.getNum()+"\">重新修改</a><br/>\n";
		}else{
			successStr="更新 "+goods.getName()+"失败，<br/>\n";
			successStr+="<a href=\"goods-select.do?method=updateView&property="+goods.getNum()+"\">重试</a><br/>\n";
		}
		
		successStr+="<a href=\"goods_view.do?method=viewList\">返回商品列表</a>";
		request.getSession().setAttribute(Name.AdminSuccessInfo, successStr);
		return mapping.findForward("success");
	}

	
}

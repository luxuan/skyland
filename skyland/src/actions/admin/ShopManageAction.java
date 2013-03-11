package actions.admin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;
import jsp.admin.ShopListView;
import jsp.admin.ShopView;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

import config.Name;

import actions.tools.Filer;
import beans.Shop;
import beans.admin.Admin;


public class ShopManageAction extends DispatchAction {
	public ActionForward add(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		UploadActionForm form=(UploadActionForm)actionForm;
		Admin admin=form.getAdmin();
		Controller.save(admin);

		Shop shop=form.getShop();
		shop.setAdminNum(admin.getNum());//admin had been filled with [num];
		shop.setIsUsed(true);
		
		FormFile picFile=form.getPic();
		FormFile licenseFile=form.getLicense();
		
		if(picFile.getContentType()!=null){
			String picPathName=Filer.saveFile(picFile);
			shop.setPic(picPathName);
		}
		if(licenseFile.getContentType()!=null){
			String licensePathName=Filer.saveFile(licenseFile);
			shop.setLicense(licensePathName);
		}
		
		System.out.println("admin.ID="+admin.getID());
		Controller.save(shop);
		
		admin.setShopNum(shop.getNum());
		Controller.update(admin);
		String successStr="新增商店";
		request.getSession().setAttribute(Name.AdminSuccessInfo, successStr);
		response.sendRedirect("success.jsp");
		return null;
	}

	public ActionForward viewList(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		//init list begin
		String shopHql="from Shop shop where shop.isUsed='true'";
		List<Shop> shopList=Controller.getList(shopHql);
		
		List<ShopListView> list=new ArrayList<ShopListView>();
		Iterator<Shop> iter=shopList.iterator();
		Shop shop=null;
		ShopListView slv=null;
		while(iter.hasNext()){
			shop=iter.next();
			slv=new ShopListView();
			slv.setNum(shop.getNum());
			slv.setGoodsCount(shop.getGoodsCount());
			slv.setSoldCount(shop.getSoldCount());
			slv.setPhone(shop.getPhone());
			slv.setEmail(shop.getEmail());
			slv.setShopName(shop.getName());
			
			slv.setAdminName(Admin.getRealName(shop.getAdminNum()));
			
			list.add(slv);
		}
		//init list end
		
		request.getSession().setAttribute(Name.AdminShopList,list);
		System.out.println("view list.................");
		return mapping.findForward("success");
	}
	
	public ActionForward setIsUsed(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		DynaActionForm form=(DynaActionForm)actionForm;
		int num=(Integer)form.get("num");
		String hql="from Shop shop where shop.num='"+num+"'";
		
		Shop shop=Controller.get(hql);
		shop.setIsUsed(false);
		Controller.update(shop);
		return mapping.findForward("success");
	}	
	
	public ActionForward updateView(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		DynaActionForm form=(DynaActionForm)actionForm;
		int num=(Integer)form.get("num");
		String hql="from Shop shop where shop.num='"+num+"'";
		Shop shop=Controller.get(hql);
		
		hql="from Admin admin where admin.shopNum='"+num+"' and admin.grade='0'";
		Admin admin=Controller.get(hql);
		
		ShopView sv=new ShopView();
		sv.setShop(shop);
		sv.setAdmin(admin);
		
		HttpSession session=request.getSession();
		session.setAttribute(Name.AdminShopView, sv);

		response.sendRedirect("shop_update.jsp");
		return null;
	}	

	public ActionForward update(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 

		UploadActionForm form=(UploadActionForm)actionForm;
		HttpSession session=request.getSession();
		
		//updateView set
		ShopView sv=(ShopView)session.getAttribute(Name.AdminShopView);
		session.removeAttribute(Name.AdminShopView);
		Shop shop=sv.getShop();
		Admin admin=sv.getAdmin();

		//update Shop where UploadActionForm had been init 
		Shop shopForm=form.getShop();
		shop.setName(shopForm.getName());
		shop.setCityNum(shopForm.getCityNum());
		shop.setAddress(shopForm.getAddress());
		shop.setPhone(shopForm.getPhone());
		shop.setQq(shopForm.getQq());
		shop.setEmail(shopForm.getEmail());
		shop.setFax(shopForm.getFax());
		shop.setDetail(shopForm.getDetail());

		//update Admin where UploadActionForm had been init 
		Admin adminForm=form.getAdmin();
		admin.setAdminName(adminForm.getAdminName());
		admin.setPassword(adminForm.getPassword());
		admin.setRealName(adminForm.getRealName());
		admin.setID(adminForm.getID());
		
		FormFile picFile=form.getPic();
		FormFile licenseFile=form.getLicense();
		if(picFile.getContentType()!=null){
			String picPathName=Filer.saveFile(picFile);
			shop.setPic(picPathName);
		}
		if(licenseFile.getContentType()!=null){
			String licensePathName=Filer.saveFile(licenseFile);
			shop.setLicense(licensePathName);
		}
		Controller.update(shop);
		Controller.update(admin);

		String successStr="更新商铺信息";
		session.setAttribute(Name.AdminSuccessInfo, successStr);
		response.sendRedirect("success.jsp");
		return null;
	}
	
}

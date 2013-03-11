package actions.admin;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;
import jsp.admin.NewsListView;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

import config.Name;
import config.Page;

import actions.AbstractManageAction;
import beans.News;
import beans.admin.Admin;


public class NewsManageAction extends DispatchAction {
	
	//处理事务：新增新闻
	public ActionForward add(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		DynaActionForm form=(DynaActionForm)actionForm;
		HttpSession session=request.getSession();
		int categoryNum=(Integer)form.get("categoryNum");
		String title=form.getString("title");
		String detail=form.getString("editorContent");
		title=new String(title.getBytes("iso-8859-1"),"utf-8");
		detail=new String(detail.getBytes("iso-8859-1"),"utf-8");
		
		Admin admin=(Admin)session.getAttribute(Name.Admin);
		
		News news =new News();
		news.setAdminNum(admin.getNum());
		news.setTitle(title);
		news.setCategoryNum(categoryNum);
		news.setDetail(detail);
		news.setIsUsed(true);
		Controller.save(news);
		
		String successStr="成功添加 "+title+"<br/>\n";
		successStr+="<a href=\"news_add.jsp\">继续添加</a><br/>\n";
		successStr+="<a href=\"news_view.do?method=viewList\">返回资讯列表</a>";
		
		request.getSession().setAttribute(Name.AdminSuccessInfo, successStr);
		return mapping.findForward("success");
	}
	
	//初始化新闻列表页面
	public ActionForward viewList(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		HttpSession session=request.getSession();
		
		String newsHql="from News news";
		List<News> newsList=Controller.getList(newsHql);
		
		List<NewsListView> list=new ArrayList<NewsListView>();
		Iterator<News> iter=newsList.iterator();
		News news=null;
		NewsListView nlv=null;
		while(iter.hasNext()){
			news=iter.next();
			nlv=new NewsListView();
			nlv.setIsUsed(news.getIsUsed());
			nlv.setNum(news.getNum());
			nlv.setTitle(news.getTitle());
			
			int categoryNum=news.getCategoryNum();
			String categoryName=Page.getNewsCategoryName(categoryNum);
			nlv.setCategoryName(categoryName);
			
			int adminNum=news.getAdminNum();
			String author=Admin.getAdminName(adminNum);
			nlv.setAuthor(author);
			
			Timestamp time=news.getTime();
			String date;
			if(time==null){date="暂无";}
			else{date=time.toString();}
			nlv.setDate(date);
			
			list.add(nlv);
		}
		session.setAttribute(Name.AdminNewsList, list);
		return mapping.findForward("success");
	}
	
	//处理事务：开启新闻或是关闭新闻，不使用ActionForm，主键通过URL由HttpServletRequest对象获取
	public ActionForward setIsUsed(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		int num=Integer.parseInt(request.getParameter(Name.Property));
		String hql="from News news where news.num='"+num+"'";
		News news=Controller.get(hql);
		String code=request.getParameter("code");
		if("start".equals(code)){
			news.setIsUsed(true);
		}else{
			news.setIsUsed(false);
		}
		Controller.update(news);
		response.sendRedirect("news_view.do?method=viewList");
		return null;
	}
	
	//初始化更新新闻页面，不使用ActionForm，主键通过URL由HttpServletRequest对象获取
	public ActionForward updateView(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		int num=Integer.parseInt(request.getParameter(Name.Property));
		String hql="from News news where news.num='"+num+"'";
		News news =Controller.get(hql);
		request.getSession().setAttribute(Name.AdminNews, news);
		response.sendRedirect("news_update.jsp");
		return null;
	}	

	
	//处理事务：更新新闻
	public ActionForward update(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 

		DynaActionForm form=(DynaActionForm)actionForm;
		HttpSession session=request.getSession();
		News news=(News)session.getAttribute(Name.AdminNews);
		session.removeAttribute(Name.AdminNews);
		
		int categoryNum=(Integer)form.get("categoryNum");
		String title=form.getString("title");
		String detail=form.getString("editorContent");
		title=new String(title.getBytes("iso-8859-1"),"utf-8");
		detail=new String(detail.getBytes("iso-8859-1"),"utf-8");
		
		news.setTitle(title);
		news.setCategoryNum(categoryNum);
		news.setDetail(detail);
		String successStr;
		if(Controller.update(news)){
			successStr="成功更新资讯 "+title+"<br/>\n";
			successStr+="<a href=\"news-select.do?method=updateView&property="+news.getNum()+"\">重新修改</a><br/>\n";
		}else{
			successStr="更新 "+title+"失败，<br/>\n";
			successStr+="<a href=\"news-select.do?method=updateView&property="+news.getNum()+"\">重试</a><br/>\n";
		}
		
		successStr+="<a href=\"news_view.do?method=viewList\">返回资讯列表</a>";
		session.setAttribute(Name.AdminSuccessInfo, successStr);
		return mapping.findForward("success");
	}

	
}

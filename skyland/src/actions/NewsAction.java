package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jsp.Controller;
import config.Name;
import beans.News;


public class NewsAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 

		String property=request.getParameter(Name.Property);
		if(property!=null&&property.length()>0){
			String hql="from News news where news.num='"+property+"'";
			News news=Controller.get(hql);
			int viewCount=news.getViewCount();
			news.setViewCount(++viewCount);
			Controller.update(news);
			request.getSession().setAttribute(Name.News, news);
		}
		return mapping.findForward("success");	
	}
}

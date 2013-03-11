package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import config.Name;
import actions.tools.SaveSession;

public class NewsListAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 

		String property=request.getParameter(Name.Property);
		String condition;
		if(property!=null&&property.length()>0){condition="where news.categoryNum='"+property+"' and news.isUsed='true'";}
		else condition="where news.isUsed='true'";
		SaveSession.newsList(request.getSession(), condition, Name.NewsList);
		return mapping.findForward("success");	
	}
}

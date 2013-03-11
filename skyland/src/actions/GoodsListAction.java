package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import config.Hql;
import config.Name;
import actions.tools.SaveSession;

public class GoodsListAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		
		SaveSession.bargain(request.getSession(), Hql.GoodsBargainCondition, Name.BargainList);
		SaveSession.goodsSearch(request.getSession(), Hql.GoodsSearchCondition, Name.SearchList);
		return mapping.findForward("success");	
	}
}

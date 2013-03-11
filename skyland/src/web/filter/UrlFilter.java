package web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import config.Name;
import config.Page;

public class UrlFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest)arg0;
		HttpServletResponse response=(HttpServletResponse)arg1;
		
		StringBuffer url=request.getRequestURL();
		String str=request.getServletPath();
		
		boolean isRewrite=true;
		if(str.length()>7&&str.substring(0, 7).equals("/admin/")&&(!"index.jsp".equals(str.substring(7)))){
			//HttpSession session=request.getSession();
			//if(session.getAttribute(Name.Admin)==null){return;}
			isRewrite=false;
		}
		
		if(isRewrite){
			//除admin中frame的jsp页面，其它页面重写url：[.jsp]-->[.htm]
			url.replace(url.length()-3, url.length(), Page.UrlSuffix);
			
			String urlApp=request.getQueryString();
			if(urlApp!=null){url.append("?"+urlApp);}
			response.sendRedirect(url.toString());
		}else{
			arg2.doFilter(arg0, arg1);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}

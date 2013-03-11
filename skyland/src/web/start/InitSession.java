package web.start;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import config.Hql;
import config.Name;
import config.Page;

import jsp.Controller;

import beans.Category;
import beans.City;
import beans.GoodsBrand;
import beans.NewsCategory;

public class InitSession implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
		arg0.getServletContext().removeAttribute(Name.GoodsCategoryList);
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Web start:contextInitialized");
		
		//init sort.jsp
		List<Category> listCategory=Controller.getList(Hql.Category);
		Page.setGoodsCategoryList(listCategory);
		arg0.getServletContext().setAttribute(Name.GoodsCategoryList, listCategory);
		
		//init city
		List<City> listCity=Controller.getList(Hql.City);
		Page.setCityList(listCity);
		arg0.getServletContext().setAttribute(Name.CityList,listCity);
		
		//init newsCategory in Page and ServletContext 
		List<NewsCategory> listNewsCategory=Controller.getList(Hql.NewsCategory);
		Page.setNewsCategoryList(listNewsCategory);
		arg0.getServletContext().setAttribute(Name.NewsCategoryList,listNewsCategory);
		
		//init goodsBrand in Page and ServletContext 
		List<GoodsBrand> listGoodsBrand=Controller.getList(Hql.GoodsBrand);
		Page.setGoodsBrandList(listGoodsBrand);
		arg0.getServletContext().setAttribute(Name.GoodsBrandList,listGoodsBrand);
		
		//init upload file
		String path=arg0.getServletContext().getRealPath("");
		Page.setPath(path+File.separatorChar);
		System.out.println(path+File.separatorChar);

	}

}

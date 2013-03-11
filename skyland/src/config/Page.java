package config;

import java.util.List;

import beans.BaseObject;
import beans.Category;
import beans.City;
import beans.GoodsBrand;
import beans.NewsCategory;

public class Page {
	public static boolean Debug=true;
	
	public static String UrlSuffix="htm";
	
	private static String path;
	public static void setPath(String path){Page.path=path;}
	public static String getPath(){return Page.path;}

	private static ListSession<NewsCategory> ncls=new ListSession<NewsCategory>();
	public static void setNewsCategoryList(List<NewsCategory> list){Page.ncls.setList(list);}
	public static void addNewsCategory(NewsCategory newsCategory){Page.ncls.add(newsCategory);}
	public static String getNewsCategoryName(int num){return Page.ncls.getName(num);}
	

	private static ListSession<Category> gcls=new ListSession<Category>();
	public static void setGoodsCategoryList(List<Category> list){Page.gcls.setList(list);}
	//public static List<Category> getGoodsCategoryList(){return Page.gcls.getList();}
	public static void addGoodsCategory(Category goodsCategory){Page.gcls.add(goodsCategory);}
	public static Category getGoodsCategory(int num){return Page.gcls.get(num);}/////////////
	public static void remvoeGoodsCategory(int num){Page.gcls.remove(num);}/////////////
	public static String getGoodsCategoryName(int num){return Page.gcls.getName(num);}

	private static ListSession<City> cls=new ListSession<City>();
	public static void setCityList(List<City> list){Page.cls.setList(list);}
	public static void addCity(City city){Page.cls.add(city);}
	public static String getCityName(int num){return Page.cls.getName(num);}
	
	private static ListSession<GoodsBrand> gbls=new ListSession<GoodsBrand>();
	public static void setGoodsBrandList(List<GoodsBrand> list){Page.gbls.setList(list);}
	public static void addGoodsBrand(GoodsBrand goodsBrand){Page.gbls.add(goodsBrand);}
	public static String getGoodsBrandName(int num){return Page.gbls.getName(num);}
	
}

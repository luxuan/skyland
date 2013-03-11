package actions.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import beans.Category;
import beans.City;
import beans.Goods;
import beans.News;
import beans.NewsCategory;

import jsp.Controller;
import jsp.GoodsBargain;
import jsp.GoodsSearch;
import jsp.GoodsVisited;
import jsp.NewsList;

public class SaveSession {
	public static boolean bargain(HttpSession session,String condition,String sessionName){
		
		String hql="from Goods goods "+condition;
		List<Goods> listGoods=Controller.getList(hql);
		if(listGoods.size()>0){
			List<GoodsBargain> listBargain=new ArrayList<GoodsBargain>();
			Iterator<Goods> iter=listGoods.iterator();
			Goods goods=null;
			GoodsBargain gb=null;
			while(iter.hasNext()){
				goods=iter.next();
				gb=new GoodsBargain(goods.getNum());
				gb.setName(goods.getName());
				gb.setPic(goods.getPic());
				gb.setPrice(goods.getPrice());
				gb.setOriginalPrice(goods.getOriginalPrice());
				listBargain.add(gb);
			}
			session.setAttribute(sessionName, listBargain);
		}
		return true;
	}
	
	public static boolean goodsBar(HttpSession session,String condition,String sessionName){
		String hql="from Goods goods "+condition;
		List<Goods> listGoods=Controller.getList(hql);

		if(listGoods.size()>0){
			ArrayList<GoodsVisited> listVisited=new ArrayList<GoodsVisited>();
			Iterator<Goods> iter=listGoods.iterator();
			Goods goods=null;
			GoodsVisited gs=null;
			while(iter.hasNext()){
				goods=iter.next();
				gs=new GoodsVisited(goods.getNum());
				
				int shopNum=goods.getShopNum();
				hql="select shop.name,shop.cityNum from Shop shop where shop.num='"+shopNum+"'";
				Object[] ss=Controller.get(hql);
				gs.setShopName(ss[0].toString());
				int cityNum=(Integer)ss[1];
				gs.setCity(City.getName(cityNum));

				gs.setName(goods.getName());
				gs.setPrice(goods.getPrice());
				gs.setPic(goods.getPic());
				listVisited.add(gs);
			}
			session.setAttribute(sessionName, listVisited);
		}
		return true;
	}
	
	public static boolean goodsSearch(HttpSession session,String condition,String sessionName){
		String hql="from Goods goods "+condition;
		List<Goods> listGoods=Controller.getList(hql);

		if(listGoods.size()>0){
			ArrayList<GoodsSearch> listSearch=new ArrayList<GoodsSearch>();
			Iterator<Goods> iter=listGoods.iterator();
			Goods goods=null;
			GoodsSearch gs=null;
			while(iter.hasNext()){
				goods=iter.next();
				gs=new GoodsSearch(goods.getNum());
				gs.setName(goods.getName());
				gs.setPic(goods.getPic());
				gs.setPrice(goods.getPrice());
				//gs.setCaption(goods.getCaption());
				
				int categoryNum=goods.getCategoryNum();

				gs.setCategory(Category.getName(categoryNum));

				listSearch.add(gs);
			}
			session.setAttribute(sessionName, listSearch);
		}
		return true;
	}
	
	public static boolean newsList(HttpSession session,String condition,String sessionName){
		String hql="from News news "+condition;
		List<News> listNews=Controller.getList(hql);

		if(listNews.size()>0){
			ArrayList<NewsList> listSearch=new ArrayList<NewsList>();
			Iterator<News> iter=listNews.iterator();
			News news=null;
			NewsList gs=null;
			while(iter.hasNext()){
				news=iter.next();
				gs=new NewsList();
				
				gs.setNum(news.getNum());
				gs.setCategoryNum(news.getCategoryNum());
				gs.setTitle(news.getTitle());
				gs.setTime(news.getTime());
				
				
				gs.setCategoryTitle(NewsCategory.getName(gs.getCategoryNum()));
				listSearch.add(gs);
			}
			session.setAttribute(sessionName, listSearch);
		}
		return true;
	}
	

}

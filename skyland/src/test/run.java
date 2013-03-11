package test;

import java.text.DateFormat;
import java.util.Date;
import java.io.File;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import config.Hql;

import beans.Category;
import beans.Goods;
import beans.News;
import beans.NewsCategory;
import beans.Shop;
import beans.User;
import beans.transaction.Order;

import jsp.Controller;
class A{
	public A()throws Exception {
		
	}
}
public class run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String hql="select shop.name from Shop shop where shop.num='2'";
		Object obj=Controller.get(hql);
		System.out.println((String)obj);
		//String hql="delete from Goods g where g.num='9'";
		//Controller.delete(hql);
		//String yue
	}
	public void testTime(){
		String hql="from News n where n.num='2'";
		News news=Controller.get(hql);
		System.out.println(news.getTime());
	}
	
	public void testConstruct(){
		String hql="select new Shop(s.name,s.address) from Shop s";
		List<Shop> list=Controller.getList(hql);
		for(Shop shop:list){
			System.out.println(shop.getName()+"-"+shop.getAddress());
		}
		
		hql="select s.num,s.detail,s.address from Shop s where s.num='2'";
		Object[] ss=Controller.get(hql);
		System.out.println(ss[0]+"-"+ss[1]+"-"+ss[2]);
		//System.out.println(shop.getAddress());
		
	}
	public void testGoods(){
		String hql="from Goods goods where goods.num=4 ";
		Goods g=Controller.get(hql);
		System.out.println(g.getDetail());
	}
	public void testUser(){
		String hql="from User user where user.username='lius'";
		User user=Controller.get(hql);
		System.out.println(user.getPassword());
		user=new User();
		user.setUsername("中国2");
		user.setPassword("有案例2");
		System.out.println(Controller.save(user));

	}
	public void stroe(){
		List list=Controller.getList(Hql.Category);
		for(Object obj:list){
			Category bsa=(Category)obj;
			System.out.println(bsa.getName());
		}
		/*
        Configuration conf = new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session sess = sf.openSession();
        System.out.println(sess);
        Transaction tx = sess.beginTransaction();
		BigSort bs=new BigSort();
		bs.setIsHot(false);
		bs.setName("main 测试2");
        sess.save(bs);
        tx.commit();
        sess.close(); 
        */  
		

		///*
		//String hql="delete from BigSort b where b.num>=17";
		//System.out.println("delete:"+Controller.delete(hql));
		Category bs=new Category();
		///bs.setNum(17);
		//bs.setIsHot(true);
		bs.setName("没有添加IsHot3");
		System.out.println(Controller.save(bs));
		
		//String hql="delete from BigSort b where b.num=22";
		//System.out.println("delete:"+Controller.delete(hql));
		///*
		/*
		NewsSort ns=new NewsSort();
		
		ns.setTitle("国际新闻3");
		System.out.println(Controller.save(ns));
		
		NewsItem ni=new NewsItem();
		ni.setName("一条新闻标题测试");
		System.out.println(Controller.save(ni));
		*/
	}
}

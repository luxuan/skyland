package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import config.ErrorDo;

public class DaoDb {
	private Session session=HibernateUtil.currentSession();
	private Transaction tx= session.beginTransaction();
	
	public <T> List<T> getList(String hql){
		Query query=session.createQuery(hql);
		List<T> list=query.list();
		return list;
	}

	public <T> T get(String hql) {
		List<T> list=getList(hql);
		///when property not in num of dbo.T ,list.size()==0;
		if(list.size()==0){return null;}
		return list.get(0);
	}

	public <T> boolean save(T t) {
		try{
			tx.begin();//by this time:==[tx=session.beginTransaction();]
			session.save(t);
			tx.commit();
			return true;
		}catch(Exception ex){
			ErrorDo.log(ex.toString());
			tx.rollback();
			return false;
		}
	}

	public <T> boolean update(T t) {
		try{
			tx.begin();
			session.update(t);
			tx.commit();
			return true;
		}catch(Exception ex){
			ErrorDo.log(ex.toString());
			tx.rollback();
			return false;
		}
	}

	public <T> boolean saveOrUpdate(T t) {
		try{
			tx.begin();
			session.saveOrUpdate(t);
			tx.commit();
			return true;
		}catch(Exception ex){
			ErrorDo.log(ex.toString());
			tx.rollback();
			return false;
		}
	}
	public boolean delete(String hql) {
		try{
			tx.begin();
			Query query=session.createQuery(hql);
			query.executeUpdate();
			tx.commit();
			return true;
		}
		catch(Exception ex){
			ErrorDo.log(ex.toString());
			tx.rollback();
			return false;
		}
	}
	
	public <T> void merge(T t){session.merge(t);}

}

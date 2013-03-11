package config;

import java.util.Iterator;
import java.util.List;

import beans.BaseObject;

/*
 * <T extends BaseObject>构造原因：
 * BaseObject另有它用且其用于管理数据和操作数据的基本方法；
 * ListSession主要用来完善操作 BaseObject与其它类组合的方法；
 */
public class ListSession<T extends BaseObject> {
	protected List<T> list=null;
	public void setList(List<T> list){this.list=list;}
	//public List<T> getList(){return this.list;}
	public void add(T base){this.list.add(base);}
	
	public void remove(int num){
		T base=get(num);
		if(base!=null)list.remove(base);
	}
	
	public T get(int num){
		Iterator<T> iter=list.iterator();
		T base=null;
		while(iter.hasNext()){
			base=iter.next();
			if(base.getNum()==num)return base;
		}
		return null;
	}
	
	public String getName(int num){
		T base=get(num);
		if(base!=null)return base.getName();
		return null;
	}
}

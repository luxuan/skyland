package jsp;

import java.util.List;

import dao.DaoDb;
/*
 * 单例模式，响应分散的jsp请求
 */
public class Controller {
	private static Controller instance=null;
	private static DaoDb dao=new DaoDb();
	
	private Controller(){}
	public static Controller getInstance(){
		if(instance==null){
			instance=new Controller();
		}
		return instance;
	}
	public static <T> List<T> getList(String hql){return dao.getList(hql);}
	public static <T> T get(String hql){return dao.get(hql);}
	public static <T> boolean save(T t){return dao.save(t);}
	public static <T> boolean update(T t) {return dao.update(t);}
	public static <T> boolean saveOrUpdate(T t){return dao.saveOrUpdate(t);}
	public static boolean delete(String hql) {return dao.delete(hql);}
	public static <T> void merge(T t){dao.merge(t); }
}

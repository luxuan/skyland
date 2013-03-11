package config;

public class Hql {
	//key select or select all;
	
	public static String NewsCategory="from NewsCategory where isUsed='true'";
	public static String Category="from Category b where isUsed='true'";
	public static String GoodsBrand="from GoodsBrand goodsBrand where isUsed='true'";
	public static String NewsItem="from News n";
	public static String City="from City c";
	public static String Shop="from Shop s where s.num=";
	public static String Goods="from Goods g where g.num=";
	
	public static String ManageUser="from User";

	
	public static String ShopBargainCondition="";
	public static String GoodsBargainCondition="";
	public static String IndexBargainCondition="where goods.num<6";
	public static String IndexFreshCondition="where goods.num>3";
	public static String IndexCrazyCondition="";
	public static String IndexHotCondition="";
	public static String GoodsSearchCondition="";
	public static String ShopSearchCondition="";
	
}

package web.filter;

import java.io.UnsupportedEncodingException;
import config.ErrorDo;
public class ConvertEncoding {

	public static String toUTF(String isoStr) {
		String utfStr=null;
		try{
			utfStr=new String(isoStr.getBytes("iso-8859-1"),"utf-8");
		}catch(UnsupportedEncodingException ex){
			ErrorDo.log(ex.toString());
		}
		return utfStr;
	}
}

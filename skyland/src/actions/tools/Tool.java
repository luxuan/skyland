package actions.tools;

import java.util.ArrayList;
import java.util.Iterator;

import jsp.Visited;

public class Tool {
	
	public static <T extends Visited> T find(ArrayList<T> list,T t){
		Iterator<T> iter=list.iterator();
		T temp=null;
		while(iter.hasNext()){
			temp=iter.next();
			if(temp.equals(t))return temp;
		}
		return null;
	}
}

package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveTest{
	public void remove(List<String> list){
    	int flag=0;
//    	Iterator i=list.iterator();
    	for(int i=0;i<list.size();i++) {
    		if(list.get(i).equals("abc")){
                flag++;
                if(flag==3||flag==4){
                  list.remove(i);
                }
             }
    	}
 
          
    }
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		RemoveTest rt=new RemoveTest();
		list.add("abc");
		list.add("ghy");
		list.add("kad");
		list.add("abc");
		list.add("pds");
		list.add("abc");
		list.add("das");
		list.add("abc");
		list.add("abc");
		list.add("abc");
		System.out.println(list);
		rt.remove(list);
		System.out.println(list);
	}
}
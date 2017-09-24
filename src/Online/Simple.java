package Online;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Simple {
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(new Student(101,"Pu",23));
		al.add(new Student(105,"Name",27));
		al.add(new Student(102,"Pud",21));
	//	System.out.println(al);
		Collections.sort(al,new CompareExample());
		Iterator itr = al.iterator();
		
		
		
		
		
		
		
  
		while(itr.hasNext()){
			Student st =(Student)itr.next();
			System.out.println(st.rollno +" "+ st.name +" "+st.age);
		}
	}

}

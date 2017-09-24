package Online;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareExample implements Comparator<Student>{
	

	@Override
	public int compare(Student obj1, Student obj2) {
		// TODO Auto-generated method stub
		Student s1=(Student)obj1;
		Student s2=(Student)obj2;
	
		
		
		
		
		
		
		if(s1.rollno==s2.rollno){
			return 0;
		}
		
		
		
		
		
		
		
		
		else if(s1.rollno>s2.rollno){
			return 1;
		}
		else{
			return -1;
		}
		
	}

}

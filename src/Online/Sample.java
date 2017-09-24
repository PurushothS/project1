package Online;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Sample {
public static void main(String[] args){
	String s = "my name is purushothaman sundaramoorthy";
	char[] ch =s.toCharArray();
	HashMap<Character, Integer> m	= new HashMap<>();
	for(char c : ch){
	if(c!=' '){
		if(m.containsKey(c)){
			m.put(c, m.get(c)+1);
		}
		else{
			
			
			
			
			
			
			
			
			m.put(c,1);
		}
	}
	}
	
	Map<Character,Integer> tree = new TreeMap<>(m);
//	Set s5 = tree.entrySet();
	//Iterator itr = s5.iterator();
	//while(itr.hasNext()){
		//Map.Entry mm = (Map.Entry)itr.next();
	for(Map.Entry mm : tree.entrySet()){	
	System.out.println(mm.getKey()+"="+mm.getValue());
	}
	//System.out.println(tree);
}
}
package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void testHashMap(){
		System.out.println("Inside HashMap...");
		HashMap<String,Integer> hm=new HashMap<>();
		
		  hm.put("Amit", 25);  
		  hm.put("Vijay", 30);
		  hm.put("Monica", 28);
		  hm.put("Rahul", 27);
		  hm.put("Mani", 32);
		  
		  System.out.println(hm);
		  
		 System.out.println("Contains Amit ?" + hm.containsKey("Amit"));
		 System.out.println("Age of Amit is " + hm.get("Amit"));
		 
		 //iterating using keyset
		 Set<String> names = hm.keySet();
		 for(String name : names){
			 System.out.println(name + " " + hm.get(name));
		 }
		 //iterating using entryset
		 Set<Map.Entry<String, Integer>> mappings = hm.entrySet();
		 for(Map.Entry<String, Integer> mapping : mappings){
			 System.out.println(mapping.getKey() + " " +  mapping.getValue());
		 }
		 
		 //we can remove from keyset 
		 
		 names.remove("Amit");
		 System.out.println(hm);
		 
		 System.out.println("-----------------------------------");
		 Map<String, Map<String, Object>> userprofile = new HashMap<>();
		 
		 Map<String, Object> profile = new HashMap<>();
		 
		 profile.put("Age", 25);
		 profile.put("Dept", "QA");
		 profile.put("City", "Delhi");
		 userprofile.put("John", profile);
		 
		 profile = new HashMap<>();
		 profile.put("Age", 30);
		 profile.put("Dept", "Java");
		 profile.put("City", "Noida");
		 
		 userprofile.put("Raj", profile);
		 
		 System.out.println(userprofile);
		 
		 Map<String, Object> profile1 = userprofile.get("John");
		 int age = (Integer)profile1.get("Age");
		 System.out.println("john's age is " + age);
		 
	}
	public static void main(String[] args) {
		
		testHashMap();
		  
		  
		  
		  
	}

}

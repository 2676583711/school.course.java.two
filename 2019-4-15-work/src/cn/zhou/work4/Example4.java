package cn.zhou.work4;

public class Example4 {

	public static void main(String[] args) {
		String s="HelloWorld";
		
		char[]c = s.toCharArray();
		 
		 StringBuffer sf=new StringBuffer();
		 for(char c2:c){
			 
			 System.out.println(c2);
			 if(Character.isUpperCase(c2)){
				  //如果大寫
				 System.out.println("c2-1:"+Character.toLowerCase(c2));
			 }
			 
			 if(Character.isLowerCase (c2)){
				 //如果小寫
				  System.out.println("c2-2:"+ Character.toUpperCase(c2) );
			 }
			 
			 sf.append(c2);
			 System.out.println("StringBuffer:"+sf.toString());
			 
		 }
		 
		
		 
	}
}
 
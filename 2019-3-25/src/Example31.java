public class Example31 {
	public static int divide(int x, int y) throws Exception {
		return x / y;
	}
	
public void finalize()  { //throws Throwable
	System.out.println("finalize() is runing......");
};

	public static void recy(){
		Example31 e =new Example31();
		e=null;
		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println("e"+e);
		
		int i=0;
		while(i<10){
			System.out.println("No"+i);
			i++;
		}
		
	}
	public static void main(String[] args)   { // throws MySelfException
		try {
			
			recy();
			System.out.println("*/*/**/*///**/*//");
			recy();
			System.out.println("dibvide=" + divide(5, 0));
		 
		} catch (Exception e) {  //catch (MySelfException e) {
			 e.printStackTrace();
			//throw new MySelfException("���ܞ�0");
		}
		// System.out.println("dibvide="+divide(5,0));

	}
}

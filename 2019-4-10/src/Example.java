import java.util.concurrent.Callable;

/*
 * 
 * java 多线程，测试，使用，学习
 */

public class Example implements Callable {//Runnable,  extends Thread
	
//	@Override
//	public void run() { //重寫thread類的run方法實現多線程
//		
//		for(int i=0;i<=10;i++){
//			System.out.println("卖第："+i+"张票");
//		}
//		
//	}
	
	public void shout(){
		for(int i=0;i<=20;i++){
			System.out.println("报数："+i);
		}
	}
	public static void main(String[] args) {
		
		
//		new Example().shout();  
//		new Example().start(); 
		/*
		 * shout(); //先
		 * start(); //后
		 * 
		 * 后启动线程
		 * 程序运行多次，结果固定不变
		 */
		
		//***********************************
//		new Example().start();  
//		
//		new Thread(new Example(),"example").start();
		
		try {
			Object call = new Example().call();
			System.out.println("call="+call);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Example().shout();  
		
		/*
		 * 报数：0 报数：1 报数：2 卖第：0张票 卖第：1张票 卖第：2张票 卖第：3张票 卖第：4张票 卖第：5张票
			卖第：6张票 卖第：7张票 卖第：8张票 卖第：9张票卖第：10张票 报数：3 报数：4 报数：5
			.......报数：17 报数：18 报数：19 报数：20
			
			先启动线程，程序运行多次，顺序不固定会改变
			
		 */
		
		
		
	}

	@Override
	public Object call() throws Exception {
		//shout();
		for(int i=0;i<=20;i++){
			System.out.println("报110数："+i);
		}
		return null;
	}
}

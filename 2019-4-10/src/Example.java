/*
 * 
 * java ���̣߳����ԣ�ʹ�ã�ѧϰ
 */

public class Example extends Thread implements Runnable {
	
	@Override
	public void run() { //�،�thread�run�������F�ྀ��
		
		for(int i=0;i<=10;i++){
			System.out.println("���ڣ�"+i+"��Ʊ");
		}
		
	}
	
	public void shout(){
		for(int i=0;i<=20;i++){
			System.out.println("������"+i);
		}
	}
	public static void main(String[] args) {
		
		
//		new Example().shout();  
//		new Example().start(); 
		/*
		 * shout(); //��
		 * start(); //��
		 * 
		 * �������߳�
		 * �������ж�Σ�����̶�����
		 */
		
		//***********************************
		new Example().start();  
		
		new Thread(new Example()).start();
		
		new Example().shout();  
		
		/*
		 * ������0 ������1 ������2 ���ڣ�0��Ʊ ���ڣ�1��Ʊ ���ڣ�2��Ʊ ���ڣ�3��Ʊ ���ڣ�4��Ʊ ���ڣ�5��Ʊ
			���ڣ�6��Ʊ ���ڣ�7��Ʊ ���ڣ�8��Ʊ ���ڣ�9��Ʊ���ڣ�10��Ʊ ������3 ������4 ������5
			.......������17 ������18 ������19 ������20
			
			�������̣߳��������ж�Σ�˳�򲻹̶���ı�
			
		 */
		
		
		
	}
}
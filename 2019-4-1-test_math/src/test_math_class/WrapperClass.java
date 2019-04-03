package test_math_class;

import java.util.Calendar;
import java.util.Date;

/*
 * ��װ��
 * �����������
 */
public class WrapperClass {

	
	public WrapperClass() {
		super();
		testDate();
		testCalendar();
		
	}

	public static void main(String[] args) {
		new WrapperClass();
	}
	
	public void testDate(){
		
		Date  d1= new Date();
		
		Date d2 = new Date(System.currentTimeMillis());
		
		Date  d3= new Date(100);
		System.out.println("d1:"+d1);//d1:Mon Apr 01 10:52:00 CST 2019
		System.out.println("d2:"+d2);//	d2:Mon Apr 01 10:52:00 CST 2019
	
		
		System.out.println("d3:"+d3); //d3:Thu Jan 01 08:00:00 CST 1970
		
	}
	public void testCalendar(){
		System.out.println("**********************************************");

		//calendar���ǳ���ģ��޷�ʹ��new�ؼ���ʵ����
		Calendar instance = Calendar.getInstance();
		
		instance.set(Calendar.ZONE_OFFSET, 0);
		//��ȡʱ��
		System.out.println("instance.getTime()=="+instance.getTime());
		//��ȡʱ��
		System.out.println("instance.YEAR=="+instance.YEAR);
		//��ȡʱ��
		System.out.println("instance.MONTH=="+instance.MONTH);
		//��ȡʱ��
		System.out.println("instance.DATE=="+instance.DATE);
		//��ȡʱ��
		System.out.println("instance.DAY_OF_MONTH=="+instance.DAY_OF_MONTH);
		//��ȡʱ��
		System.out.println("instance.DAY_OF_WEEK=="+instance.DAY_OF_WEEK);
		//��ȡʱ��
		System.out.println("instance.DAY_OF_WEEK_IN_MONTH=="+instance.DAY_OF_WEEK_IN_MONTH);
		//��ȡʱ��
		System.out.println("instance.DAY_OF_YEAR=="+instance.DAY_OF_YEAR);
		
	
		
	}
}
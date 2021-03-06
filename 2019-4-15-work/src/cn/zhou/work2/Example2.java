package cn.zhou.work2;

public class Example2 {

	public static void main(String[] args) {
	  Student student = new Student("asd",23);
	  
	  student.show();
	  
	  
	  UnderGraduate underGraduate = new UnderGraduate("UnderGraduate",36,"doctor");
	  underGraduate.show();
	}
}


class Student {
	String name;
	int  age;
	 
	  public Student() {
			super();
		}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	 public void show(){
		 System.out.println("student="+toString());
	 }
}


class UnderGraduate extends Student{


	private String degree;

	public UnderGraduate(String name, int age,String degree) {
		super();
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	
	
	 @Override
	public String toString() {
		 return "UnderGraduate [name=" + name + ", age=" + age + ",degree=" + degree + "]";
	}


	public void show(){
		 System.out.println("UnderGraduate="+toString());
	 }
	
}

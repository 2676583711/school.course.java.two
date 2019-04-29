package cn.zhou.work;

public class P103_5 {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("abc");
		student.setScore(100);
		
		System.out.println("student.get:"+student.getName()+":"+student.getScore());
		System.out.println("student="+student);
		
		Student student2 = new Student("a110",69);
		System.out.println("student2="+student2);
	}
}


class Student {
	private String name;
	private int score;
	
	public Student() {
		super();
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}

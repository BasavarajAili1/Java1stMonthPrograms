package newproject2;

public class studentApp {
	public static void main(String []args) {
		Student s1=new Student();
		Student s2=new Student();
		
		s1.id=100;
		s1.name="Basavaraj";
		s1.branch="ECE";
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.branch);
		s1.eat();
		s1.study();
		
		System.out.println("=====================");
		s2.id=500;
		s2.name="Suhas";
		s2.branch="CSE";
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.branch);
		s2.assignment();
		s2.study();
		
	}

}

package string;

public class Student implements Cloneable{
	int id,age;
	String name;
	
public Student(int i, int age, String name) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
}

	@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
	public static void main(String[] args) throws CloneNotSupportedException{
		Student s1 = new Student(72, 22, "raji");
		Student s2 = new Student(71, 22, "riyaa");
		Student s3 = (Student) s2.clone();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}

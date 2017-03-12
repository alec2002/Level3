import java.util.ArrayList;


public class ClassRoom {
	int blue = 0;
	int brown = 0;
	int green = 0;
	Student Alec = new Student("Blue", "Alec");
	Student Bob = new Student("Brown", "Bob");
	Student Tim = new Student("Green", "Tim");
	Student Dallen = new Student("Brown", "Dallen");
	Student Juan = new Student("Green", "Juan");
	
	Student Jay = new Student("Blue", "Jay");
	Student Richard = new Student("Green", "Richard");
	Student Alex = new Student("Green", "Alex");
	Student Bill = new Student("Brown", "Bill");
	Student Dill = new Student("Green", "Dill");
	ArrayList<Student> student = new ArrayList<Student>();
	String eyeColor;
public static void main(String[] args) {
	ClassRoom x = new ClassRoom();
}
ClassRoom(){
student.add(Alec);
student.add(Bob);
student.add(Tim);
student.add(Dallen);
student.add(Juan);
student.add(Jay);
student.add(Richard);
student.add(Alex);
student.add(Bill);
student.add(Dill);

for (Student s: student) {
	if (s.eyeColor.equals("Blue")) {
		blue += 1;
	}
	if (s.eyeColor.equals("Brown")) {
		brown += 1;
	}
	if (s.eyeColor.equals("Green")) {
		green += 1;
	}
}
if (blue > brown && blue > green) {
	System.out.println("blue = " + blue);
}
if (brown > blue && brown > green) {
	System.out.println("brown = " + brown);
}
if (green > blue && green > brown) {
	System.out.println("green = " + green);
}
}

}
 class Student{
	String eyeColor;
	String name;
	Student(String e, String n){
		eyeColor = e;
		name = n;
	}
}
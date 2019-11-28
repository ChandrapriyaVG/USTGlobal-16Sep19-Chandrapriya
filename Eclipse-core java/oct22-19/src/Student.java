
public class Student {
 String name;
 int rollno;
 String house;
 int classSec;
 char grade;
 public Student(String name, int rollno, int classSec, String house, char grade) {
	this.name = name;
	this.rollno = rollno;
	this.classSec = classSec;
	this.house = house;
	this.grade = grade;
	this.details();
 	}
 void details() {
	 System.out.println("Name is "+name);
	 System.out.println("Roll no. "+rollno);
	 System.out.println("Class is "+classSec);
	 System.out.println("Grade is "+grade);
	 System.out.println("House is "+house);
	 System.out.println("*************************");
	 }
 public static void main(String[] args) {
	
	Student s1 = new Student("chummi", 12, 3, "kanad", 'A');
	Student s2 = new Student("tummi", 45, 6, "kanad", 'B');
	Student s3 = new Student("dummi", 87, 8, "sandipani", 'C');
	Student s4 = new Student("kummi", 99, 7, "sandipani", 'A');
	Student s5 = new Student("summi", 41, 5, "vyas", 'B');
	Student s6 = new Student("hummi", 32, 3, "vyas", 'C');
	Student s7 = new Student("nummi", 65, 4, "panini", 'A');
	Student s8 = new Student("pummi", 64, 7, "panini", 'B');
	Student s9 = new Student("yummi", 97, 1, "kanad", 'c');
	Student s10 = new Student("bummi", 98, 9, "sandipani", 'A');
}
 }
	
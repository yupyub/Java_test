class Student{
	int kor,eng,math;
	public Student(int k,int e,int m){
		kor = k;
		eng = e;
		math = m;
	}
	public void changePoint(int k,int e,int m){
		kor = k+10;
		eng = e+10;
		math = m+10;
	}
	public void changePoint(Student s){
		s.kor += 20;
		s.eng += 20;
		s.math += 20;
	}
}
public class Student_Point{
	public static void main(String[] args){
		int kor = 30,eng = 40, math = 50;
		Student s1 = new Student(kor,eng,math);
		s1.changePoint(kor,eng,math);
		s1.changePoint(s1.kor,s1.eng,s1.math);
		System.out.println(s1.kor+" "+s1.eng+" "+s1.math);
		s1.changePoint(s1);
		System.out.println(s1.kor+" "+s1.eng+" "+s1.math);
	}
}

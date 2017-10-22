class Imp implements IntFace{

	public void IntMethod(IntFace inf){
		Imp sp = (Imp)inf;
		System.out.println("IntMethod Execution");
	}
}
interface IntFace{
	public void IntMethod(InterFace inf);
}
class ClassA{
	public void ClassAMethod(InterFace inf){
		System.out.println("ClassAMethod Execution");
		inf.IntMethod(inf);
	}
}
class InterFace{
	public static void main(String[] args){
		Imp mp = new Imp();
		ClassA ca = new ClassA();
		ca.ClassAMethod(mp);
	}

}

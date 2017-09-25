class class_GC{
	public int a;
	class_GC(){
		this.a = 10;
	}
	public static void main(String[] args){
		class_GC s1 = new class_GC();
		class_GC s2 = new class_GC();
		s2 = s1;
		s1 = null;
		System.out.println(s2.a);
	}
}

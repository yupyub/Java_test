class Clss{
	public static int suja = 100;
	public static void method(){
		System.out.println("Java!");
		suja += 10;
	}
}

class Yeje{
	public static void main(String [] args){
		int n = Clss.suja;
		System.out.println(n);
		Clss.method();
		n = Clss.suja;
		System.out.println(n);
	}
}

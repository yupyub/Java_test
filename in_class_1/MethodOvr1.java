/* Mehtod Overload */
/* Overloading occures if sevral methods have different
   data type or different number of method parameter with
   same method name. */
class Clss{
	static int gbal;
	public static void method(int s,int e){

			for(int i = s;i<=e;i++){
				System.out.print(i+" ");
			}
			System.out.println();
	}

	public static long method(int e){
		long sum = 0;
		for(int i = 1;i<=e;i++){
			System.out.print(i+" ");
			sum += i;
		}
		System.out.println();
		return sum;
	}

	public static void method(double d){
		System.out.println("\n <" + Math.sin(d) + Math.cos(d) + Math.tan(d) + ">");
	}
}
class MethodOvrl{
	public static void main(String[] args){
		long h;
		Clss.method(10,20);
		h = Clss.method(5);
		System.out.println("\n h="+h);
		Clss.method(3.141592/6);
	}
}

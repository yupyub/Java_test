class Clss{
	public static void method(int[] x, int y){
		for(int i = 0;i<x.length;i++){
			x[i] += y;
			y = 123;
		}
	}
}
class Byij{
	public static void main(String[] args){
		int[] a = {1,3,5,7,9};
		int b = 10;
		Clss.method(a,b);
		for(int i = 0;i<a.length;i++){
			System.out.println("a["+i+"] :"+a[i]);
		}
		System.out.println(">>b : "+b);
	}
}

class Cl1{
	public int pubnum;
	private int privnum;
	public Cl1(int a,int b){
		pubnum = a;
		privnum = b;
	}
	public int method(){
		return privnum;
	}
}
class PubPriv{
	public static void main(String[] args){
		Cl1 tmp = new Cl1(5,10);
		int a,b;
		a = tmp.pubnum;
		//b = tmp.privnum;
		//privnum is private modifier
		b = tmp.method();
		System.out.println(a + " " + b);
	}
}

class Sell{
	private String name;
	private int num;
	private int cost;
	public Sell(){							//make Default
	}
	public Sell(String s,int n,int c){		//Constructor Overloading
		name = s;
		num = n;
		cost = c;
	}
	public void show(){
		System.out.println(name + "\t" + num + "\t" + cost);
	}
}
class Object1{
	public static void main(String[] args){
		Sell a1 = new Sell("apple",5,1000);
		Sell a2 = new Sell();
		a1.show();
		a2.show();
	}
}

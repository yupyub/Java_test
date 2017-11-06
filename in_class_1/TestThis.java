class Sell{
	public Sell(String item){
		this(item,123);
		//this(item,120,1000);
	}
	public Sell(String item, int sr){
		this(item,sr,4567);
	}
	public Sell(String item, int sr,int cost){
		System.out.println(item+"\t"+sr+"\t"+cost);
	//	this(item);
	}
}
class TestThis{
	public static void main(String[] args){
		Sell s1 = new Sell("aaaa");

	}
}

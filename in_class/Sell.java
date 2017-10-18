//filename : subcls.java
// store at pkg directory
package pkg;
public class Sell{
	protected String sname;
	protected int num;
	protected int cost;
	public Sell(String sn,int n,int c){
		sname = sn;
		num = n;
		cost = c;
	}
	public void show(){
		System.out.println(sname+"\t"+num+"\t"+cost);
	}
}

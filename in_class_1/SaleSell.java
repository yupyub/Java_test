//filename : subcls.java
// store at pkg directory
package pkg;
public class SaleSell extends Sell{
	private double rate;
	public SaleSell(String sn,int n,int c,double r){
		super(sn,n,c);
		rate = r;
	}
	public void saleshow(){
		System.out.println(sname+"\t"+num+"\t"+cost+"\t"+cost*(1-rate));
	}
}

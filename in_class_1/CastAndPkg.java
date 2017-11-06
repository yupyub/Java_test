import pkg.Sell;
import pkg.SaleSell;
public class CastAndPkg{
	public static void main(String[] args){
		Sell[] arr = new Sell[4];
		arr[0] = new Sell("Apple",5,1000);
		arr[1] = new SaleSell("Remon",7,3000,0.22);
		for(int i = 0;i<2;i++){
			arr[i].show();
			if(arr[i] instanceof SaleSell)
				((SaleSell)arr[i]).saleshow();
		}
	}
}

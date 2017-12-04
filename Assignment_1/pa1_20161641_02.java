class pa1_20161641_02{
	public static void main(String[] args){
		int i,j;
		for(i = 2;i<10;i++){		//make i loop
			for(j = 1;j<10;j++){	//make j loop
				System.out.println(i+" X "+j+" = "+i*j);	//print multiply
			}
			if(i!=9)	//print separator except last line(same as Output Example)
				System.out.println("--------------");
			
		}
	}
}

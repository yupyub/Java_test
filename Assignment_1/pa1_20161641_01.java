class pa1_20161641_01{
    public static void main(String[] args){
        int t = 0;
        int a = 0,b= 0,c = 0,d = 0,e = 0,f = 0;
        while((t++)<100){				//Loop 100 times
            int n = (int)(100*Math.random()) + 1;	//make random number
            if(1 <=n && n <=19){		//if number is in range 1<=n<=19
                System.out.println(t+". range is 01~19 (number is "+n+")");
                a++;
            }
            else if(20 <=n && n <= 39){		//if number is in range 20<=n<=39
                System.out.println(t+". range is 20~39 (number is "+n+")");
                b++;
            }
            else if(40 <= n && n <= 59){	//if number is in range 40<=n<=59
                System.out.println(t+". range is 40~59 (number is "+n+")");
                c++;
            }
            else if(60 <= n && n <= 79){	//if number is in range 60<=n<=79
                System.out.println(t+". range is 60~79 (number is "+n+")");
                d++;
            }
            else if(80 <= n && n <= 99){	//if number is in range 80<=n<=99
                System.out.println(t+". range is 80~99 (number is "+n+")");
                e++;
            }
            else{	//if number is in range n = 100
                System.out.println(t+". range is 100 (number is "+n+")");
                f++;
            }
        }
		//print counting numbers
        System.out.println("(result : "+a+" "+b+" "+c+" "+d+" "+e+" "+f+")");
    }

}

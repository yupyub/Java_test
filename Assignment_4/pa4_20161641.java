import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class pa4_20161641 extends Applet implements ActionListener{
	Panel pp;
	Panel p[] = new Panel[7];	//panel
	TextArea t;	//Calculator TextArea
	Button b[] = new Button[22];	//button
	String[] str = {"root","x^2","%","Del.","7","8","9","/","4","5","6","*","1","2","3","+","+/-","0",".","-","C","="};
	//str : button names
	int[] blk = {0,0,0,0,1,1,1,0,1,1,1,0,1,1,1,0,0,1,0,0,0,0};
	//blk : button color
	String data1 = "0";
	//save number data
	String data2 = "";
	//save temp number data
	String oper = "";
	//double num1 = 0.0, num2 = 0.0;
	int operflag = 0, dotflag1 = 0, dotflag2 = 0, nflag = 0,signflag = 0;
	//flag each state
	//operflag : operator is already inputed
	//dotflag1,2 : each data1,2 is Double type(dot is exist)
	//nflag : take new input
	//signflag : check data1's sign
	public pa4_20161641(){
		t = new TextArea("\n0",1,34,3);	//set Calculator TextArea
	    t.setFocusable(false);	//prevent typing
		t.setBackground(new Color(240, 240, 240));	//set TextArea Background color
		for(int i = 0;i<7;i++){	//make panel
			p[i] = new Panel();
		}
		pp = new Panel();
		for(int i = 0;i<22;i++){	//make each button
			b[i] = new Button(str[i]);
			b[i].addActionListener(this);
			if(blk[i] == 1){
				b[i].setBackground(Color.black);
				b[i].setForeground(Color.white);
			}
			else{
				b[i].setBackground(Color.white);
			}
		}
		p[0].add(t);		//add text area
		p[1].setLayout(new GridLayout(1,5,2,2));	//set each panel's layout
		p[2].setLayout(new GridLayout(5,1,2,2));
		p[3].setLayout(new GridLayout(5,1,2,2));
		p[4].setLayout(new GridLayout(5,1,2,2));
		p[5].setLayout(new GridLayout(5,1,2,2));
		p[6].setLayout(new GridLayout(2,0,2,2));
		for(int i = 0;i<20;i++){		//add each button
			p[i%4+2].add(b[i]);
		}
		p[6].add(b[20]);
		p[6].add(b[21]);
		for(int i = 2;i<7;i++){		//merge all panel
			p[1].add(p[i]);
		}
		pp.setLayout(new BorderLayout(6,5));
		pp.setBackground(new Color(50,50,50));
		pp.add(p[0],"North");
		pp.add(p[1],"Center");
		add("Center",pp);		//add Calculator panel
	}
	public void init(){
		pp.setPreferredSize(new Dimension(300,450));		//set Size
	}

	public void actionPerformed(ActionEvent e){
		//System.out.println("Button :: "+ e.getActionCommand());
		switch(e.getActionCommand()){		//switch each button action
			case "root" :
				f_Oper();
				f_Root();
				data2 = data1;		//save the data
				oper = "";			//delete operator
				operflag = 0;		//init operflag
				nflag = 1;			//set nflag : input new input data
				dotflag2 = dotflag1;	//save dotflag1
				dotflag1 = 0;		//init dotflag1
				signflag = 0;		//init signflag
				break;
			case "x^2" :
				f_Oper();
				f_Pow();
				data2 = data1;		//save the data
				oper = "";			//delete operator
				operflag = 0;		//init operflag
				nflag = 1;			//set nflag : input new input data
				dotflag2 = dotflag1;	//save dotflag1
				dotflag1 = 0;		//init dotflag1
				signflag = 0;		//init signflag
				break;
			case "%" :
				if(operflag == 0){		//if input is first operator
					operflag = 1;
				}
				else{		//else
					f_Oper();
				}
				oper = "%";		//renew operator
				nflag = 1;		//flag new input (data1)
				data2 = data1;	//save data1 to data2
				dotflag2 = dotflag1;	//save dotflag1 to dotflag2
				dotflag1 = 0;	//clear dotflag1
				signflag = 0;	//clear signflag
				break;
			case "Del.":		//delete one number
				f_Del();
				break;
			case "/":
				if(operflag == 0){		//if input is first operator
					operflag = 1;
				}
				else{
					f_Oper();
				}
				oper = "/";		//renew operator
				nflag = 1;		//flag new input (data1)
				data2 = data1;	//save data1 to data2
				dotflag2 = dotflag1;	//save dotflag1 to dotflag2
				dotflag1 = 0;	//clear dotflag1
				signflag = 0;	//clear signflag
				break;
			case "*":
				if(operflag == 0){		//if input is first operator
					operflag = 1;
				}
				else{
					f_Oper();
				}
				oper = "*";		//renew operator
				nflag = 1;		//flag new input (data1)
				data2 = data1;	//save data1 to data2
				dotflag2 = dotflag1;	//save dotflag1 to dotflag2
				dotflag1 = 0;	//clear dotflag1
				signflag = 0;	//clear signflag
				break;
			case "+":
				if(operflag == 0){		//if input is first operator
					operflag = 1;
				}
				else{
					f_Oper();
				}
				oper = "+";		//renew operator
				nflag = 1;		//flag new input (data1)
				data2 = data1;	//save data1 to data2
				dotflag2 = dotflag1;	//save dotflag1 to dotflag2
				dotflag1 = 0;	//clear dotflag1
				signflag = 0;	//clear signflag
				break;
			case "-":
				if(operflag == 0){		//if input is first operator
					operflag = 1;
				}
				else{
					f_Oper();
				}
				oper = "-";		//renew operator
				nflag = 1;		//flag new input (data1)
				data2 = data1;	//save data1 to data2
				dotflag2 = dotflag1;	//save dotflag1 to dotflag2
				dotflag1 = 0;	//clear dotflag1
				signflag = 0;	//clear signflag
				break;
			case ".":
				f_Dot();		//make number Doble type
				break;
			case "+/-":			//change number sign
				f_Sign();
				break;
			case "C":			//clear all data
				f_Clear();
				break;
			case "=":			//print out result
				f_Oper();
				data2 = data1;
				oper = "";
				operflag = 0;
				nflag = 1;
				dotflag2 = dotflag1;
				dotflag1 = 0;
				signflag = 0;
				break;
			default:			//input number
				f_addnum(e.getActionCommand());
				break;
		}
		t.setText("\n" + data1);		//print data1 on textarea
	}
	public void f_Oper(){		//execute each operation
		switch(oper){
		case "%" :
			f_Mod();
			break;
		case "/":
			f_Dev();
			break;
		case "*":
			f_Mult();
			break;
		case "+":
			f_Plus();
			break;
		case "-":
			f_Minus();
			break;
		}
	}
	public void f_Root(){		//execution root
		double n1 = Double.parseDouble(data1);
		if(Math.sqrt(n1) == (int)Math.sqrt(n1)){
			data1 = Integer.toString((int)Math.sqrt(n1));
			dotflag1 = 0;
		}
		else{			//if result is double type
			data1 = Double.toString(Math.sqrt(n1));
			dotflag1 = 1;
		}
	}
	public void f_Pow(){ 	//execution x^2
		double n1 = Double.parseDouble(data1);
		if(n1*n1 == (int)(n1*n1)){
			data1 = Integer.toString((int)(n1*n1));
			dotflag1 = 0;
		}
		else{			//if result is double type
			data1 = Double.toString(n1*n1);
			dotflag1 = 1;
		}
	}
	public void f_Mod(){		//execution Mod
		if(dotflag1 == 1 || dotflag2 == 1){ 		//if result is double type
			double n1 = Double.parseDouble(data1);
			double n2 = Double.parseDouble(data2);
			data1 = Double.toString(n2%n1);
			dotflag1 = 1;
		}
		else{
			int n1 = (int)Double.parseDouble(data1);
			int n2 = (int)Double.parseDouble(data2);
			data1 = Integer.toString(n2%n1);
		}
	}
	public void f_Del(){		//execution Del. delete one number
		if(data1.length() > 0){
			if(data1.substring(data1.length()-1,data1.length()) == "."){
				dotflag1 = 0;
			}
			data1 = data1.substring(0,data1.length()-1);
		}
	}
	public void f_Dev(){			//execution Devide
		if(dotflag1 == 1 || dotflag2 == 1){			//if result is double type
			double n1 = Double.parseDouble(data1);
			double n2 = Double.parseDouble(data2);
			data1 = Double.toString(n2/n1);
			dotflag1 = 1;
		}
		else{
			int n1 = (int)Double.parseDouble(data1);
			int n2 = (int)Double.parseDouble(data2);
			if(n2/n1 == (double)n2/(double)n1){
				data1 = Integer.toString(n2/n1);
			}
			else{			//if result is double type
				data1 = Double.toString((double)n2/(double)n1);
			}
		}
	}
	public void f_Mult(){		//execution Multiply
		if(dotflag1 == 1 || dotflag2 == 1){			//if result is double type
			double n1 = Double.parseDouble(data1);
			double n2 = Double.parseDouble(data2);
			data1 = Double.toString(n1*n2);
			dotflag1 = 1;
		}
		else{
			int n1 = (int)Double.parseDouble(data1);
			int n2 = (int)Double.parseDouble(data2);
			data1 = Integer.toString(n1*n2);
		}
	}
	public void f_Plus(){		//execution Plus
		if(dotflag1 == 1 || dotflag2 == 1){			//if result is double type
			double n1 = Double.parseDouble(data1);
			double n2 = Double.parseDouble(data2);
			data1 = Double.toString(n1+n2);
			dotflag1 = 1;
		}
		else{
			int n1 = (int)Double.parseDouble(data1);
			int n2 = (int)Double.parseDouble(data2);
			data1 = Integer.toString(n1+n2);
		}
	}
	public void f_Minus(){		//execution Minus
		if(dotflag1 == 1 || dotflag2 == 1){			//if result is double type
			double n1 = Double.parseDouble(data1);
			double n2 = Double.parseDouble(data2);
			data1 = Double.toString(n2-n1);
			dotflag1 = 1;
		}
		else{
			int n1 = (int)Double.parseDouble(data1);
			int n2 = (int)Double.parseDouble(data2);
			data1 = Integer.toString(n2-n1);
		}
	}
	public void f_Dot(){		//plus dot on number
		data1 = data1 + ".";
		dotflag1 = 1;
	}
	public void f_Sign(){		//change sign of data1
		if(signflag == 1){
			data1 = data1.substring(1,data1.length());
			signflag = 0;
		}
		else{
			data1 = "-" + data1;
			signflag = 1;
		}
	}
	public void f_Clear(){		//clear all data
		data1 = "0";
		data2 = "0";
		oper = "";
		operflag = 0;
		nflag = 0;
		dotflag1 = 0;
		dotflag2 = 0;
		signflag = 0;
	}
	public void f_addnum(String s){		//add number on data1
		if(nflag == 0){			//if nflag is 0 then input continuously
			if(data1.equals("0"))
				data1 = "";
			data1 = data1 + s;
		}
		else{			//if nflag is 1 the input new data
			data1 = s;
			nflag = 0;
		}
	}
}

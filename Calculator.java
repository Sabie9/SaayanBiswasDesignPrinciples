import java.io.*;
abstract class Calci{
	double a,b,result;
	public void input()throws IOException{
		System.out.println("Enter the 2 numbers");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Double.parseDouble(br.readLine());
		b=Double.parseDouble(br.readLine());
	}
	abstract void calculate();
	void output(){
		System.out.println("The result is : "+ result);
	}
}
class Add extends Calci{
	void calculate(){
		result=a+b;
	}
}

class Sub extends Calci{
	void calculate(){
		result=a-b;
	}
}
class Mult extends Calci{
	void calculate(){
		result=a*b;
	}
}
class Div extends Calci{
	void calculate(){
		result=a/b;
	}
}
class Calculator{
	public static void main(String args[])throws IOException{
		System.out.println("Welcome to Saayan's Calculator");
		int ch=1;
		Add a=new Add();
		Sub b=new Sub();
		Mult c= new Mult();
		Div d= new Div();
		do{
		System.out.println("Follow the instructions to perform desired arithmaric operation : ");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		switch (x){
			case 1: a.input();
				a.calculate();
				a.output();
				break;
			case 2: b.input();
				b.calculate();
				b.output();
				break;
			case 3: c.input();
				c.calculate();
				c.output();
				break;
			case 4: d.input();
				d.calculate();
				d.output();
				break;
		}	
		System.out.println("Press 0 to EXIT or any other digit to CONTINUE");
		ch=Integer.parseInt(br.readLine());
		}while(ch!=0);
	}
}
	
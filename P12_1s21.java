import java.util.Scanner;
  
  public class P12_1S21{
  	public static void main(String[] args) {
  		int base , exp;
  		Scanner te = new Scanner(System.in);
  		System.out.println("igrese la base:");
  		base=te.nexInt();
  		System.out.println("ingrese el exponente:");
  		expo=te.nexInt();
  		System.out.println("resultado:" + poot(base,expo));
  		System.out.println("resultado:" + math.pow(double)base, (double)expo);

  	}

  	public.static int pot(int b,int e){
  		int acu=1;
  		for (int1 = 1; 1<=e; 1++ ) {
  			acu=acu*b;
  			
  		}
  		return(acu);
  	}
  }
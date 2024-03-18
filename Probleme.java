import java.util.Scanner;

public class Probleme {
	private static Scanner scan = new Scanner(System.in);
	public static void prob1() {
			int nr = scan.nextInt();
			if(nr<1 || nr>10) {
				System.out.println("INVALID");
			}
			else {
				if(nr<=5) {
					System.out.println("RESPINS");
				} 
				else {
					System.out.println("ADMIS");
				}
			}
	}
	public static void prob2() {
		int nr = scan.nextInt();
		switch(nr) {
		case 1 :{
			System.out.println("UNU");
			break;
		}
		case 2 :{
			System.out.println("DOI");
			break;
		}
		case 3 :{
			System.out.println("TREI");
			break;
		}
		case 4 :{
			System.out.println("PATRU");
			break;
		}
		case 5 :{
			System.out.println("CINCI");
			break;
		}
		default :{
			System.out.println("INVALID");
		}
		
		}
	}
	public static void prob3() {
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		if(n1%2 == 1 && n2%2 == 1) {
			System.out.println((n1 * n2)/2);
		}
		else
			System.out.println(n1 + n2);
		
	}
	public static void prob4() {
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int min = Math.min(n1,n2);
		System.out.println(Math.min(n3, min));
		
	}
	public static void prob5() {
		int n = scan.nextInt();
		int sum = 0, a = 0 ;
		for(int i=0; i<n; i++) {
			sum = sum + a;
			a = a+2;
			
		}
		System.out.println(sum);
	}
	public static void prob6() {
		int n = scan.nextInt();
		
		int sum=0,a=1;
		for(int i=0; i<n; i++) {
			sum = sum + a;
			a = a+2;
			
		}
		System.out.println(sum);
	}
	public static void prob7() {
		int n =scan.nextInt();
		
		int sum=0;
		for(int i=0;i<n;i++) {
			int a = scan.nextInt();
			sum = sum + a;
		}
		System.out.println(sum/n);
	}
	public static void prob8() {
		int n = scan.nextInt();
		int fact = 1;
		for (int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	public static void prob9() {
		int n = scan.nextInt();
		boolean prim = true;
		
		if (n>1) {
			for(int i=2;n>=i*i;i++) {
				if(n%i==0) {
					prim=false;
				}
			}
		}
		if(prim) {
			System.out.println("n este prim");
		}else {
			System.out.println("n nu este prim");
		}
	}
	public static void prob10() {
		
		boolean prim = false;
		int n = 1000;
		
		while(prim == false) {
			n++;
			prim = true;
			for(int i =2; n>=i*i; i++) {
				if(n%i==0) {
					prim=false;
				}
			}
		}
		System.out.println(n);
	}
	public static void prob11() {
		int n = scan.nextInt();
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	public static void prob12() {
		int n = scan.nextInt();
		for (int i=1;i<=n;i++)
		{
			boolean prim = false;
			if (n%i==0)
				{
				prim=true;
				for(int j=2;j*j<=i;j++)
					{
					if(i%j==0)
						prim=false;
					
					}
				}
			if (prim)
				System.out.println(i);
		}
	}
	public static void prob13() {
		for(int i=0; i<1000; i=i+17) {
			for(int j=0; j<1000; j=j+19) {
				if(i+j==1000) {
					System.out.println(i + "," + j);
				}
			}
		}
	}
	public static void prob14() {
		for(int i=1;i<1000;i++) {
			int j =1000-i;
			if((i%17==0 || i%13==0) && (j%19==0 || j%7==0)) {
				System.out.println(i + "," + j);
			}
		}
	}
	public static void prob15() {
		for(int a=0;a<10;a++) {
			for (int b=0; b<10;b++) {
				if((3020 + a*100 +b)%9==0) {
					System.out.println(3020 + a*100 +b);
				}
			}
		}
	}
	public static void prob16() {
		int n = scan.nextInt();
		int ogl = 0;
		
		while (n>0) {
			ogl=ogl*10+n%10;
			n=n/10;
		}
		while(ogl>0) {
			
			System.out.print(ogl%10 + " ");
			ogl = ogl/10;
		}
		
	}
	public static void prob17() {
		int n = scan.nextInt();
		int max = 0;
		
		while (n>0)
		{
			if (n%10>max) {
				max=n%10;
			}
			n = n/10;
			
		}
		System.out.println(max);
	}
	public static void prob18()
	{
		int n = scan.nextInt();
		int min = 9;
		
		while (n>0)
		{
			if (n%10<min) {
				min=n%10;
			}
			n=n/10;
		}
		System.out.println(min);
	}
}
 	

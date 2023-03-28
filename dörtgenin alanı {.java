import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner kelime=new Scanner(System.in);
					System.out.print("Bölme İcin 'b' Çarpma icin 'ç' Toplama icin 't' Çıkarma icin 'c' yaziniz : ");
					String k=kelime.nextLine();
					Scanner r=new Scanner(System.in);
				System.out.print("Birinci sayıyı giriniz : ");
					int sayi=r.nextInt();
					 Scanner sayi1=new Scanner(System.in);
				System.out.print("Birinci sayıyı giriniz : ");
					int sayi12=sayi1.nextInt();
					if(k.equals("b")){
									float a=sayi;
									float b=sayi12;
									float bol=a/b;
									System.out.println("1. sayinin 2. sayiya bolumu : "+bol);
									
					}else if(k.equals("ç")){
									int carp=sayi*sayi12;
									System.out.println("1. ve 2. sayinin carpimi : "+carp);
					}else if(k.equals("t")){
									int top=sayi+sayi12;
									System.out.println("1. ve 2. sayinin toplami : "+top);
					}else if(k.equals("c")){
									int cik=sayi-sayi12;
									System.out.println("1. sayinin 2. sayidan farki : "+cik);
					}else{
									System.out.println("Geçersiz karakter girdiniz !!!");
					}
	}
}
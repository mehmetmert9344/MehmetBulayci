package Euro;

import java.util.Scanner;

public class Tak��lem {
public static void main(String[] args) {
	
	
	String a1;
	int a2;
	Scanner oku = new Scanner(System.in);
	System.out.println("Ma� G�n� girin;");
	a1=oku.next();
	System.out.println("Ma� Saati Girin:");
	a2=oku.nextInt();
	BJK bjk = new BJK();
	BJK.boyuncuSayisi = 11;
	BJK.teknikd ="Mehmet Bulayci";
	BJK.takimkodu = 1903;
	LYON lyon = new LYON();
	LYON.loyuncuSayisi= 11;
	LYON.teknikl="Bugra Loglog";
	LYON.Ltakimkodu= 1950;
	SoyunmaOdasi soy = new SoyunmaOdasi();
	SoyunmaOdasi.bilgiler(bjk,lyon);
	SoyunmaOdasi.bjkBilgi(bjk);
	
	
	
	
	
	
	
}
}

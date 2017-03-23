package Euro;

import java.util.Scanner;

public class TakÝþlem {
public static void main(String[] args) {
	
	
	String a1;
	int a2;
	Scanner oku = new Scanner(System.in);
	System.out.println("Maç Günü girin;");
	a1=oku.next();
	System.out.println("Maç Saati Girin:");
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

package Euro;

import java.util.Set;

public class SoyunmaOdasi {
	public static  void bilgiler(BJK bjk , LYON lyon){
		System.out.println("Takým Bilgileri;");
		System.out.println("Bjk oyuncu sayýsý:"+BJK.boyuncuSayisi);
		System.out.println("Bjk Teknikd Adý:"+BJK.teknikd);
		System.out.println("Kuruluþ Tarihi:"+BJK.takimkodu);
		System.out.println("////////////////////");
		System.out.println("Lyon oyuncu sayýsý:"+LYON.loyuncuSayisi);
		System.out.println("Lyon Teknikd Adý:"+LYON.Ltakimkodu);
		System.out.println("Kuruluþ Tarihi:"+LYON.teknikl);
	System.out.println("///////////////////////");
	}
	public static void bjkBilgi(BJK bjk){
		System.out.println("Ev Sahibi Bilgileri;");
		System.out.println("Bjk oyuncu sayýsý:"+BJK.boyuncuSayisi);
		System.out.println("Bjk Teknikd Adý:"+BJK.teknikd);
		System.out.println("Kuruluþ Tarihi:"+BJK.takimkodu);
	}
	
		
	
}

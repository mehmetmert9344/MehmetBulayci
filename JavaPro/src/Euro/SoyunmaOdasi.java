package Euro;

import java.util.Set;

public class SoyunmaOdasi {
	public static  void bilgiler(BJK bjk , LYON lyon){
		System.out.println("Tak�m Bilgileri;");
		System.out.println("Bjk oyuncu say�s�:"+BJK.boyuncuSayisi);
		System.out.println("Bjk Teknikd Ad�:"+BJK.teknikd);
		System.out.println("Kurulu� Tarihi:"+BJK.takimkodu);
		System.out.println("////////////////////");
		System.out.println("Lyon oyuncu say�s�:"+LYON.loyuncuSayisi);
		System.out.println("Lyon Teknikd Ad�:"+LYON.Ltakimkodu);
		System.out.println("Kurulu� Tarihi:"+LYON.teknikl);
	System.out.println("///////////////////////");
	}
	public static void bjkBilgi(BJK bjk){
		System.out.println("Ev Sahibi Bilgileri;");
		System.out.println("Bjk oyuncu say�s�:"+BJK.boyuncuSayisi);
		System.out.println("Bjk Teknikd Ad�:"+BJK.teknikd);
		System.out.println("Kurulu� Tarihi:"+BJK.takimkodu);
	}
	
		
	
}

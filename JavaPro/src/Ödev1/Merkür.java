package Ödev1;

public class Merkür extends Plüton {
@Override
void su() {
	System.out.println("Merkürde Su %50 Oranýnda:");
	super.su();
}
@Override
	void oksijen() {
		System.out.println("Merkürde Oksijen Oraný %50 :");
		super.oksijen();
	}
public void temelBilgi(){
	System.out.println("Gezegen Sayýsý ve Ýsimleri:" +this.gezegenSayisi);
	System.out.println("Merkür, Venüs, Dünya, Mars, Jüpiter, Satürn, Uranüs,Neptün:");
}
	double isi = 150.0;
	
	
}

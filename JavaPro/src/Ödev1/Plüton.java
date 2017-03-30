package Ödev1;

public class Plüton {
void su(){
	System.out.println("Plütonda Su %90 Oranýnda:");
}
void oksijen(){
	System.out.println("Plütonda Oksijen Oraný %1:");
}
int gezegenSayisi = 8;
public int araHesapla(int[]array){
	int sonuc = 0;
	for (int i = 0; i < array.length; i++) {
		sonuc += array[i];
	}
return sonuc;
}
public int getGezegenSayisi() {
	return gezegenSayisi;
}
public void setGezegenSayisi(int gezegenSayisi) {
	this.gezegenSayisi = gezegenSayisi;
}
}



package �dev1;

public class Pl�ton {
void su(){
	System.out.println("Pl�tonda Su %90 Oran�nda:");
}
void oksijen(){
	System.out.println("Pl�tonda Oksijen Oran� %1:");
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



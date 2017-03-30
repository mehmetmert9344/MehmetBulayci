package Ödev1;

public class Mars extends Merkür {
@Override
void su() {
	System.out.println("Marsta Su %35 Oranýnda:");
	super.su();
}
@Override
	void oksijen() {
		System.out.println("Marsta Oksijen Oraný %5");
		super.oksijen();
	}
public void merkürIsi(){
	System.out.println("Merkürün Isýsý:" +  this.isi  +"°" );
}

}

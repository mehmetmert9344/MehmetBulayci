package �dev1;

public class Mars extends Merk�r {
@Override
void su() {
	System.out.println("Marsta Su %35 Oran�nda:");
	super.su();
}
@Override
	void oksijen() {
		System.out.println("Marsta Oksijen Oran� %5");
		super.oksijen();
	}
public void merk�rIsi(){
	System.out.println("Merk�r�n Is�s�:" +  this.isi  +"�" );
}

}

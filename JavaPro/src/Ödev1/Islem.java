package �dev1;

public class Islem {

	public static void main(String[] args) {
		Pl�ton pl�ton =  new Pl�ton();
		Merk�r merk�r =new Merk�r();
		merk�r.temelBilgi();
		
		
		Ven�s ven�s = new Ven�s();
		ven�s.su();
		
		
		Mars mars = new Mars();
		mars.oksijen();
		mars.merk�rIsi();
		
		
		
		int[] array ={111,189};
		System.out.println("Pl�ton-Merk�r Mesafesi:"  +  pl�ton.araHesapla(array));
		int[] array1 ={444,1891};
		System.out.println("Merk�r-Mars Mesafesi:"  +  merk�r.araHesapla(array1));
		int[] array2 ={4896,14551};
		System.out.println("Mars-Ven�s Mesafesi:"  +  merk�r.araHesapla(array2));
	
		
	}
}

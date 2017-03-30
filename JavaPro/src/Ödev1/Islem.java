package Ödev1;

public class Islem {

	public static void main(String[] args) {
		Plüton plüton =  new Plüton();
		Merkür merkür =new Merkür();
		merkür.temelBilgi();
		
		
		Venüs venüs = new Venüs();
		venüs.su();
		
		
		Mars mars = new Mars();
		mars.oksijen();
		mars.merkürIsi();
		
		
		
		int[] array ={111,189};
		System.out.println("Plüton-Merkür Mesafesi:"  +  plüton.araHesapla(array));
		int[] array1 ={444,1891};
		System.out.println("Merkür-Mars Mesafesi:"  +  merkür.araHesapla(array1));
		int[] array2 ={4896,14551};
		System.out.println("Mars-Venüs Mesafesi:"  +  merkür.araHesapla(array2));
	
		
	}
}

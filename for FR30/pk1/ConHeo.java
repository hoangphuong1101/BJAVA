package pk1;

public class ConHeo extends VatNuoi{

	public ConHeo(String tenVN, boolean gioiTinh, int canNang, String mauLong) {
		super(tenVN, gioiTinh, canNang, mauLong);
	}
	
	
	public void keu(){
		System.out.println("Ec..ec...");
	}
	
	@Override
	public void an(String thucAn) {
		System.out.println("An..." + thucAn);
		
	}
}

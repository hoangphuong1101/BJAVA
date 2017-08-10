package pk1;

public class ConGa extends VatNuoi{

	public ConGa(String tenVN, boolean gioiTinh, int canNang, String mauLong) {
		super(tenVN, gioiTinh, canNang, mauLong);
	}
	
	
	public void gay(){
		System.out.println("Oooooo..o...");
	}
	
	@Override
	public void an(String thucAn) {
		System.out.println("Mo..." + thucAn);
		
	}
}

package pk1;

public class ConCho extends VatNuoi{
	String tenVN;

	public ConCho(String tenVN, boolean gioiTinh, int canNang, String mauLong) {
		super(tenVN, gioiTinh, canNang, mauLong);
	}
	
	
	public String getTenVN() {
		return tenVN;
	}
	
	public void sua(){
		System.out.println("Gau..gau...");
	}
	
	@Override
	public void an(String thucAn) {
		System.out.println("Tap..." + thucAn);
		
	}
}

package pk1;

public class ConBo extends VatNuoi{

	public ConBo(String tenVN, boolean gioiTinh, int canNang, String mauLong) {
		super(tenVN, gioiTinh, canNang, mauLong);
	}
	
	public void vatSua(){
		System.out.println("Vat sua di..");
	}
	
	public void rong(){
		System.out.println("Bo..bo...");
	}

	@Override
	public void an(String thucAn) {
		System.out.println("Gam..." + thucAn);
		
	}
}

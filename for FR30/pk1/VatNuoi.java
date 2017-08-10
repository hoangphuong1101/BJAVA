package pk1;

public abstract class VatNuoi {
	
	private String tenVN;
	private boolean gioiTinh;
	private int canNang;
	private String mauLong;
	
	public VatNuoi(String tenVN, boolean gioiTinh, int canNang, String mauLong) {
		super();
		this.tenVN = tenVN;
		this.gioiTinh = gioiTinh;
		this.canNang = canNang;
		this.mauLong = mauLong;
	}
	
	
	public String getTenVN() {
		return tenVN;
	}
	public void setTenVN(String tenVN) {
		this.tenVN = tenVN;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getCanNang() {
		return canNang;
	}
	public void setCanNang(int canNang) {
		this.canNang = canNang;
	}
	public String getMauLong() {
		return mauLong;
	}
	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}
	
	public abstract void an(String thucAn);
	
}

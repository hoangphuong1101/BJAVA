package pk2;

public class NutBam {
	
	int dai;
	int rong;
	int mauSac;
	String tenNutBam;
	SuKienBamNut sk;
	
	
	
	public NutBam(int dai, int rong, int mauSac, String tenNutBam,
			SuKienBamNut sk) {
		super();
		this.dai = dai;
		this.rong = rong;
		this.mauSac = mauSac;
		this.tenNutBam = tenNutBam;
		this.sk = sk;
	}
	
	public int getDai() {
		return dai;
	}
	public void setDai(int dai) {
		this.dai = dai;
	}
	public int getRong() {
		return rong;
	}
	public void setRong(int rong) {
		this.rong = rong;
	}
	public int getMauSac() {
		return mauSac;
	}
	public void setMauSac(int mauSac) {
		this.mauSac = mauSac;
	}
	public String getTenNutBam() {
		return tenNutBam;
	}
	public void setTenNutBam(String tenNutBam) {
		this.tenNutBam = tenNutBam;
	}
	
	void bam(){
		dai--;
		rong--;
		mauSac++;
		sk.goiSuKienBN();
		
	}
}

interface SuKienBamNut{
	void goiSuKienBN();
}

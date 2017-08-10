package pk2;

public class LapTrinhVienSauNay {
	public static void main(String[] args) {
		SuKienLogin sk = new SuKienLogin();
		NutBam nutLogin = new NutBam(20, 10, 10, "NutLogin", sk);
		nutLogin.bam();
	}
}

class SuKienLogin implements SuKienBamNut{

	@Override
	public void goiSuKienBN() {
		// viet phuong thuc login o day
		System.out.println("Login di....");
		
	}
	
}

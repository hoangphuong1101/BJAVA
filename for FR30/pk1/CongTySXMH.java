package pk1;

public class CongTySXMH {
	void lamPin(){
		
	}
	
	IDienThoai dt = new IDienThoai();
	
	
	
}

abstract class  dtDeTest implements IDienThoai{

	@Override
	public void manHinh(int dai, int rong, int doPG, String motMH) {
		// lam man hinh de test dom cung duoc
		
	}

	@Override
	public void boMach(int dai, int rong, String motBoMach) {
		// lam bo mach dom dom de test
		
	}

	@Override
	public void pin(int dai, int rong, int inV, int outV) {
		// day la vien pin that cua iphone

	}

	@Override
	public abstract void vo(int dai, int rong, String motVo) ;
	
}

package pk1;

public interface IDienThoai {
	// thong so dien thoai
	int daiDT = 20;
	
	void manHinh(int dai, int rong, int doPG, String motMH);
	void boMach(int dai, int rong,  String motBoMach);
	void pin(int dai, int rong, int inV, int outV);
	void vo(int dai, int rong, String motVo);
}

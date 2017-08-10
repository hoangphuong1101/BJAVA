package pk1;

import java.util.ArrayList;

public class QuanLyVN {
	ArrayList<VatNuoi> chuong = new ArrayList<>();
	
	void khoiTaoChuong(){
		ConCho cho1 = new ConCho("MiLu", true, 10, "trang");
		ConGa ga1 = new ConGa("KFC", true, 5, "den");
		ConHeo heo1 = new ConHeo("Quay", false, 30, "den");
		ConBo bo1 = new ConBo("Kobe", false, 50, "den");
		ConGa ga2 = new ConGa("Tay", true, 5, "den");
		ConGa ga3 = new ConGa("Ta", true, 5, "den");
		ConGa ga4 = new ConGa("Ri", true, 5, "den");
		
		chuong.add(ga1);
		chuong.add(ga2);
		chuong.add(ga3);
		chuong.add(ga4);
		chuong.add(bo1);
		chuong.add(heo1);
		chuong.add(cho1);
	}
	
	void baoCacConKeu(){
		for(int i = 0; i < chuong.size(); i++){
			VatNuoi con = chuong.get(i);
			
			if (con instanceof ConHeo) {
				ConHeo conHeo = (ConHeo) con;
				System.out.println("Day la con Heo");
				conHeo.keu();
			}else if (con instanceof ConBo) {
				ConBo conBo = (ConBo) con;
				System.out.println("Day la con Bo");
				conBo.rong();
			}
			
		}
	}
	
	void baoCacDian(){
		for(int i = 0; i < chuong.size(); i++){
			VatNuoi con = chuong.get(i);
			con.an("Rau");
		}
	}
	
	public static void main(String[] args) {
	
		QuanLyVN ql = new QuanLyVN();
		//ql.khoiTaoChuong();
		//ql.baoCacDian();
		//ql.baoCacConKeu();
		
		VatNuoi conCho = new ConCho("MiLu", true, 10, "trang");
		
		quanLyVatNuoi(conCho);
	
	}
	
	static void quanLyVatNuoi(VatNuoi convn){
		
		convn.an("Cam");
		convn.setTenVN("Ga");
	}
}

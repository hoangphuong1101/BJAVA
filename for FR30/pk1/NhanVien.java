package pk1;

import java.util.ArrayList;

public class NhanVien {
	
	String idNhanVien;
	String tenNhanVien;
	
	ArrayList<BaoHiem> listbh;
	
	public String getIdNhanVien() {
		return idNhanVien;
	}
	public void setIdNhanVien(String idNhanVien) {
		this.idNhanVien = idNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public ArrayList<BaoHiem> getListbh() {
		return listbh;
	}
	public void setListbh(ArrayList<BaoHiem> listbh) {
		this.listbh = listbh;
	}
	
	public static void main(String[] args) {
		NhanVien nv = new NhanVien();
		ArrayList<BaoHiem> listBH = nv.getListbh();
	}
	
	
}


public class Staff extends People {
    private String maSoNhanVien; 

    public Staff(){
        super();
        maSoNhanVien = " ";
    }
    
	public Staff(String hoTen, String diaChi, String soDienThoai, double thoiGianLam, String maSoNhanVien) {
		 super(hoTen, diaChi, soDienThoai, thoiGianLam);
		 this.maSoNhanVien = maSoNhanVien;
	}
	 
	public String getMaSoNhanVien() {
        return maSoNhanVien;
    }

    public void setMaSoNhanVien(String maSoNhanVien) {
        this.maSoNhanVien = maSoNhanVien;
    }

    public double TinhLuong()
    {
        return getThoiGianLam() * 30000;
    }

    public void xuat(){
        super.xuat();
        System.out.println("Ma so nhan vien: "+maSoNhanVien);
    }

    /* hhhhh */

}

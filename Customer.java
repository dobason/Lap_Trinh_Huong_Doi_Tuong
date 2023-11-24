public class Customer extends People {
    private String maKhachHang;

    public Customer() {
        super();
        maKhachHang = "";
    }
    
	public Customer(String hoTen, String diaChi, String soDienThoai, double thoiGianLam, String maKhachHang) {
		super(hoTen, diaChi, soDienThoai, thoiGianLam);
		this.maKhachHang = maKhachHang;
	}
	
	public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public double TinhLuong()
    {
        return 0;
    }

    public void xuat() {
    	super.xuat();
		System.out.println("Ma khach hang: "+maKhachHang);
    }
}

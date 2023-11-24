public abstract class Product {
    protected String maSanPham;
	protected String loaiSanPham;
	
	 // Hàm thiết lập (constructor)
    public Product(String maSanPham,String loaiSanPham) {
        this.maSanPham = maSanPham;
        this.loaiSanPham=loaiSanPham;
    } 
    
    //Ham thiet lap khong tham so
    public Product() {
    	maSanPham = "";
    	loaiSanPham = "";
    }

	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getloaiSanPham() {
		return loaiSanPham;
	}
	public void setloaiSanPham(String tenSanPham) {
		this.loaiSanPham = tenSanPham;
	}
	
    public abstract void xuat();
}

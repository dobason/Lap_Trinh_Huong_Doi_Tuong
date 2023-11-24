public class Suplier extends People {
    private String maNhaCungCap;
    
    public Suplier(){
        super();
        maNhaCungCap ="";
    }

    public Suplier(String hoTen, String diaChi, String soDienThoai, String maNhaCungCap) {
        super(hoTen,diaChi,soDienThoai);
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public void xuat(){
        super.xuat();
        System.out.println("Ma nha cung cap: "+maNhaCungCap);
    }
        
}

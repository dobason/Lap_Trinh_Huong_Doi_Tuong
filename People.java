
    abstract class People {
        private String soDienThoai;
        private String hoTen;
        private String diaChi;
        
        // Hàm thiết lập (constructor)
        public People(String hoTen, String diaChi, String soDienThoai) {
            this.hoTen = hoTen;
            this.diaChi = diaChi;
            this.soDienThoai = soDienThoai;
        }
        public People() {
            hoTen = "";
            diaChi = "";
            soDienThoai = "";
        }

        public String getSoDienThoai() {
            return soDienThoai;
        }
        public void setSoDienThoai(String soDienThoai) {
            this.soDienThoai = soDienThoai;
        }
        public String getHoTen() {
            return hoTen;
        }
        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }
        public String getDiaChi() {
            return diaChi;
        }
        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public void xuat(){
            System.out.println("Ho va ten: "+hoTen);
            System.out.println("Dia chi: "+diaChi);
            System.out.println("So dien thoai: "+soDienThoai);
        }
}
    


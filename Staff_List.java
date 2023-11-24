import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class Staff_List implements IOutput {
	private List<Staff> sl;
	public String path;
	
    public Staff_List(){
        sl = new ArrayList<>();
        path = " ";
    }

	public Staff_List(String path) {
		this.sl = new ArrayList<>();
		this.path = path;
	}
	@Override
	public void nhap() {
		List<String>duLieu = Fileutility.nhapFile(path);
		int len = duLieu.size();
		for (int i = 0; i < len; i++) {
			String[] row = duLieu.get(i).split("_");
			Staff item = new Staff(
				row[0],
                row[1],
                row[2],
                row[3]
			);
			this.sl.add(item);
	     }
	}

	@Override
	public void xuat() {
		int len = sl.size();
		for(int i = 0;i<len;i++) {
			Staff item = sl.get(i);
			item.xuat();
		}
	}

    public void addStaff(){
        this.sl = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Them Nhan Vien: ");
        System.out.println("Them ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Them dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Them so dien thoai: ");
        String soDienThoai = sc.nextLine();
        System.out.println("Them ma so nhan vien: ");
        String maSoNhanVien = sc.nextLine();
        Staff sl = new Staff(hoTen,diaChi, soDienThoai, maSoNhanVien);
        this.sl.add(sl);
    }
    
}

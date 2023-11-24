import java.util.ArrayList;
import java.util.List;

    class Customer_List implements IOutput {
	private List<Staff> cl;
	public String path;
	
    public Customer_List(){
        cl = new ArrayList<>();
        path = " ";
    }

	public Customer_List(String path) {
		this.cl = new ArrayList<>();
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
			this.cl.add(item);
	     }
	}

	@Override
	public void xuat() {
		int len = cl.size();
		for(int i = 0;i<len;i++) {
			Staff item = cl.get(i);
			item.xuat();
		}
	}
}



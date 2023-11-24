import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class Suplier_List implements IOutput
    {
        private List<Staff> l;
        public String path;
	
    public Suplier_List()
    {
        l = new ArrayList<>();
        path = " ";
    }

	public Suplier_List(String path) {
		this.l = new ArrayList<>();
		this.path = path;
	}
	@Override
	public void nhap() 
    {
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
			this.l.add(item);
	     }
	}

	@Override
	public void xuat() 
    {
		int len = l.size();
		for(int i = 0;i<len;i++) 
        {
			Staff item = l.get(i);
			item.xuat();
		}
	}
}
    




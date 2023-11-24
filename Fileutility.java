import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Fileutility {
    	public static List<String> nhapFile(String path) {
		List<String> duLieu = new ArrayList<>();
		try {
			BufferedReader input = new BufferedReader(new FileReader(path));
			String line = input.readLine();
			duLieu.add(line);
			while (line != null) {
				line = input.readLine();
				if (line != null) {
					duLieu.add(line);
				}
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return duLieu;
	}

	//ghi dữ liệu vào file
	 public static void xuatFile(String path,String[] args) {
		 try {
		      FileWriter writer = new FileWriter(path);
			  writer.write(path);
		      writer.close();
		 } catch (Exception e) {
				e.printStackTrace();
		}
	 }
}

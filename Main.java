import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Staff_List sl = new Staff_List("file/Staff_list.txt"); // ve may ve copy lai sau
    	sl.nhap();
        Customer_List cl = new Customer_List("file/Customer.txt");
        cl.nhap();
        Suplier_List l = new Suplier_List("file/Suplier_list.txt");
        l.nhap();
        //hello
        

    while(true){
        System.out.println("<========================== KHO HANG ========================>");
        System.out.println("1. Xuat danh sach nhan vien");
        System.out.println("2. Xuat danh sach khach hang");
        System.out.println("3. Xuat danh sach nha cung cap");
        System.out.println("4. Danh sach san pham");
        System.out.println("5. Chi tiet phieu nhap");
        System.out.println("6. Chi tiet phieu xuat");
        System.out.println("7. Thoat chuong trinh");
        System.out.println("Moi ban nhap: ");
        String choice = sc.nextLine();
        switch(choice){
        	case "1":
            System.out.println("==============Danh sach nhan vien==============");
        		sl.xuat();
                String choose = sc.nextLine();
                switch(choose){
                    case "a":
                        System.out.println("Them nhan vien");
                        sl.addStaff();
                    break;
                    case "b":
                        
                    break;

                }
        		break;
        	case "2":
                System.out.println("==============Danh sach khach hang==============");
        		cl.xuat();
        		break;
        	case "3":
        		System.out.println("==============Danh sach nha cung cap==============");
                l.xuat();
        		break;
        	case "4":
        
        		break;
        	case "5":
        		
        		break;
        	case "6":
        		
        		break;
        	case "7":
        		return;
        		
            default:
            	System.out.println("Lua chon khong hop le! Vui long nhap lai");
            	break;
        	}        
    	}
    }
}


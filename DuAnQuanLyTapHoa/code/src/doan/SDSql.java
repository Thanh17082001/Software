package doan;

import java.util.Scanner;

public class SDSql {

	public static void main(String[] args) {
		Sql a=new Sql();
		Scanner sc=new Scanner(System.in);
		System.out.println("Moi ban chon chuc nang: ");
		while(true) {
			System.out.println("1. Xem hang hoa cua tiem:");
			System.out.println("2. Thanh toan hoa don:");
			System.out.println("3. Nhap hang vao kho:");
			System.out.println("4. Kiem tra so luong hang hoa trong kho:");
			System.out.println("5. Thong ke doanh thu theo thang:");
			System.out.println("6. Thong ke doanh thu theo ngay:");
			System.out.println("7. Xem noi san xuat san pham:");
			System.out.println("8. Kiem tra so luong mat hang cu the:");
			System.out.println("9. cap nhat gia ban ngoai thi truong:");
			System.out.println("10. hien thi thong tin hang hoa theo ten hang hoa");
			System.out.println("11. truy xuat hoa don theo ma khach hang");
			System.out.println("12. liet ke san pham theo nhom");
			 int lc=sc.nextInt(); sc.nextLine();
			 if(lc==1) {
				 a.XemSp();
			 }
			 else if(lc==2){
				 a.nhapBill();
			 }
			 else if(lc==3) {
				 a.nhaphang();
			 }
			 else if(lc==4){
				 System.out.println("So luong cac mat hang trong kho");
				 a.KTsoluong();
			 }
			 else if(lc==5){
				 a.DTMonth();
			 }
			 else if(lc==6){
				 a.DTDay();
			 }
			 else if(lc==7){
				 a.xuatxu();
			 }
			 else if(lc==8){
				 System.out.println("nhap ma hang hoa can kiem tra: "); String mahang=sc.nextLine();
				 a.KTsoluongCuThe(mahang);
			 }
			 else if( lc==9) {
				 System.out.println("nhap ma hang hoa can cap nhat: "); String mahang=sc.nextLine();
				 System.out.println("nhap gia moi: "); Double giamoi=sc.nextDouble();
				 a.UpdateGia(mahang, giamoi);
			 }
			 else if( lc==10) {
				 System.out.println("nhap ten hang hoa can hien thi thong tin: "); String mahang=sc.nextLine();
				 a.ShowHH(mahang);
				 
			 }
			 else if( lc==11) {
				 System.out.println("Nhap ma khach hang can truy xuat: "); String makh=sc.nextLine();
				 System.out.println("Nhap yyyy-mm-dd can truy xuat: "); String ngaylap=sc.nextLine();
				 a.searchBill(makh, ngaylap);
			 }
			 else {
				 System.out.println("Nhap nhom san pham can liet ke:"); String G=sc.nextLine();
				 a.SearchGroup(G);
			 }
			 System.out.println("\n");
		}
		
		
	}
}

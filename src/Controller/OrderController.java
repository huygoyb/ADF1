package Controller;

import Model.OrderModel;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderController {
    private ArrayList<Order> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Object Order;

    public Order add() {
        Order order = new Order();
        System.out.println("Nhap ma san pham");
        String maSanPham = scanner.nextLine();
        order.setMaSanPham(maSanPham);
        System.out.println("Nhap ten khach hang");
        String fullName = scanner.nextLine();
        order.setFullName(fullName);
        System.out.println("Nhap ten san pham");
        String tenSanPham = scanner.nextLine();
        order.setTenSanPham(tenSanPham);
        System.out.println("Nhap tong tien");
        Float tongTien = scanner.nextFloat();
        order.setTongTien(tongTien);

        return order;
    }

    public void showList() {
        System.out.printf("%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s | %10s%10s%10s\n",
                "", "MaSanPham", "",
                "", "TenKhachHang", "",
                "", "TenSanPham", "",
                "", "TongTien", "");
        System.out.println("______________________________________________________________________");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void search() {
        System.out.println("Vui long nhap ma san pham ");
        String maSanPham = scanner.nextLine();
        if (Order == null){
            System.out.println("not found");
            return;
        }
    }
    // commit trước -> push sau
    // đấy là commit
    // giờ là push
}

package user;

import manager.PhoneBookManager;
import storage.PhoneBookList;
import storage.Synchronized;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    PhoneBookManager productManager = new PhoneBookManager();
    PhoneBookList list = PhoneBookList.getInstance();
    Synchronized aSynchronized = new Synchronized();
    public void start() {
        System.out.println("Bạn đang truy cập vào danh bạ");
        hienThiLuaChon();
        int userOption = sc.nextInt();
        aSynchronized.readToFile(list.getPhoneBookFile());
        switch (userOption) {
            case 1:
                productManager.showPhoneBook();
                aSynchronized.writeToFileMenu(list.getPhoneBookFile());
                start();
                break;
            case 2:
                productManager.addPhoneBook();
                aSynchronized.writeToFileMenu(list.getPhoneBookFile());
                start();
                break;
            case 3:
                productManager.update();
                aSynchronized.writeToFileMenu(list.getPhoneBookFile());
                start();
                break;
            case 4:
                productManager.deletePhoneNumber();
                aSynchronized.writeToFileMenu(list.getPhoneBookFile());
                start();
                break;
            case 5:
                productManager.findPhoneNumber();
                aSynchronized.writeToFileMenu(list.getPhoneBookFile());
                start();
                break;
            case 0:
                System.exit(0);

        }
    }
    private void hienThiLuaChon() {
        System.out.println("1. Hiển thị danh bạ");
        System.out.println("2. Thêm số điện thoại vào danh bạ");
        System.out.println("3. Sửa số điện thoại trong danh bạ");
        System.out.println("4. Xoá số điện thoại trong danh bạ");
        System.out.println("5. Tìm kiếm số điện thoại trong danh bạ");
        System.out.println("0. Thoát");
        System.out.println("Bạn muốn làm gì?");
    }
}

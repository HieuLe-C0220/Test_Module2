package manager;

import model.PhoneBook;
import storage.PhoneBookList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManager {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    PhoneBookList listManager = PhoneBookList.getInstance();
    private final List<PhoneBook> phoneBookList = listManager.phoneBookList;
    public void showPhoneBook() {
        if (phoneBookList.isEmpty()) {
            System.out.println("Danh bạ trống");
        } else {
            for (PhoneBook thisPhoneBook: phoneBookList) {
                System.out.println(thisPhoneBook);
            }
        }
    }
    public void addPhoneBook() {
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.next();
        System.out.println("Nhập nhóm danh bạ: ");
        String phoneGroup = sc.next();
        System.out.println("Nhập họ và tên: ");
        String phoneName = sc.next();
        System.out.println("Nhập giới tính: ");
        String phoneIntroduce = sc.next();
        System.out.println("Nhập địa chỉ: ");
        String address = sc.next();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = sc.next();
        System.out.println("Nhập email: ");
        String email = sc.next();
        PhoneBook newPhoneBook = new PhoneBook(phoneNumber,phoneGroup,phoneName,phoneIntroduce,address,dateOfBirth,email);
        phoneBookList.add(newPhoneBook);
        System.out.println("Thêm thành công");
    }
    public void update() {
        System.out.println("Nhập số điện thoại cần sửa:");
        String id = sc.next();
        for (PhoneBook phoneBook : phoneBookList) {
            if (id.equals(phoneBook.getPhoneNumber())) {
                System.out.println("Nhập các dữ liệu sửa:");

                System.out.println("Nhập nhóm danh bạ");
                String newGroup = sc.next();
                phoneBook.setGroup(newGroup);

                System.out.println("Nhập họ tên");
                String newName = sc.next();
                phoneBook.setName(newName);

                System.out.println("Nhập giới tính");
                String newIntroduce = sc.next();
                phoneBook.setIntroduce(newIntroduce);

                System.out.println("Nhập địa chỉ");
                String newAddress = sc.next();
                phoneBook.setAddress(newAddress);

                System.out.println("Nhập ngày sinh");
                String newDateOfBirth = sc.next();
                phoneBook.setDateOfBirth(newDateOfBirth);

                System.out.println("Nhập email");
                String newEmail = sc.next();
                phoneBook.setEmail(newEmail);
                break;
            }
        }
    }
    public void deletePhoneNumber() {
        System.out.println("Nhập số điện thoại muốn xoá: ");
        String deletePhoneNumber = sc.next();
        boolean check = false;
        for (int i=0;i<phoneBookList.size();i++) {
            if (phoneBookList.get(i).getPhoneNumber().equals(deletePhoneNumber)) {
                System.out.println("Nhấn Y nếu chắc chắn muốn xoá");
                String comfirm = sc.next();
                if (comfirm.equalsIgnoreCase("y")) {
                    phoneBookList.remove(i);
                    check = true;
                }
            }
        }
        if (!check) {
            System.out.println("Số điện thoại không tồn tại hoặc bạn nhập sai số");
        } else {
            System.out.println("Đã xoá thành công");
        }
    }
    public void findPhoneNumber() {
        System.out.println("Nhập số điện thoại muốn tìm: ");
        String word = sc.nextLine();
        boolean check=false;
        for (PhoneBook phoneBook : phoneBookList) {
            if (phoneBook.getPhoneNumber().contains(word) || phoneBook.getName().contains(word)) {
                check = true;
                System.out.println(phoneBook);
                break;
            }
        }
        if (!check) {
            System.out.println("Số đó bạn chưa lưu");
        } else {
            System.out.println("Số điện thoại đã có trong danh bạ");
        }
    }
}

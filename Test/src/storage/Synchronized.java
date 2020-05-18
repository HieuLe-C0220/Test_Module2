package storage;

import model.PhoneBook;

import java.io.*;
import java.util.List;

public class Synchronized {
    PhoneBookList listManager = PhoneBookList.getInstance();
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    String line = null;
    String[] phone;
    List<PhoneBook> phoneBookList = listManager.phoneBookList;
    public void readToFile(File inFile) {
        try {
            phoneBookList.clear();
            fileReader = new FileReader(inFile);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                phone = line.split(",");
                PhoneBook addPhoneBook = new PhoneBook(phone[0],phone[1],phone[2],phone[3],phone[4],phone[5],phone[6]);
                phoneBookList.add(addPhoneBook);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeToFileMenu(File outFile) {
        try {
            FileWriter fileWriter = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String content = null;
            for (PhoneBook newPhone : phoneBookList) {
                String phoneNumber = newPhone.getPhoneNumber();
                String group = newPhone.getGroup();
                String name = newPhone.getName();
                String introduce = newPhone.getIntroduce();
                String address = newPhone.getAddress();
                String dateOfBirth = newPhone.getDateOfBirth();
                String email = newPhone.getEmail();
                content = phoneNumber + "," + group + "," + name + "," + introduce+","+address+","+dateOfBirth+","+email;
                bw.write(content);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

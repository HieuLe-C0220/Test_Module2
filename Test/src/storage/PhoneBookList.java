package storage;

import model.PhoneBook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookList {
    public List<PhoneBook> phoneBookList = new ArrayList<>();
    private PhoneBookList() {
    }
    private static volatile PhoneBookList instance;
    public synchronized static PhoneBookList getInstance() {
        if (instance==null) {
            instance = new PhoneBookList();
        }
        return instance;
    }
    public File getPhoneBookFile() {
        return inFile;
    }
    private final File inFile = new File("D:\\Codegym\\Module2-Java\\Week5\\Test-Module2\\Test\\src\\storage\\danhBa.csv");
}

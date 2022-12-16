package lesson6;

import java.util.Arrays;

public class Reader {
    private String name;
    private int libraryCardNumber;
    private String date;
    private String phone;
    private String faculty;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return libraryCardNumber;
    }

    public String getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void takeBook(int book) {
        if (book % 10 == 1) {
            System.out.println(name + " взял " + book + " книгу ");
        } else if (book % 10 < 5) {
            System.out.println(name + " взял " + book + " книги ");
        } else {
            System.out.println(name + " взял " + book + " книг ");
        }
    }

    public void takeBook(String book) {
        System.out.println(name + " взял книгу " + book);
    }

    public void takeBook(String... book) {
        System.out.println(name + " взял книги: " + Arrays.toString(book));
    }

    public void returnBook(int book) {
        if (book % 10 == 1) {
            System.out.println(name + " вернул " + book + " книгу ");
        } else if (book % 10 < 5) {
            System.out.println(name + " вернул " + book + " книги ");
        } else {
            System.out.println(name + " вернул " + book + " книг ");
        }
    }

    public void returnBook(String book) {
        System.out.println(name + " вернул книгу: " + book);
    }

    public void returnBook(String... book) {
        System.out.println(name + " вернул книги: " + Arrays.toString(book));
    }

    public void takeBook(Book... books) {
        System.out.println(name + " взял книги: " + Arrays.toString(books));
    }

    public void returnBook(Book... books) {
        System.out.println(name + " вернул книги:" + Arrays.toString(books));
    }

    public void info() {
        System.out.println(name + " " + libraryCardNumber + " " + faculty + " " + phone);
    }


    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", number=" + libraryCardNumber +
                ", date='" + date + '\'' +
                ", phone='" + phone + '\'' +
                ", facult='" + faculty + '\'' +
                '}';
    }
}


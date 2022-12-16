package lesson6;
//1. ФИО,
//2. номер читательского билета,
//3. факультет,
//4. дата рождения,
//5. телефон.
//6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
//7. Разработать программу, в которой создается массив объектов данного класса.
//8. Перегрузить методы takeBook(), returnBook():
//  - takeBook, который будет принимать количество взятых книг.
//   Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//  - takeBook, который будет принимать переменное количество названий книг.
//   Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//  - takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса Book
//   (создать новый класс, содержащий имя и автора книги).
//   Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//9. Аналогичным образом перегрузить метод returnBook().
//   Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//   Или  "Петров В. В. вернул 3 книги".


public class MainRead {
    // Демонстрация
    public static void main(String[] args) {
        Reader reader = new Reader();

        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков");
        Book book2 = new Book("Собачье сердце", "Михаил Булгаков");
        Book book3 = new Book("Мёртвые души", "Николай Гоголь");


        reader.setName("Иванов И.И.");
        reader.setNumber(10012);
        reader.setDate("16.12.2002 ");
        reader.setFaculty("Программист-разработчик ");
        reader.setPhone("+7(921)345-34-20 ");

        reader.takeBook(1);
        reader.takeBook(3);
        reader.takeBook(5);
        reader.takeBook("Приключения");
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println();

        reader.returnBook(1);
        reader.returnBook(3);
        reader.returnBook(5);
        reader.returnBook("Приключения");
        reader.returnBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println();

        reader.takeBook(book1, book2, book3);
        reader.returnBook(book1, book2, book3);
        System.out.println();

        reader.info();
    }
}


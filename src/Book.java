import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;


    //Конструктор
    public Book(String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }


    //Сеттер
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    // Методы

    public String toString() {
        return "Название книги " + this.name + " Автор книги: " + author.toString()  + " Дата выпуска: " + this.yearOfPublication;
    }

//    public boolean equals(Object other) {
//        if (this.getClass() != other.getClass()) {
//            return false;
//        }
//        if (!this.name.equals(((Book) other).getName()) &&
//                !this.author.getName().equals(((Book) other).author.getName()) &&
//                !this.author.getSurName().equals(((Book) other).getAuthor().getSurName()) &&
//                this.yearOfPublication != ((Book) other).getYearOfPublication()) {
//            return false;
//        }
//        Book book = (Book) other;
//        return name.equals(book.name); //не очень понял, зачем возвращать все элементы, если мы используем метод и получаем ответ true/false
//    }


//    @Override
//    public String toString() {
//        return "Book{" +
//                "name='" + name + '\'' +
//                ", author=" + author +
//                ", yearOfPublication=" + yearOfPublication +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearOfPublication() == book.getYearOfPublication() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublication);
    }
}

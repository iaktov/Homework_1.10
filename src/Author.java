import java.util.Objects;

public class Author {
    private String name;
    private String surName;


    //Конструктор
    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    //Сеттеры
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    //Методы
    public String toString() {
        return "Имя автора " + this.name + " Фамилия автора: " + this.surName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        if (!this.name.equals(((Author) other).getName()) && !this.surName.equals(((Author) other).getSurName())) {
            return false;
        }
        Author author = (Author) other;
        return name.equals(author.name); //не очень понял, зачем возвращать все элементы, если мы используем метод и получаем ответ true/false
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}

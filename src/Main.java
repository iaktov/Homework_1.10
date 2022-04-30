public class Main {
    public static void main(String[] args) {
        Author cherry = new Author("Cherry", "Marshall");
        Author jane = new Author("Jane", "McDonnell");
        Book history = new Book("Don", cherry, 1943);
        Book clarity = new Book("It's time", jane, 1963);
        System.out.println((history.getName() + " " + history.getYearOfPublication() + " " + history.getAuthor().getName() + " " + history.getAuthor().getSurName()));
        System.out.println(clarity.getName() + " " + clarity.getYearOfPublication() + " " + clarity.getAuthor().getName() + " " + clarity.getAuthor().getSurName());
        clarity.setYearOfPublication(1932);
        System.out.println("clarity.getYearOfPublication() = " + clarity.getYearOfPublication());

        Book man = new Book("It's time", jane, 1963);
        System.out.println(man.toString());
        System.out.println(man.equals(clarity));
        System.out.println(man.hashCode());


        Author mark = new Author("Cherry", "Marshall");
        System.out.println(mark.toString());
        System.out.println(cherry.equals(mark));
        System.out.println(mark.hashCode());


    }

}

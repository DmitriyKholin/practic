import javax.print.PrintService;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Сара", 30, 112),
                new Person("Джон", 12, 113),
                new Person("Иван", 25, 114),
                new Person("Том", 35, 115),
        };





        Customer[] customers = {
                new Customer("Сара", 30, 112, 324545),
                new Customer("Иван", 25, 114,465758),
                new Customer("Том", 35, 115,456685),
        };

        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);



    }
}
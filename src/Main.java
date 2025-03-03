//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Product lexusProduct = new Product(
                "Lexus GS",
                2005,
                "Toyota Motor Corporation",
                "Япония",
                1200000,
                true);

        lexusProduct.infoProduct();
        System.out.println("\nЗадание 2");

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product(
                "Toyota Camry",
                2022,
                "Toyota Motor Corporation",
                "Япония",
                2800000,
                true);
        productsArray[1] = new Product(
                "BMW X5",
                2021,
                "BMW",
                "США",
                4500000,
                false);
        productsArray[2] = new Product(
                "Audi A4",
                2023,
                "Audi AG",
                "Германия",
                5000000,
                true);
        productsArray[3] = new Product(
                "Hyundai Solaris",
                2023,
                "Hyundai Motors",
                "Корея",
                795000,
                false);
        productsArray[4] = new Product(
                "Mercedes-Benz C-Class",
                2020,
                "Mercedes-Benz",
                "Германия",
                1720700,
                false);

        for (Product product : productsArray){
            product.infoProduct();
            System.out.println();
        }


        System.out.println("Задание 3");
        Park park = new Park();
        Park.Attraction attraction = park.new Attraction(
                "Бустер",
                "10:00 - 20:00",
                500);
        attraction.infoAttraction();
    }
}
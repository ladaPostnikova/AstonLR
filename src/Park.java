public class Park {
    public class Attraction {
        private String name;
        String openingHours;
        int price;

        public Attraction (String name, String openingHours, int price){
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        public void infoAttraction() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + openingHours);
            System.out.println("Цена: " + price + " руб.");
        }
    }
}

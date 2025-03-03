public class Product {
    String name;
    int prodDate;
    String manufacturer;
    String countryOfOrigin;
    int price;
    boolean reservationStatus;

    public Product (String name, int prodDate, String manufacturer, String countryOfOrigin, int price, boolean reservationStatus){
        this.name = name;
        this.prodDate = prodDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.reservationStatus = reservationStatus;

    }


    public void infoProduct (){
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + prodDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Состояние бронироваия покупателем: " + reservationStatus);

    }

}

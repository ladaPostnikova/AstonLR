import java.util.*;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add("Постников", "+7(921)123-21-19");
        telephoneDirectory.add("Постников", "+7(962)456-98-26");
        telephoneDirectory.add("Стулов", "+7(987)321-22-17");

        System.out.println("Номера с фамилией Постников:");
        List<String> postnikova = telephoneDirectory.get("Постников");
        if (postnikova.isEmpty()) {
            System.out.println("Номеров не найдено.");
        } else {
            System.out.println("Найдены номера: " + postnikova);
        }

    }
}

import java.util.*;

public class Delivery {
    public static void main(String[] args) {
        Map<Address, Integer> myMap = new HashMap<>();
        myMap.put(new Address("Gandhi Marg", "Delhi"), 10);
        myMap.put(new Address("Malviya Nagar", "Gong"), 15);
        myMap.put(new Address("Agra", "UP"), 18);

        Scanner sc = new Scanner(System.in);
        int total = 0;
        Set<String> countries = new HashSet<>();
        while (true) {
            System.out.println("Заполнение нового заказа: ");
            System.out.println("Введите страну: ");
            String country = sc.nextLine();
            if ("end".equals(country)) {
                break;
            }
            System.out.println("Введите город: ");
            String city = sc.nextLine();
            System.out.println("Введите вес: ");
            int weight = Integer.parseInt(sc.nextLine());

            Address address = new Address(city, country);
            if (myMap.containsKey(address)) {
                int price = weight * myMap.get(address);
                total += price;
                countries.add(country);
                System.out.printf("Стоимость доставки составит: %d руб.\n", price);
                System.out.printf("Общая стоимость всех доставок составит: %d руб.\n", total);
                System.out.printf("Общее количество стран отправления составит: %d\n", countries.size());
            } else {
                System.out.println("Доставки по данному адресу нет.");
            }
        }
    }

}

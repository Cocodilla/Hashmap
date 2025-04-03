import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Maniqure {
    public static void main(String[] args) {
        List<String> names = List.of("Аня", "Вася", "Коля", "Маша", "Петя", "Саша", "Валя", "Даша", "Катя", "Лена", "Марина");
        Queue<String> clients = new ArrayDeque<>(names);
        while (!clients.isEmpty()){
            String client = clients.poll();
            System.out.println(client+" сделал новый маникюр");
            if (Math.random()<0.5){
                clients.offer("это друг"+ client);
            }
        }
    }
}

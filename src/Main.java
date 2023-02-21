import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person>queue = new LinkedList<>(generatorClients());
        while (!queue.isEmpty()){
            Person s = queue.poll();
            s.setTickets(s.tickets - 1);
            System.out.println(s.name + " " + s.surname + " прокатился на аттракционе");
            if(s.getTickets() != 0){
                queue.offer(s);
            }
        }
    }
    public static List<Person> generatorClients() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Володя", "Шарапов", 4));
        list.add(new Person("Глеб","Жиглов", 3));
        list.add(new Person("Владиммир","Высоцкий", 7));
        list.add(new Person("Виктор","Цой", 5));
        list.add(new Person("Иоган_Себастьян","Бах", 2));

        return list;
    }
}
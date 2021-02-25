import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args){
        Map<String, Integer> a=new HashMap<>();
        String[] words ={"Машина","Кошка","Собака","Машина","Еда","Программа","Кошка","Самолет","Мир","Чай","Еда","Джава","Программа","Компьютер","Окно","Зима","Погода","Лето","Весна","Март"};
        for (int i=0;i< words.length;i++) {
            if (a.containsKey(words[i]))
                a.put(words[i], a.get(words[i]) + 1);
            else
                a.put(words[i], 1);
        }
        System.out.println(a);
        }


    }


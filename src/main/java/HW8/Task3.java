package HW8;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    //    Задача 3: На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная строка является
//    ключом, и ее значение равно true, если эта строка встречается в массиве 2 или более раз.
//    Пример: wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
//    wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false} wordMultiple(["c", "c", "c", "c"])→{"c": true}


    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> result = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();

        // Считаем количество каждого слова
        for (String word : words) {
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            } else {
                count.put(word, 1);
            }
        }

        // Заполняем результат: true если 2 и более раз
        for (String word : words) {
            if (count.get(word) >= 2) {
                result.put(word, true);
            } else {
                result.put(word, false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}
package homework8;

import java.util.HashMap;
import java.util.Map;

public class homework8_3 {
        /* На вход поступает массив строк, верните Map<String, Boolean>, где каждая
        отдельная строка является ключом, и ее значение равно true, если эта строка
        встречается в массиве 2 или более раз. Пример:
        wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
        wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
        wordMultiple(["c", "c", "c", "c"])→{"c": true} */

    public static void main(String[] args) {
        String[] test1 = new String[]{"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(test1));

        String[] test2 = new String[]{"c", "b", "a"};
        System.out.println(wordMultiple(test2));

        String[] test3 = new String[]{"c", "c", "c", "c"};
        System.out.println(wordMultiple(test3));
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> countMap = new HashMap<>(); // Создание пустой мапы
        for (String word : words) { //Перебирание элементов в words
            countMap.put(word, countMap.getOrDefault(word, 0) + 1); //Счетчик
        }

        Map<String, Boolean> result = new HashMap<>();
        for (String word : countMap.keySet()) {  //Перебирание ключей из первой мапы
            result.put(word, countMap.get(word) >= 2);
        }

        return result;
    }
}

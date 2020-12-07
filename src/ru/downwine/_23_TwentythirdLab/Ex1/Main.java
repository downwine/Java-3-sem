package ru.downwine._23_TwentythirdLab.Ex1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Алексеева", "Ксения");
        dictionary.put("Кобелева", "Татьяна");
        dictionary.put("Шорин", "Иван");
        dictionary.put("Полукаров", "Иван");
        dictionary.put("Новаков", "Никита");
        dictionary.put("Шатохин", "Никита");
        dictionary.put("Казакова", "Анна");
        dictionary.put("Ивачкина", "Татьяна");
        dictionary.put("Курносова", "Елизавета");
        dictionary.put("Антошин", "Дмитрий");

        Map<String, String> dictionary2 = new HashMap<>();
        for (String key : dictionary.keySet()) {
            String value = dictionary.get(key);
            if (!dictionary2.containsValue(value))
                dictionary2.put(key, value);
        }
        System.out.println("Словарь без одинаковых имён: " + dictionary2);
    }
}

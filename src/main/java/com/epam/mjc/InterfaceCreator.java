package com.epam.mjc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return x -> {
            boolean result = true;
            for (String e : x) {
                char str = e.charAt(0);
                if (!Character.isUpperCase(str)) {
                    result = false;
                }
            }
            return result;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
      return x -> {
            boolean result = true;
            for (String e : x) {
                char str = e.charAt(0);
                if (!Character.isUpperCase(str)) {
                    result = false;
                }
            }
            return result;
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> result = new ArrayList<>();
            for (String e : values) {
                char e_char = e.charAt(0);
                char e_last_char = e.charAt(e.length() - 1);
                String[] e_split = e.split(" ");
                if (Character.isUpperCase(e_char) && e_last_char == '.' && e_split.length > 3) {
                    result.add(e);
                }
            }
            return result;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
    Map<String, Integer> map = new HashMap<>();
        return x -> {
            for(String s : x){
                map.put(s, s.length());
            }
            return map;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
       List<Integer> list3 = new ArrayList<>();
        return (list1, list2) -> {
            list3.addAll(list1);
            list3.addAll(list2);
            return list3;
        };
    }
}

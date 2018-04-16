package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class java8Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(6);
        List<Integer> result = list.stream().sorted().filter(i -> i >= 4 ).collect(Collectors.toList());
        System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}

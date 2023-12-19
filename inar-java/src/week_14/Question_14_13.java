package week_14;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Question_14_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createList();
        System.out.println(list);
        Map<Integer, Integer> map = createMap(list);
        System.out.println(map);
        ArrayList<Integer> moreThanThreeNumbers = getMoreThanThreeNumbers(map);
        System.out.println(moreThanThreeNumbers);


    }

    public static ArrayList<Integer> getMoreThanThreeNumbers(Map<Integer, Integer> map) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) > 3) {
                list.add(i);
            }

        }
        return list;


    }

    public static ArrayList<Integer> createList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 3);
            numbers.add(randomNumber);
        }
        return numbers;
    }

    public static Map<Integer, Integer> createMap(ArrayList<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))) {
                map.put(list.get(i), 1);
            } else {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }

        }
        return map;
    }


}

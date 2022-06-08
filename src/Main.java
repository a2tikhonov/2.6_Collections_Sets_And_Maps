import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(2, 1, 2, 3, 4, 8, 4, 5, 5, 6, 7, 1));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println("Задание 2");
        Set<Integer> set = new LinkedHashSet<>(nums);
        nums.clear();
        nums.addAll(set);
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println("Задание 3");
        List<String> wordsList = new ArrayList<>(List.of("Юля", "Джексон", "Юля", "Маша", "Маша", "Паша", "Дима", "Юля", "Дима", "Маша", "Даша", "Даша", "Аля", "Аля", "Дима", "Паша"));
        Set<String> wordsSet = new LinkedHashSet<>(wordsList);
        System.out.println(wordsSet);
        System.out.println("Задание 4");
        Collections.sort(wordsList);
        System.out.println("wordsList = " + wordsList);
        Map<String, Integer> wordsMap = new HashMap<>();
        Integer dublicateCounter;
        for (int i = 0; i < wordsList.size(); i++) {
            if (wordsMap.containsKey(wordsList.get(i))) {
                dublicateCounter = wordsMap.get(wordsList.get(i)) + 1;
                wordsMap.put(wordsList.get(i), dublicateCounter);
            }
            if (!wordsMap.containsKey(wordsList.get(i))) {
                wordsMap.put(wordsList.get(i), 1);
            }
        }
        System.out.println("wordsMap = " + wordsMap);
        Integer sumOfDublicates = 0;
        for (Map.Entry<String, Integer> dublicateWordsMap : wordsMap.entrySet()) {
            if (dublicateWordsMap.getValue() > 1) {
                sumOfDublicates += dublicateWordsMap.getValue();
            }
        }
        System.out.println("sumOfDublicates = " + sumOfDublicates);

    }
}
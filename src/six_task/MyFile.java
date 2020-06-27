package six_task;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyFile {

    public static void main(String[] args) throws IOException {

        String fileName = "Words.txt";
        String contents;
        contents = readUsingBufferedReader(fileName);

        /**
        список слов храним в виде мапы, где ключ - само слово, значение - количество его повторений
         */
        Map<String, Integer> wordsList = new HashMap<String, Integer>();

            String[] words = contents.split("\\s+"); //массив слов, выделенных из строк по разделителю - пробелу.
            for (int i = 0; i < words.length; i++) {
                String s = words[i];
                Integer frequency = wordsList.get(s);
                wordsList.put(s, frequency == null ? 1 : frequency + 1);
            }
        /**
         * для вывода слов в алфавитном порядке используем метод sort
         * метод toString - строковое представление одномерного массива, разделят элементы запятой
          */
            System.out.println("Unsorted array: " + Arrays.toString(words));
            Arrays.sort(words);
            System.out.println("Sorted array: " + Arrays.toString(words));

         // вывод всех ключей и значений в связке
        for (Map.Entry entry : wordsList.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -  Value: "
                    + entry.getValue());
        }

        int maxValueInMap=(Collections.max(wordsList.values()));  // вернет макс. значение в hashmap
        for (Map.Entry<String, Integer> entry : wordsList.entrySet()) {  // итерируемся по hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println("The word - " + entry.getKey() +" - occurred "+ entry.getValue()+" times");     // печать слова с макс. значением (кол-вом повторов)
            }
        }

    }
    //метод чтения файла в строку
    private static String readUsingBufferedReader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader (fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

}

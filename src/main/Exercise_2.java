package main;

import java.util.List;

public class Exercise_2 {
    //  2. სტრინგი არის ‘ბედნიერი’ თუ მისი შემადგენელი ყოველი სიმბოლოს მომდევნო ელემენტი არ უდრის ამ
    //  სიმბოლოს. სტრინგები შედგება მარტო ‘a’, ‘b’, ‘c’ სიმბოლოებისგან. თქვენ შემოგდით სტრინგების ლისტი,
    //  გამოთვალეთ რამდენი სტრინგი არის ‘ბედნიერი’. int numberOfHappyStrings(List<String> strings);

    public static int numberOfHappyStrings(List<String> strings) {
        int count = 0;
        for (String word : strings) {
            boolean happy = true;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(i - 1)) {
                    happy = false;
                    break;
                }
            }
            if (happy) {
                count++;
            }
        }
        return count;
    }

}

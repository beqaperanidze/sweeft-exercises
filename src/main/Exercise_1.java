package main;

public class Exercise_1 {
    //1. მოცემულია სტრინგი, რომელიც შეიცავს არითმეტიკულ ოპერაციებს (+,-). დაწერეთ ფუნცქია, რომელიც
    //გამოთვლის მოცემული არითმეტიკული ოპერაციის შედეგს int evaluateExpression(String expression);
    //მაგ. expression = “5+20-8+5”. result = 22.

    public static int evaluateExpression(String expression) {

        int result = 0;
        int currentNumber = 0;
        char operation = '+';

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (!Character.isDigit(currentChar) && currentChar != '+' && currentChar != '-') {
                throw new IllegalArgumentException("შეიყვანეთ მხოლოდ ციფრები და არითმეტიკულ ოპერაციები (+,-) ");
            }

            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if (!Character.isDigit(currentChar) || i == expression.length() - 1) {
                if (operation == '+') {
                    result += currentNumber;
                } else if (operation == '-') {
                    result -= currentNumber;
                }

                currentNumber = 0;
                operation = currentChar;
            }
        }

        return result;
    }
}
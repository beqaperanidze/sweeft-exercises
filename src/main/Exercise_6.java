package main;

public class Exercise_6 {
    //მოცემული გვაქვს მთელი რიცხვების ორი მასივი, array და sequence. იპოვეთ თუ მეორე მასივი პირველი
    //მასივის ქვესიმრავლეა და ელემენტები იგივე მიმდევრობით არის მოცემული. boolean isValidSequence(int[]
    //array, int[] sequence);
    //მაგ. array = [5,1,22,25,6,-1,8,10], sequence = [1,6-1,10], result = true.

    public static boolean isValidSequence(int[] array, int[] sequence) {
        int index = 0;

        for (int num : array) {
            if (index == sequence.length) {
                break;
            }
            if (num == sequence[index]) {
                index++;
            }
        }

        return index == sequence.length;
    }
}

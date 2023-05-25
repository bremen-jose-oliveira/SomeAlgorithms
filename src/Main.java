// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] numbers = {1, 5, 10, 12, 14, 15};


        NumTarget n = new NumTarget();

        System.out.println(n.checkForTarget(numbers, 22));
        System.out.println(n.checkForTarget(numbers, 23));

        Polidrome word = new Polidrome();
        System.out.println(word.checkIfPalindrome("racecar"));


        Combine comb = new Combine();
        System.out.println(comb.combine(comb.number1, comb.numbers2));

        IsSubsquenceOr sub = new IsSubsquenceOr();
        System.out.println(sub.isSubsequence("ace","rabcde"));

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(100) ;



    }


}
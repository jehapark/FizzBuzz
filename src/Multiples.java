public class Multiples {
    public static void main(String[] args) {
        int multiplesSoFar = 0;
        int i = 1;
        while (i < 1000){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5){
                multiplesSoFar++;
            }

            i++;
        }
        System.out.println(multiplesSoFar);
    }
}

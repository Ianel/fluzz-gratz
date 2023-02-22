
public class App {
    public static void main(String[] args) throws Exception {
        int[] numbersToTest = new int[]{24, 45, 2, 8, 9, 10, 15};

        for (int number: numbersToTest) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FluzzGratz");
            } else if (number % 3 == 0) {
                System.out.println("Fluzz");
            } else if (number % 5 == 0) {
                System.out.println("Gratz");
            } else {
                System.out.println(number);
            }
        }   
    }
}

import java.util.Scanner;

public class Quests {

    public static void main(String[] args) {
        System.out.println("Enter your equation: ");
        Scanner scanner = new Scanner(System.in);
        String replace = scanner.nextLine();

        StringBuilder string = new StringBuilder(replace);
        String sentence = string.toString().replaceAll("IX", "9").replaceAll("X", "10").replaceAll("VIII", "8").replaceAll("VII", "7").replaceAll("VI", "6").replaceAll("IV", "4").replaceAll("V", "5").replaceAll("III", "3").replaceAll("II", "2").replaceAll("I", "1");

        int plusResult = 0;                                     // Сумма
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isDigit(currentChar)) {
                plusResult += Integer.parseInt("" + currentChar);
                }
            }

        int firstMinus = 0;                                 //Вычитание
        int secondMinus =0;
        for (int i = 0; i < sentence.length()-2; i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isDigit(currentChar)) {
                firstMinus = Integer.parseInt("" + currentChar);
            }
        }
        for (int i = 3; i < sentence.length(); i++) {
            char secondChar = sentence.charAt(i);
            if(Character.isDigit(secondChar)){
                secondMinus = Integer.parseInt("" + secondChar);
            }
        }
        int minusResult = firstMinus - secondMinus;


        int multiplicationResult = 1;                  //Умножение
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isDigit(currentChar)) {
                multiplicationResult *= Integer.parseInt("" + currentChar);
            }
        }

        int firstDivision = 0;
        int secondDivision = 0;
        for (int i = 0; i < sentence.length()-2; i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isDigit(currentChar)) {
                firstDivision = Integer.parseInt("" + currentChar);
            }
        }
        for (int i = 3; i < sentence.length(); i++) {
            char secondChar = sentence.charAt(i);
            if(Character.isDigit(secondChar)){
                secondDivision = Integer.parseInt("" + secondChar);
            }
        }
        if(firstDivision == 0){
            System.out.println("Error: first number should not be equal 0");
        }
        int divisionResult = firstDivision / secondDivision;




        if(sentence.charAt(1) == ' ' && sentence.charAt(3) == ' ') {
            switch (sentence.charAt(2)) {
                case '+':
                    System.out.println(plusResult);
                    break;
                case '-':
                    System.out.println(minusResult);
                    break;
                case '*':
                    System.out.println(multiplicationResult);
                    break;
                case '/':
                    System.out.println(divisionResult);
                    break;
                default:
                    System.out.println("Incorrect entry. Follow the example: 5 + 5 or III + IV");
            }
        } else {
            System.out.println("Incorrect entry. Follow the example: 5 + 5 or III + IV");
        }
    }
}

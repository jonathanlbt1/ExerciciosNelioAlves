package Exercicio7_2;

public class Student {

    public String studentName;
    public double gradeOne;
    public double gradeTwo;
    public double gradeThree;

    public double media() {
        return gradeOne + gradeTwo + gradeThree;
    }

    public void finalResult() {
        System.out.printf("\nFINAL GRADE = %.2f", media());
        if(media() >= 60.00) {
            System.out.println("\nPASS");
        }
        else {
            System.out.println("\nFAILED");
            System.out.println(String.format("MISSING %.2f", (60.0 - media())) + " POINTS");
        }
    }
}

package other;

/**
 * Switch
 * Created by luosv on 2017/2/6 0006.
 */
public class Switch {

    public static void main(String[] args) {

        char grade = 'C';

        switch (grade) {
            //noinspection ConstantConditions
            case 'A':
                System.out.println("Excellent!");
                break;
            //noinspection ConstantConditions
            case 'B':
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("You passed!");
            case 'F':
                System.out.println("Better try again!");
                break;
            default:
                System.out.println("Invalid grade!");
        }

        System.out.println("Your grade is " + grade);

    }

}
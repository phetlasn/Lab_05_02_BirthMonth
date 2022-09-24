public class BirthMonth {
    public static void main(String[] args) {
        int birthMonth = 13;

        System.out.println("What is the number of your birth month? [1-12]");

        if (birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered a incorrect month value: " + birthMonth);
        }
    }
}
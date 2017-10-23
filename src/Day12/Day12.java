import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    String calculate() {
        int avg = 0;
        for (int i = 0; i < testScores.length; i++) {
            avg += testScores[i];
        }
        avg = avg / testScores.length;

        if (90 <= avg && avg <= 100) {
            return "O";
        } else if (80 <= avg && avg < 90)
            return "E";
        else if (70 <= avg && avg < 80)
            return "A";
        else if (55 <= avg && avg < 70)
            return "P";
        else if (40 <= avg && avg < 55)
            return "D";
        else if (avg < 40)
            return "T";
        else
            return null;
    }
}

class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
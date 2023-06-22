// import java.util.Scanner;

// class TestGrades

// {
// public static void main(String[] arg)

// {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter your id ----- >");
// String id = input.nextLine();

// MyGrades m = new MyGrades(id);

// System.out.print("\nEnter test score -----> ");
// double grade = input.nextDouble();
// m.add(grade);

// System.out.print("\nEnter test score -----> ");
// grade = input.nextDouble();
// m.add(grade);

// System.out.print("\nEnter test score -----> ");
// grade = input.nextDouble();
// m.add(grade);

// m.average();
// System.out.println("\n" + m);

// }
// }

import java.util.Scanner;

class TestGrades

{
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your id -----> ");
        String id = input.nextLine();

        MyGrades m = new MyGrades(id);

        System.out.print("\nEnter test score -----> ");
        double grade = input.nextDouble();
        m.add(grade);

        System.out.print("\nEnter test score -----> ");
        grade = input.nextDouble();
        m.add(grade);

        m.average();
        System.out.println("\n" + m);

    }

    // error persists for Scanner Input
}
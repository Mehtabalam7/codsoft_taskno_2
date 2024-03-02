package secondinternship.task2;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner gd = new Scanner(System.in);

        
        System.out.println("===>STUDENT GRADE CALCULATER<<<===");
        System.out.println("\n\nEnter the number of subjects");
        int subjects = gd.nextInt();
        int subcount = 1;

        int[] marks = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter the mark of subject " + subcount);
            marks[i] = gd.nextInt();
            subcount++;
        }

        int sum = 0;
        for (int i = 0; i < subjects; i++) {
            sum += marks[i];
        }

        System.out.println("The total marks is:" + sum);

        double averagePercentage = (double) sum / (subjects * 100) * 100;

        System.out.println("The Average Percentage of your five subject marks is:" + averagePercentage);

        if (averagePercentage >= 90) {
            System.out.println("You have obtained Grade: A");
        }

        else if (averagePercentage >= 80) {
            System.out.println("You have obtained Grade: B");
        }

        else if (averagePercentage >= 70) {
            System.out.println("You have obtained Grade: C");
        } 

        else if (averagePercentage >= 60) {
            System.out.println("You have obtained Grade: D");
        }

        else if (averagePercentage >= 50) {
            System.out.println("You have obtained Grade: E");
        }

        else {
            System.out.println("You have obtained Grade: F");
        }
        
    }
}

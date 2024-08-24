// TASK 2
import java.util.Scanner;

public class studentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int numSubject = sc.nextInt();
        

        int marks[] = new int[numSubject];

        // taking marks of each subject 
        for(int i=0; i<numSubject; i++)
        {
            System.out.print("Enter marks obtained in subject " + (i+1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            // checking if marks input is valid or not
            while(marks[i]<0 || marks[i] > 100)
            {
                System.out.println("Invalid marks! Please enter marks out of 100");
                marks[i] = sc.nextInt();
            }
        }

       
        
        // calculating total marks
        int totalMarks = 0;
        for(int j=0; j<numSubject; j++)
        {
            totalMarks += marks[j];
        }

        // calculating average percentage 
        int avgPercentage = totalMarks / numSubject ;

        char grade = ' ';
        // assigning grades
        if(avgPercentage >= 85 && avgPercentage <= 100)
        {
            grade = 'A';
        }
        else if(avgPercentage >= 70 )
        {
            grade = 'B';
        }
        else if(avgPercentage >= 50 )
        {
            grade = 'C';
        }
        else if(avgPercentage >= 35)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Average percentage obtained: "+ avgPercentage+"%");
        System.out.println("Grade obtained: "+ grade);
    }
}

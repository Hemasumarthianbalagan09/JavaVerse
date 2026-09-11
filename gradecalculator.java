import java.util.Scanner;

class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter mark 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter mark 5: ");
        int m5 = sc.nextInt();

        if(m1 < 40 || m2 < 40 || m3 < 40 || m4 < 40 || m5 < 40)
        {
            System.out.println("Fail");
        }
        else
        {
            int total = m1 + m2 + m3 + m4 + m5;
            double average = total / 5.0;

            System.out.println("Total = " + total);
            System.out.println("Average = " + average);

            if(average >= 90)
                System.out.println("Grade A");
            else if(average >= 80)
                System.out.println("Grade B");
            else if(average >= 70)
                System.out.println("Grade C");
            else if(average >= 60)
                System.out.println("Grade D");
            else
                System.out.println("Grade E");
        }
    }
}
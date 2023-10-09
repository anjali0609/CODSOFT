import java.util.Scanner;

public class Grade {
    public static void main(String[] args)
    {
        Grade g= new Grade();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of first subject:");
        int S1=sc.nextInt();
        System.out.print("Enter the marks of Second subject:");
        int S2=sc.nextInt();
        System.out.print("Enter the marks of Third subject:");
        int S3=sc.nextInt();
        System.out.print("Enter the marks of Fourth subject:");
        int S4=sc.nextInt();
        System.out.print("Enter the marks of Fifth subject:");
        int S5=sc.nextInt();
        float total,avg;
        total=S1+S2+S3+S4+S5;
        avg= (total/500)*100;
        if(avg<=99 && avg>80){
            System.out.println("Your total marks: "+total+"\n Your percentage: "+avg+"% \n Your Grade is 'A'.");
        } else if (avg<=79 && avg>60) {
            System.out.println("Your total marks:"+total+"\n Your percentage: "+avg+"% \nYour Grade is 'B'.");
        } else if (avg<=59 && avg>40) {
            System.out.println("Your total marks:"+total+"\n Your percentage: "+avg+"% \nYour Grade is 'C'.");
        }
            else{
            System.out.println("Your total marks:"+total+"\n Your percentage"+avg+"% \nYour Grade is 'D'.");
            }
    }
}

import java.util.Scanner;
class Game{
    private int counter=0;
    private int usernum;
    public int compnum;
    private int maxAttempts=3;
    private int attempts=0;
    public Game()
    {
       compnum=(int)(Math.random()*100);
    }
    public void setNumber(int n)
    {
        usernum=n;
    }
    public int isCorrect()
    {
        if(usernum==compnum) {
            return 0;
        }
        else if(usernum>compnum){
            return -1;
        }
        else{
            return 1;
        }
    }
    public void setCounter(){
        counter++;
    }
    public void getCounter()
    {
        System.out.println("Your total score is :"+counter);
        System.out.println("You Win.");
    }
    public boolean hasAttemptsLeft(){
        return attempts<maxAttempts;
    }
    public void incrementAttempts()
    {
        attempts++;
    }
}
public class NumberGame {
    public static void main(String[] args)
    {

        Game obj = new Game();
        Scanner sc= new Scanner(System.in);

        while(obj.hasAttemptsLeft()){
            System.out.println("Enter a number between 1 to 100:");
            int n=sc.nextInt();
            obj.setNumber(n);

            if(obj.isCorrect()==0){
                obj.setCounter();
                System.out.println("Congratulation!!You have guessed the correct number.");
                obj.getCounter();
                break;
            }
            else if(obj.isCorrect()==-1){
                obj.incrementAttempts();
                obj.setCounter();
                System.out.println("Hint!!You have to enter the smaller number.");
            }
            else if(obj.isCorrect()==1){
                obj.incrementAttempts();
                obj.setCounter();
                System.out.println("Hint!!You have to enter the larger number.");
            }
        }
        if(!obj.hasAttemptsLeft()){
            System.out.println("sorry,you have used all your attempts \n the correct number was:"+obj.compnum);
        }

    }

}

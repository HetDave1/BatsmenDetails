import java.util.Scanner;

public class Batsmen
{
    int runs_made,no_of_four,no_of_six,new_run,new_four,new_six,cal_four,cal_six;
    String first_name,last_name;
    
    Scanner sc=new Scanner(System.in);
    public void get()
    {
        System.out.println("\nEnter Your First Name\n");
        first_name=sc.next();
        System.out.println("\nEnter Your Last Name\n");
        last_name=sc.next();
        System.out.println("\nEnter The Runs Made\n");
        runs_made=sc.nextInt();
        System.out.println("\nEnter No. of Fours\n");
        no_of_four=sc.nextInt();
        System.out.println("\nEnter No. of Sixes\n");
        no_of_six=sc.nextInt();
    }
    public void update()
    {
        System.out.println("\nEnter New Runs Made\n");
        new_run=sc.nextInt();
        runs_made=runs_made+new_run+cal_six+cal_four;
        
        System.out.println("\nEnter New Four Made\n");
        new_four=sc.nextInt();
        no_of_four=no_of_four+new_four;
        cal_four=no_of_four*4;
        
        System.out.println("\nEnter New Six Made\n");
        new_six=sc.nextInt();
        no_of_six=no_of_six+new_six;
        cal_six=no_of_six*6;
    }
    public void display()
    {
        System.out.print(first_name+""+last_name+" "+runs_made+" "+no_of_four+" "+no_of_six);
    }
    
    public static void main()
    {
        Batsmen b=new Batsmen();
        b.get();
        b.update();
        b.display();
    }
}

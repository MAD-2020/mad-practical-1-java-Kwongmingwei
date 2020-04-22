import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of integers:");
    int num1=in.nextInt();
    List<Integer>List1=new ArrayList<Integer>();
    List<Integer>List2=new ArrayList<Integer>();
    for (int i=0;i<num1;i++){
      System.out.println("Enter integer:");
      int numb=in.nextInt();
      if (List1.contains(numb)){
        int a=List1.indexOf(numb);
        List2.set(a, List2.get(a)+1);
      }
      else{
        List1.add(numb);
        List2.add(1);
      }
    }
    int c=0;
    if (List2.size()<1){
      System.out.println("Less than 1 integer");
    }
    else{
      for (int i=0;i<List2.size();i++){
        if(c<List2.get(i)){
        c=List2.get(i);
        }
      }
    }
    int e=List2.indexOf(c);
    int d=List1.get(e);
    System.out.println("Mode is: "+d);
    
  }
}

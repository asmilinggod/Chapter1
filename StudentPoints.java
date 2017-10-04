
/**
 * Write a description of class StudentPoints here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentPoints
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StudentPoints
    	
     */
    public StudentPoints()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main (String[] args){
        makeTable();
        
    }
    public static void makeTable(){
        makeHeader();
        labelColumns();
        populateRows();
    }
    public static void makeHeader(){
        System.out.println("========================");
        System.out.println("==== Student Points ====");
        System.out.println("========================");
    }
    public static void labelColumns(){
        System.out.println("Name"+"\t\t"+"Lab"+"\t"+"Bonus"+"\t"+"Total");
    }
    public static void populateRows(){
        populateOneRow("Joe", 40, 7);
        populateOneRow("William", 50, 8);
    }
    public static void populateOneRow(String name, int lab, int bonus){
        System.out.println(name +"\t\t"+lab+"\t"+bonus+"\t"+(lab+bonus));
    }
}
  
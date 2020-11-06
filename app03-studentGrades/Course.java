
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Louis Scannell
 * @version 0.1 03/11/2020
 */
public class Course
{
    // instance variables
    private String courseName;
    private String codeNumber;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
        
    private Grades finalGrade;
        
    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, String codeNumber)
    {
        // initialise instance variables
        this.courseName = courseName;
        this.codeNumber = codeNumber;
        
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Computer Architecture", "CO450");
        module3 = new Module("Web Development", "CO456");
        module4 = new Module("Digital Technologies And Professional Practice", "CO454");
    }

    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        else if (moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        else if (moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        else if (moduleNo == 4)
        {
            module4.awardMark(mark);
        }
        else
        {
            System.out.println ("Please choose a valid module number");
        }
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        System.out.println("Course: " + courseName + " Course Number: " + codeNumber);
    }
    
    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 40))
        {
            return Grades.F;
        }
        else if ((mark >=40) && (mark <50 ))
        {
            return Grades.D;
        }
        else if ((mark >=50) && (mark <60 ))
        {
            return Grades.C;
        }
        else if ((mark >=60) && (mark <70 ))
        {
            return Grades.B;
        }
        else if ((mark >=70) && (mark <=100 ))
        {
            return Grades.A;
        }
        
        return Grades.X;
    }
}

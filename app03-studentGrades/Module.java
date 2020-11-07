
/**
 * The class for the modules
 *
 * @author (Louis Scannell)
 * @version (06/11/2020)
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
    }
    
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.print("Invalid mark!!!");
        }
    }
    
    //prints module details
    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
    }
    
    //gets the mark
    public int getMark()
    {
        return mark;
    }
    
    public String getCodeNo()
    {
        return codeNo;
    }

}

package studentarray;

/**
 * This class +++Insert Description Here+++
 *
 * @author Paul Bonenfant
 */
public class PartTimeStudent extends Student{

    private int noOfCreditHours;
    
    public PartTimeStudent(String name, String studentId, int noOfCreditHours) {
        super(name, studentId);
        this.noOfCreditHours = noOfCreditHours;
    }

}


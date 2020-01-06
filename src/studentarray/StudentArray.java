package studentarray;

/**
 *
 * @author paulbonenfant
 */
public class StudentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student("a", "1");
        Student s2 = new Student("b", "2");
        Student s3 = new Student("c", "3");
        Student s4 = new Student("d", "4");
        Student s5 = new Student("e", "5");
        
        Student[] studentArray = new Student[5];
        
        studentArray[0] = s1;
        studentArray[1] = s2;
        studentArray[2] = s3;
        studentArray[3] = s4;
        studentArray[4] = s5;
        
        for (int i = 0; i < studentArray.length; i++) {        
            System.out.println(studentArray[i].getName());
        }
        
        for (Student s: studentArray) {
            System.out.println(s.getStudentId());
        }
    }
    
}

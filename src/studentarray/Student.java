package studentarray;

/**
 * One line added
 *
 * @author paulbonenfant
 */
public class Student {
    private String name;
    private String studentId;

    /**
     * 
     * @param name
     * @param studentId 
     */
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


     
}


package arraydemo;


public class student {
    private String studentId;
    private String StudentName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public student(String studentId, String StudentName) {
        this.studentId = studentId;
        this.StudentName = StudentName;
    }
    
    
}

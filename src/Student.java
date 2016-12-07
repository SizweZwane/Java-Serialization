import java.io.Serializable;

/**
 * Created by HP on 2016/12/07.
 */
public class Student implements Serializable {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}

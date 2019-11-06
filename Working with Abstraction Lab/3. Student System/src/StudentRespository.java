import java.util.HashMap;
import java.util.Map;

public class StudentRespository {
    private Map<String,Student> students;

    public StudentRespository() {
        this.students = new HashMap<>();
    }

    public boolean containsByName(String name) {
        return this.students.containsKey(name);
    }

    public void registerStudent(String name, Student student) {
        this.students.put(name,student);
    }

    public Student getStudent(String name) {
        return this.students.get(name);
    }
}

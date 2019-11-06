public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }


    public int getAge() {
        return this.age;
    }


    public double getGrade() {

        return this.grade;
    }

    @Override
    public String toString() {
        String endFix;
        if (this.grade >= 5.00) {
            endFix= " Excellent student.";
        } else if (this.grade < 5.00 && this.grade >= 3.50) {
            endFix= " Average student.";
        } else {
            endFix= " Very nice person.";
        }
        return String.format("%s is %s years old.%s",
                this.getName(),
                this.getAge(),
                endFix);
    }
}

public class CreateCommand implements Command {

    public  void execute(StudentRespository respository,String[] args){
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        double grade = Double.parseDouble(args[3]);
        if (!respository.containsByName(name)) {
            Student student = new Student(name, age, grade);
            respository.registerStudent(name, student);
        }

    }
}

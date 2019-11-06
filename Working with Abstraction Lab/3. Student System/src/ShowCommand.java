public class ShowCommand implements Command {
    public void execute(StudentRespository repository, String[] args) {
        String name = args[1];
        if (repository.containsByName(name)) {
            Student student = repository.getStudent(name);


            System.out.println(student.toString());
        }
    }
}



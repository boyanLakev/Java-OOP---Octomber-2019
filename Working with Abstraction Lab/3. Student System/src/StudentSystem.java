
public class StudentSystem {
    private StudentRespository repo;

    public StudentSystem() {
        this.repo = new StudentRespository();
    }

    @Deprecated
    public StudentRespository getRepo() {
        return this.repo;
    }

    public void executeCommand(String[] args) {

        Command command=  CommandFactory.createCommand(args[0]);
        command.execute(repo,args);

    }


}

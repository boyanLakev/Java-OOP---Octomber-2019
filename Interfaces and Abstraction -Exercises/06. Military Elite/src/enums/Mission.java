package enums;

public enum Mission {
    IN_PROGRESS( "inProgress"),
    FINISHED( "finished");
    private final String name;
    Mission(String name){
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
}

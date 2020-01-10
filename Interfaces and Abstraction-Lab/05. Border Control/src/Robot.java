public class Robot implements Identifiable {
    private String Id;
    private String model;

    public Robot(String model, String Id) {
        this.Id = Id;
        this.model = model;
    }



    @Override
    public String getId() {
        return this.Id;
    }

    public String getModel() {
        return model;
    }
}

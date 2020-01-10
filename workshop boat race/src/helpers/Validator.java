package helpers;

public class Validator {
    public static boolean validateModel(String model) {
        return model.length() >= 5;
    }

    public static boolean validatorEngine(String model) {
        return model.length() >= 3;
    }

    public static boolean validateParam(int params) {
        return params > 0;
    }



}

import java.util.List;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : this.numbers) {
            boolean valid = isValidNumber(number);
            if (valid) {
                sb.append("Calling... ")
                        .append(number)
                        .append(System.lineSeparator());
            }else sb.append("Invalid number!").append(System.lineSeparator());
        }

        return sb.toString();

    }

    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : this.urls) {
            boolean valid = isValidURL(url);
            if (valid) {
                sb.append("Browsing: ")
                        .append(url)
                        .append("!")
                        .append(System.lineSeparator());
            }else sb.append("Invalid URL!").append(System.lineSeparator());
        }

        return sb.toString();
    }

    private boolean isValidURL(String url) {
        for (char ch : url.toCharArray()) {
            if (Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidNumber(String number) {
        for (char ch : number.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

}

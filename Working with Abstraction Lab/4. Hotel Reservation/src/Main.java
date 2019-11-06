import java.util.Scanner;

public class Main {
    enum Season{
        Autumn(1),
        Spring(2),
        Winter(3),
        Summer(4);


        private final int index;

        Season(int index) {
            this.index=index;
        }

        public int getIndex() {
            return index;
        }
    }
    enum DiscountType{
        None(0),
        SecondVisit(10),
        VIP(20);

        private final double discount;

        DiscountType(int i) {
            this.discount=(100-i)/100.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split("\\s+");
        double pricePerDay=Double.parseDouble(input[0]);
        int numberOfDays=Integer.parseInt(input[1]);
        String season=input[2];
        String discountType=input[3];
        int seasonMultiply= Season.valueOf(season).getIndex();
        double discount=DiscountType.valueOf(discountType).discount;
        double result=pricePerDay*numberOfDays*seasonMultiply*discount;
        System.out.printf("%.2f%n",result);



        
    }
}

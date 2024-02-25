import java.util.Scanner;

public class Main {
    //in ml / m**2
    static final int RAIN_QUANTITY_MIN = 10;
    // in Km/h
    static final int WIND_SPEED_MIN = 40;

    public static void main(String[] args) {
        
        ifExample();

        switchExample();
    }

    private static void switchExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your country name");
        String country = scanner.next();

        //switch example
        switch (country) {
            case "France":
                System.out.println("Bonjour");
                break;
            case "England":
                System.out.println("Hello");
                break;
            case "USA":
                System.out.println("Hi");
                break;
            case "Germany":
                System.out.println("");
                break;
            case "Italy":
                System.out.println("Bonjourno");
                break;
            case "Spain":
                System.out.println("Holla");
                break;
            default:
                System.out.println("Hello");
        }
    }

    private static void ifExample() {
        int rainDailyQuantity = 0;
        int windSpeed = 2;
        boolean isRaining = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("insert rain daily quantity");
        rainDailyQuantity = scanner.nextInt();
        System.out.println("insert wind speed");
        windSpeed = scanner.nextInt();
        System.out.println("is raining");
        isRaining = scanner.nextBoolean();


        //if example
        if (isRaining) {//first if block start
            if (rainDailyQuantity >= RAIN_QUANTITY_MIN
                    && windSpeed >= WIND_SPEED_MIN) {//second if block start

                System.out.println("take a coat");

            } else {
                //second if block end
                //start else block (of the second if condition)
                System.out.println("take an umbrella");
            }
        } else if ((rainDailyQuantity > 2 && windSpeed < 3) || (true && !false)) {
            //first if block end
            //start new if block on the same hierarchy level as first if
            System.out.println("have a nice day");
        }//end first if else if block

        //outside any if else block so it always happens!
        System.out.println("Hello world!");
    }
}
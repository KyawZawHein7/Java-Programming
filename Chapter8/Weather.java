import java.util.*;
public class Weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        double[][][]data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner input = new Scanner(System.in);

        for(int k=0;k<NUMBER_OF_DAYS*NUMBER_OF_HOURS;k++){
            int day =input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();

            data[day-1][hour-1][0]= temperature;
            data[day-1][hour-1][1]= humidity;
        }
        input.close();

        //Find average daily temperature and humidity

        for(int row = 0; row < NUMBER_OF_DAYS; row++){
            double dailyTemperaturetotal = 0; double dailyhumiditytotal =0;
            for(int col =0; col < NUMBER_OF_HOURS; col++){
                dailyTemperaturetotal+= data[row][col][0];
                dailyhumiditytotal+=data[row][col][1];
            }
            System.out.println("Day"+(row+1)+" 's average temperature is "+dailyTemperaturetotal/NUMBER_OF_HOURS);
            System.out.println("Day"+(row+1)+" 's average humidity is "+dailyhumiditytotal/NUMBER_OF_HOURS);
        }
    }
    
}

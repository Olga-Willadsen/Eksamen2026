package Opgave_3;

import java.util.InputMismatchException;

public class Controller {

    View v = new View();
    SalesReader sr = new SalesReader("Data/opgave_3_sales.csv");





    public void optionsLoop (){
            int response;
                response = v.menu();

            switch (response) {
                case 1:
                    int totalsales = sr.totalSales();
                    System.out.println("The total sales are "+totalsales);
                    optionsLoop();
                    break;
                case 2:
                    double averageSales = sr.averageSales(); //formater double til 2 decimaler
                    System.out.println("the average sales are: "+averageSales);
                    optionsLoop();
                    break;
                case 3:
                    int maxSales=sr.maxSales(); //hvordan vil jeg få den til at printe hvilken måned dette salg tilhører?
                    System.out.println("the highest salesnumber is: "+ maxSales + ", in month:"+ sr.bestMonth());
                    optionsLoop();
                    break;
            }
        }



}

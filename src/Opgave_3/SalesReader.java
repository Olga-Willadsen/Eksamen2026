package Opgave_3;

import java.io.File;
import java.util.*;

public class SalesReader {


    private String url;
    private TreeMap <Integer, Integer> monthlySales;

    SalesReader(String url){
        this.url=url;
        this.monthlySales=monthlySales();
    }



    public int maxSales () {
        int maxSales = 0;
            for (int sales : monthlySales.values()) {
                if (sales > maxSales) {
                    maxSales = sales;
                }
            }
        return maxSales;
    }

    public int bestMonth () {
        for (int month : monthlySales.keySet()) {
            if (monthlySales.get(month) == maxSales()) {
                return month;
            }
        } return 0;
    }


    public int totalSales(){
        int totalSales=0;

        for(int sales:monthlySales.values()){
            totalSales+=sales;
        }
        return totalSales;
    }



    public double averageSales(){
        double averageSales=0;
            for (int sales : monthlySales.values()) {
                averageSales += sales;
            }
           averageSales=averageSales/(monthlySales().size());
        return averageSales;
    }




    public TreeMap<Integer, Integer> monthlySales(){

        monthlySales= new TreeMap<>();
        ArrayList <String> data=FileIO.dataString(this.url);

        for (String s:data) {
            String [] line = s.split(",");

            int month=Integer.parseInt(line[0].trim());
            int sales=Integer.parseInt(line[1].trim());

            monthlySales.put(month, sales);
            }
        return monthlySales;
    }


    public void lastYearSales (){
        for (int month: monthlySales.keySet()){
            System.out.println("key: "+month+" value: "+ monthlySales.get(month));
        }
    }





}

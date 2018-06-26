/*
 current world pupolation = 7,631,512,933

current growth rate of the world population = 1.09%

statictis for the the java program is that
with the current population and the growth rate,
we actually calculate the world population for five different years giving that,
the current world population is update for each year.

This is so because using the current the formular of population growth
where we have [currentPopulation + (growthrate * currentPopulation).
 */




//import Scanner
import java.util.Scanner;

public class worldPopulation {

    //main program block begins
    public static void main(String[] args){
     
    	Scanner input = new Scanner(System.in);

	    double currentPopulation;
	    double yearOne;
	    double yearTwo;
	    double yearThree;
	    double yearFour;
	    double yearFive;
	    float growthRate;

	    //prompt the user to enter the current population
	    System.out.print( "Enter the current world population (exclude commas): ");
	    currentPopulation = input.nextDouble();

	    //prompt the user to enter the population growth rate
	    System.out.print( "Enter the annual world population growth rate (in percent): ");
	    growthRate = input.nextFloat();
	    growthRate = growthRate / 100;

	    yearOne = currentPopulation + ( currentPopulation * growthRate );
	    System.out.printf( "\nWorld population after one year: %.0f\n", yearOne );

	    currentPopulation = yearOne;

	    yearTwo = currentPopulation + ( currentPopulation * growthRate );
	    System.out.printf( "                after two years: %.0f\n", yearTwo );

	    currentPopulation = yearTwo;

	    yearThree = currentPopulation + ( currentPopulation * growthRate );
	    System.out.printf( "              after three years: %.0f\n", yearThree );

	    currentPopulation = yearThree;

	    yearFour = currentPopulation + ( currentPopulation * growthRate );
	    System.out.printf( "               after four years: %.0f\n", yearFour );

	    currentPopulation = yearFour;

	    yearFive = currentPopulation + ( currentPopulation * growthRate );
	    System.out.printf( "               after five years: %.0f\n", yearFive );

    }

 }

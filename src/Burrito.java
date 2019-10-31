import java.util.Random;
import java.util.Scanner;

public class Burrito {

    public static void main(String[] args) {

       /* Write a program that will allow a robot to assemble 10 burritos.
       Use a random generator for each burrito option and build a list of 10 burrito customizations:

        Rice: white, brown, no rice
        Meat: chicken, steak, carnidas, chorizo, sofritas, veggies
        Beans: pinto, black, no beans
        Salsa: mild, medium, hot, no salsa
        Veggies: lettuce, fajita veggies, no veggies*/

        //  Save the finished burritos and display the contents.//
// 1.Create an array
        String[] Rice = new String[]{"white", "brown", "no rice"};
        String[] Meat = new String[]{"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        String[] Beans = new String[]{"pinto", "black", "no beans"};
        String[] Salsa = new String[]{"mild", "medium", "hot", "no salsa"};
        String[] Veggies = new String[]{"lettuce", "fajita", "veggies", "no veggies"};


        //String[] Ingredients = {"white", "brown", "no rice","chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies","pinto", "black", "no beans","mild", "medium", "hot", "no salsa","lettuce", "fajita","veggies", "no veggies"};//

//2.Randomly pick 1 element from each array


        Random r = new Random(); // create a random class


        for (int i = 0; i < Rice.length; i++) {


            System.out.println(Rice[i]);




            //3. Create array for burritos 1-10 and same the ingridients in those arrays

            for (int j = 0; j < Meat.length; j++) {


                System.out.println(Meat[j]);

                for (int k = 0; k < Beans.length; k++) {


                    System.out.println(Beans[k]);

                    for (int l = 0; l < Salsa.length; l++) {

                        System.out.println(Salsa[l]);

                        for (int m = 0; m < Veggies.length; m++) {


                            System.out.println(Veggies[m]);




                           // String [] Burrito2= new String []{"white",  "chicken","pinto", "lettuce", "fajita"};

                            //  int x = r.nextInt(Ingredients.length);//

                            //Scanner input = new Scanner (System.in);
                            //  System.out.println("nextBurrito?");
                            //int Burrito1 = input.nextInt();
                        }
                    }

                }
            }
        }
    }
}
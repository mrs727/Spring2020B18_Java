package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String[][] zoo = {wildAnimals, birds};
        //                     0         1

        String kfc = zoo[1][3];

        System.out.println(kfc);
        System.out.println("=======================");

        for(String eachBird : zoo[1]){
            if(eachBird.equalsIgnoreCase("Chicken")){
                continue;
            }
            System.out.println(eachBird);
        }
        System.out.println("=======================");

        for(String eachAnimal : zoo[0]){
            if(eachAnimal.equals("Turtle")){
                continue;
            }
            System.out.println(eachAnimal);
        }



    }
}

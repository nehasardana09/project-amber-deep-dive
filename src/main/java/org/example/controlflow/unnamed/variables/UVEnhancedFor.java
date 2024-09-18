
import org.example.controlflow.unnamed.variables.Fruit;

import java.util.ArrayList;
import java.util.List;

public void main(){

        List<Fruit> fruitsBasket = new ArrayList<>();
        fruitsBasket.add(new Fruit("Apple", 10));
        fruitsBasket.add(new Fruit("Mango", 4));
        fruitsBasket.add(new Fruit("Orange", 8));

        int countFruits = 0;
        for(Fruit _ : fruitsBasket){
            countFruits++;
        }
        System.out.println(countFruits);


        //Example 1 - enhanced for loop with unnamed variable
        //print the number no of times
        //side effect
        int[] arrays = {1,2,3,4,5,6,7,8,9};
        int count = 0;

        for(int _ : arrays){
            count++;
            for(int i = 0; i< count; i++){
                System.out.print("0 ");
            }
        }


    }


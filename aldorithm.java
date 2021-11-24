// Java Program explaining util.Dictionary class Methods
// put(), elements(), get(), isEmpty(), keys()
// remove(), size()

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class New_Class
{
	public static void main(String[] args)
	{
        // fruits name we have
        ArrayList<String> fruits = new ArrayList<String>(); //arraylist
        String[] fruits_array = new String[] {"strawberry", "apple", "banana", "papaya", "orange", "pineapple", "grapefruit", "mango", "watermelon", "guava"}; // array of all fruits name we have
        Collections.addAll(fruits, fruits_array); // Inster fruit array into arraylist
        
        // making arraylists of all fruit that is good in disease
        
        // strawberry
        ArrayList<String> strawberry_good_for = new ArrayList<String>();
        String[] strawberry_good_for_array = new String[] {"HeartHealth","Stroke","Cancer","NormalBloodPressure","Diabetes"};
        Collections.addAll(strawberry_good_for, strawberry_good_for_array);
        
        // apple
        ArrayList<String> apple_good_for = new ArrayList<String>();
        String[] apple_good_for_array = new String[] {"Stroke","Cholesterol","Hearthealth","Cancer","Obesity","fever"};
        Collections.addAll(apple_good_for, apple_good_for_array);
        
        // making arraylists of all fruit that is bad in disease
        
        // strawberry
        ArrayList<String> strawberry_bad_for = new ArrayList<String>();
        String[] strawberry_bad_for_array = new String[] {"LowCalories","fever","LowProteIn","LowFat","HighInSugar", "LowInVitamins"};
        Collections.addAll(strawberry_bad_for, strawberry_bad_for_array);
        
        // apple
        ArrayList<String> apple_bad_for = new ArrayList<String>();
         String[] apple_bad_for_array = new String[] {"HighCalories","LooseStools","Stomachache","Pesticides","Allergies"};
        Collections.addAll(apple_bad_for, apple_bad_for_array);
	}
}

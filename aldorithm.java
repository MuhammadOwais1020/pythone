import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class HelloWorld{

     public static void main(String []args){
        ArrayList<String> bad = new ArrayList<String>();
        ArrayList<String> good = new ArrayList<String>();
        
        // fruits name we have
        ArrayList<String> fruits = new ArrayList<String>(); //arraylist
        String[] fruits_array = new String[] {"strawberry", "apple", "banana", "papaya", "orange", "pineapple", "grapefruit", "mango", "watermelon", "guava"}; // array of all fruits name we have
        Collections.addAll(fruits, fruits_array); // Inster fruit array into arraylist
                
        // making arraylists of all fruit that is good in disease
        // strawberry
        ArrayList<String> strawberry_good_for = new ArrayList<String>();
        String[] strawberry_good_for_array = new String[] {"Heart Health","Stroke","Cancer","Normal Blood Pressure","Diabetes"};
        Collections.addAll(strawberry_good_for, strawberry_good_for_array);
                
        // apple
        ArrayList<String> apple_good_for = new ArrayList<String>();
        String[] apple_good_for_array = new String[] {"Stroke","Cholesterol","Heart Health","Cancer","Obesity","Fever"};
        Collections.addAll(apple_good_for, apple_good_for_array);
                
        // banana
        ArrayList<String> banana_good_for = new ArrayList<String>();
        String[] banana_good_for_array = new String[] {"Normal Blood Pressure","Asthma","Cancer","Digestion System"};
        Collections.addAll(banana_good_for, banana_good_for_array);
                
        // papaya
        ArrayList<String> papaya_good_for = new ArrayList<String>();
        String[] papaya_good_for_array = new String[] {"Asthma","Cancer","Bone","Diabetes","Digestion System"};
        Collections.addAll(papaya_good_for, papaya_good_for_array);        
        
        // orange
        ArrayList<String> orange_good_for = new ArrayList<String>();
        String[] orange_good_for_array = new String[] {"Heart Health", "Diabetes","Skin","Normal Blood Pressure","Cancer","Digestion System"};
        Collections.addAll(orange_good_for, orange_good_for_array);

        // pineapple
        ArrayList<String> pineapple_good_for = new ArrayList<String>();
        String[] pineapple_good_for_array = new String[] {"Asthma","Fever","Normal Blood Pressure","Cancer", "Diabetes","Digestion System","Fertility","Healing","Inflammation","Skin"};
        Collections.addAll(pineapple_good_for, pineapple_good_for_array);

        // grapefruit
        ArrayList<String> grapefruit_good_for = new ArrayList<String>();
        String[] grapefruit_good_for_array = new String[] {"Diabetes","weight Loss","Stroke","Digestion System","Skin","Immune System"};
        Collections.addAll(grapefruit_good_for, grapefruit_good_for_array);

        // mango
        ArrayList<String> mango_good_for = new ArrayList<String>();
        String[] mango_good_for_array = new String[] {"Cancer","Diabetes","Heart Health","Skin", "Hairs","Immune System","Digestion System"};
        Collections.addAll(mango_good_for, mango_good_for_array);

        // watermelon
        ArrayList<String> watermelon_good_for = new ArrayList<String>();
        String[] watermelon_good_for_array = new String[] {"Cancer","Rehydration", "Inflammation", "Immune System","Asthma","Normal Blood Pressure"};
        Collections.addAll(watermelon_good_for, watermelon_good_for_array);

        // guava
        ArrayList<String> guava_good_for = new ArrayList<String>();
        String[] guava_good_for_array = new String[] {"Diarrhea","Flu","Normal Blood Pressure","Cancer"};
        Collections.addAll(guava_good_for, guava_good_for_array);


        // making arraylists of all fruit that is bad in disease
        // strawberry
        ArrayList<String> strawberry_bad_for = new ArrayList<String>();
        String[] strawberry_bad_for_array = new String[] {"Fever","Diabetes"};
        Collections.addAll(strawberry_bad_for, strawberry_bad_for_array);
                
        // apple
        ArrayList<String> apple_bad_for = new ArrayList<String>();
        String[] apple_bad_for_array = new String[] {"High Calories","Loose Stools","Stomachache","Pesticides","Allergies"};
        Collections.addAll(apple_bad_for, apple_bad_for_array);
                
        // banana
        ArrayList<String> banana_bad_for = new ArrayList<String>();
        String[] banana_bad_for_array = new String[] {"Headache","Toothdecay","Constipation"};
        Collections.addAll(banana_bad_for, banana_bad_for_array);
                
        // papaya
        ArrayList<String> papaya_bad_for = new ArrayList<String>();
        String[] papaya_bad_for_array = new String[] {"Allergy","Kidney Stone","Respiratory Disorders"};
        Collections.addAll(papaya_bad_for, papaya_bad_for_array);        
        
        // orange
        ArrayList<String> orange_bad_for = new ArrayList<String>();
        String[] orange_bad_for_array = new String[] {"Diabetes"};
        Collections.addAll(orange_bad_for, orange_bad_for_array);

        // pineapple
        ArrayList<String> pineapple_bad_for = new ArrayList<String>();
        String[] pineapple_bad_for_array = new String[] {"Allergies"};
        Collections.addAll(pineapple_bad_for, pineapple_bad_for_array);

        // grapefruit
        ArrayList<String> grapefruit_bad_for = new ArrayList<String>();
        String[] grapefruit_bad_for_array = new String[] {"High Blood Pressure"};
        Collections.addAll(grapefruit_bad_for, grapefruit_bad_for_array);

        // mango
        ArrayList<String> mango_bad_for = new ArrayList<String>();
        String[] mango_bad_for_array = new String[] {"Diabetes","Diarrhea","Sore Throat"};
        Collections.addAll(mango_bad_for, mango_bad_for_array);

        // watermelon
        ArrayList<String> watermelon_bad_for = new ArrayList<String>();
        String[] watermelon_bad_for_array = new String[] {"Cardio Ascular","Diarrhea","Glucose Level","Allergy"};
        Collections.addAll(watermelon_bad_for, watermelon_bad_for_array);

        // guava
        ArrayList<String> guava_bad_for = new ArrayList<String>();
        String[] guava_bad_for_array = new String[] {"Digestion","Diabetes","Skin Irritation"};
        Collections.addAll(guava_bad_for, guava_bad_for_array);
        
        
        // ArrayList of diseases
        ArrayList<String> diseases = new ArrayList<String>();
        // add diseases to disease arraylist
        diseases.add("Fever");
        diseases.add("Diabetes");
        
        for(String disease : diseases){
        // good for 
        if(apple_good_for.contains(disease)){
            good.add("apple");
        }
        if(strawberry_good_for.contains(disease)){
            good.add("strawberry");
        }
        if(banana_good_for.contains(disease)){
            good.add("banana");
        }
        if(papaya_good_for.contains(disease)){
            good.add("papaya");
        }
        if(orange_good_for.contains(disease)){
            good.add("orange");
        }
        if(pineapple_good_for.contains(disease)){
            good.add("pineapple");
        }
        if(grapefruit_good_for.contains(disease)){
            good.add("grapefruit");
        }       
        if(mango_good_for.contains(disease)){
            good.add("mango");
        }
        if(watermelon_good_for.contains(disease)){
            good.add("watermelon");
        }
        if(guava_good_for.contains(disease)){
            good.add("guava");
        }

        // bad for
        if(apple_bad_for.contains(disease)){
            bad.add("apple");
        }
        if(strawberry_bad_for.contains(disease)){
            bad.add("strawberry");
        }
        if(banana_bad_for.contains(disease)){
            bad.add("banana");
        }
        if(papaya_bad_for.contains(disease)){
            bad.add("papaya");
        }
        if(orange_bad_for.contains(disease)){
            bad.add("orange");
        }
        if(pineapple_bad_for.contains(disease)){
            bad.add("pineapple");
        }
        if(grapefruit_bad_for.contains(disease)){
            bad.add("grapefruit");
        }       
        if(mango_bad_for.contains(disease)){
            bad.add("mango");
        }
        if(watermelon_bad_for.contains(disease)){
            bad.add("watermelon");
        }
        if(guava_bad_for.contains(disease)){
            bad.add("guava");
        }
        }
        
        
        
        System.out.println("Good for fever: " + good);
        System.out.println("Bad for fever: " + bad);
    }
}
import csv
import json

fn = []
fd = []
n = []
good_for = []
bad_for = []


with open('FruitNutritionsDetails.csv', 'r') as csv_file:
    try:
        csv_reader = csv.reader(csv_file)
        next(csv_reader, None) #skip first header line
        
        for row in csv_reader:
            fn.append(row[1])
            fd.append(row[2])
            n.append(row[3])
            good_for.append(row[4])
            bad_for.append(row[5])
        
        #making dictionary of csv file
        fruits = {}
        i = 0
        for fruit_name in fn:
            fruits[fruit_name] = {
                "description" : fd[i],
                "nutrition" : n[i].split(","),
                "good_for" : good_for[i].split(","),
                "bad_for" : bad_for[i].split(",")
            }
            i = i + 1
        
        
        #check which fruit is good for particular fruit and which is not
        def check_good_bad(desise):
            print("Good for " + desise)
            for fruit_name in fruits:
                if desise in fruits[fruit_name]["good_for"]:
                    print(fruit_name)
    
            print("\nBad for " + desise)
            for fruit_name in fruits:
                if desise in fruits[fruit_name]["bad_for"]:
                    print(fruit_name)
        
        #give details of particular fruit
        def give_details(fruit_name):
            print("Fruit Name: " + fruit_name)
            print("Description: " + fruits[fruit_name]["description"])
    
            print("Nutritions:")
            for nutrition in fruits[fruit_name]["nutrition"]:
                print("- " + nutrition)
    
            print("Good For: ")
            for good_for in fruits[fruit_name]["good_for"]:
                print("- " + good_for)
    
            print("Bad For: ")
            for bad_for in fruits[fruit_name]["bad_for"]:
                print("- " + bad_for)
 
 
 
        #program starts
        json_object = json.dumps(fruits, indent = 4) 
        print(json_object)
        # print("1. Check Nutrition Details")
        # print("2. Check fruit is good or not for particular desise")
        # option = input("Enter number >> ")

        # if int(option) == 1:
        #     print("Check for Fruits Neutritions")
        #     i = 1
        #     for fruit_name in fruits:
        #         print(str(i) + ". " + fruit_name)
        #         i += 1


        #     fruit_name = input("Type fruit name >> ")
        #     give_details(fruit_name)

        # elif int(option) == 2:
        #     desise = input("What you are feeling now >> ")
        #     check_good_bad(desise)
    except:
        print("File reading error")
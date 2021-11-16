import pandas
import re


#export csv file
nd = pandas.read_csv(r'G:/Work/algorithm/aplpha.csv') #nd = nutrition details


#convert column into lists
fn = list(nd['Fruit name']) #fn = fruit name
fd = list(nd['Description']) #fd = fruit description
n = list(nd['Nutritions']) # n = Nutritions
good_for = list(nd['Good for'])
bad_for = list(nd['Bad for'])


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


#program starts
print("1. Check Nutrition Details")
print("2. Check fruit is good or not for particular desise")
option = input("Enter number >> ")

if int(option) == 1:
    print("Check for Fruits Neutritions")
    i = 1
    for fruit_name in fruits:
        print(str(i) + ". " + fruit_name)
        i += 1


    fruit_name = input("Type fruit name >> ")
    give_details(fruit_name)

elif int(option) == 2:
    desise = input("What you are feeling now >> ")
    check_good_bad(desise)
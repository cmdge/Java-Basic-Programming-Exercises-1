# Sample Java Programs
This repository contains some sample programs.
For the inputs, We're required to use BufferedReader but you can also use Scanner.

# Exercise 1 - Value of a Quadratic
Say that you are interested in the value of the quadradic... 
3X2 -8X + 4
...for several values of X. Write a program that has a double precision variable X. Assign a value to it. Write statement that computes a value for the quadradic and stores the result in another double precision variable. Finally write out the result, something like: 
At X = 4.0 the value is 20.0
Run the program with several values for X (edit the program for each value of X) and examine the result. Use values with decimal points, large values, small values, negative values, and zero. Solve the equation with paper and pencil (use the quadradic formula.) The quadradic should evaluate to zero at X = 2.0 and at X = 2/3. Try these values for X. 
# Exercise 2 - Re-assigning values to Variables
Modify the program in exercise 2 so that one run of the program will evaluate and write out the value of the quadradic for three different values of X: 0.0, 2.0, and 4.0 (or any three values of your choice.) 
Write the program using only two variables, probably called x and value. Of course this means that you will have to put different things in these variables in different places in the program. 
# Exercise 3 - Average Rainfall
Write a program that averages the rain fall for three months, April, May, and June. Declare and initialize a variable to the rain fall for each month. Compute the average, and write out the results, something like: 
Rainfall for April:  12 Rainfall for May  :  14 Rainfall for June:   8 Average rainfall:    11.333333
To get the numerical values to line up use the tabulation character '\t' as part of the character string in the output statements. Check that your program prints the correct results. 
# Exercise 4 - Trigonometry
To compute the sine of a double precision value use this method: 
Math.sin( value )
The value is in radians (not degrees.) The cosine is computed using 
Math.cos( value )
Again, value is in radians. Write a program that: 
1. Computes the sine of 0.5236 radians and saves it in a variable. 2. Computes the cosine of 0.5236 radians and saves it in another variable. 3. Computes the square of each those two values (use the variables), adds the two squares, and saves the result (in a third variable.) 4. Writes out the three variables. 
The output statement should be something like: 
System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum );
Try a few other values besides 0.5236. 
# Exercise 5 - Degrees to Radians
It is sometimes hard to think in terms of radians; we would rather use degrees. Remember (from those dark days of trigonometry class) that there are PI radians per 180 degrees. So to convert an angle given in degrees to radians do this: 
rad = degrees * Math.PI/180
Math.PI gives you an accurate value of PI. 
Edit the previous program so that it does the same things, but the angle is 30 degrees (which you will convert into radians.) 
# Exercise 6 - Area of a Circle
Write a program that calculates the area of a circle from its radius. The radius will be an integer read in from the keyboard. The user dialog will look like this: 
Input the radius: 3 The radius is: 3 The area is: 28.274333882308138
You will need to use the constant PI which you get by using Math.PI 
# Exercise 7 - Cents to Dollars
Write a program that reads in a number of cents. The program will write out the number of dollars and cents, like this: 
Input the cents: 324 That is  3 dollars and 24 cents. (For this program you will use integer arithmetic and will need to avoid floating point arithmetic. Review the integer remainder operator % if you are unsure how to proceed.) 
# Exercise 8 - Correct Change
When cashiers in a store give you change they try first try to "fit" dollars into the amount you get back, then try to "fit" quarters (25 cent coins) into what is left over, they try to "fit" dimes (10 cent coins) into what is now left over, then try to "fit" nickels (5 cent coins) into what is left, and finally are left with a few odd cents. For example, say that your change is 163 cents: 
• One dollar fits into 163, leaving 63 cents. 
• Two quarters fit into 63 cents, leaving 13 cents. 
• One dime fits into 13 cents, leaving 3 cents. 
• No nickels are needed. 
• Three cents are left. 
Your change is : 1 dollar, two quarters, one dime, and three cents. 
Write a program that reads change due to a user (in cents) and writes out how many dollars, quarters, dimes, nickels, and pennies she is due. All variables and all math in this program will be integers.
# Exercise 9 - Ohm's Law
Ohm's law relates the resistance of a electrical device (like a heater) to the electric current flowing through the device and the voltage applied to it. The law is: 
I = V/R
Here, V is the voltage (measured in volts), I is the current (measured in amps), and R is the resistance (measured in ohms.) Write a program that asks the user for the voltage and the resistance of a device. The program will then write out the current flowing through it. Use floating point math. 
Since V and R are integers (converted from user input) you must use a trick to do floating point division. Change the equation to this: 
I = (V + 0.0)/R
The math inside parentheses is done first. So V + 0.0 is done first, and since 0.0 is floating point, so will be the result. 
# Exercise 10
Write a program that calculates the annual cost of running an appliance. The program will ask the user for the cost per kilowatt-hour and the number of kilowatthours the appliance uses in a year: 
Enter cost per kilowatt-hour in cents 8.42 Enter kilowatt-hours used per year 653 Annual cost: 54.9826
# Exercise 11
Consider a brick that is dropped from a tower. The distance the brick falls depends on the the time since it was released. 
d = (1/2) g t2
Here d is the distance in feet, t is the time in seconds, and g is 32.174. Write a program that asks the user for the number of seconds and then prints out the distance. 
Enter the number of seconds 5.4 Distance: 469.092 feet
# Exercise 12
The base 2 logarithm of a number is defined by: 
log2 X = n  if 2n = X
For example 
log2 32 = 5,  because  25 = 32  log2 1024 = 10,  because 210 = 1024 
Write a program that inputs a number and outputs its base 2 logarithm. Use floating point input. This problem would be easy, but the Math package does not have a base 2 logarithm method. Instead you have to do this: 
log2 X = (loge X) / (loge 2)
Here, loge X is the natural logarithm of X. Use this function in the Java Math package: 
Math.log( X )
When you use this, X must be a double. Write the program so that the user can enter floating point numbers. 
Enter a double: 998.65 Base 2 log of 998.65 is 9.963835330516641
# Exercise 13
The harmonic mean of two numbers is given by: 
H = 2 / ( 1/X + 1/Y )
This is sometimes more useful than the more usual average of two numbers. Write a program that inputs two numbers (as floating point) and writes out both the usual average (the arithmetic mean) and the harmonic mean. 
Enter X: 12 Enter Y: 16 Arithmetic mean: 14.0 Harmonic   mean: 13.714285714285715
# Exercise 14 - Discount Prices
During a special sale at a store, a 10% discount is taken on purchases over $10.00. Write a program that asks for the amount of purchases, then calculates the discounted price. The purchase amount will be input in cents (as an integer): 
Enter amount of purchases: 2000 Discounted price: 1800 Use integer arithmetic throughout the program. 
# Exercise 15 - Order Checker
Bob's Discount Bolts charges the following prices: 
• 5 cents per bolt • 3 cents per nut • 1 cent per washer 
Write a program that asks the user for the number of bolts, nuts, and washers in their purchase and then calculates and prints out the total. As an added feature, the program checks the order. It is usually a mistake if there are more bolts than nuts. In this case the program writes out "Check the Order." Otherwise the program writes out "Order is OK." In either case the total price is written out. Number of bolts: 12 Number of nuts: 8 Number of washers: 24
Check the Order
Total cost: 108 Use constants for the unit cost of each item. In other words, declare something like final int boltPrice = 5; and so on in your program. 
# Exercise 16 - Last Chance Gas
Al's Last Chance Gas station sits on route 190 on the edge of Death Valley. There is no other gas station for 200 miles. You are to write a program to help drivers decide if they need gas. The program asks for: 
• The capacity of the gas tank, in gallons • The indication of the gas gauge in percent (full= 100, three quarters full = 75, and so on) • The miles per gallon of the car. 
The program then writes out "Get Gas" or "Safe to Proceed" depending on if the car can cross the 200 miles with the gas remaining in the tank. Tank capacity: 12 Gage reading: 50 Miles per gallon: 30 Get Gas! Use integers for all input and all arithmetic.
# Exercise 17 - Pie Eating Contest
At the State Fair Pie Eating Contest all contestants in the heavyweight division must weigh within 30 pounds of 250 pounds. Write a program that asks for a contestant's weight and then says if the contestant is allowed in the contest. 
# Exercise 18 - Ground Beef Value Calculator
Different packages of ground beef have different percentages of fat and different costs per pound. Write a program that asks the user for: 
1. The price per pound of package "A" 2. The percent lean in package "A" 3. The price per pound of package "B" 4. The percent lean in package "B" 
The program then calculates the cost per pound of lean (non-fat) beef for each package and writes out which is the best value. 
Price per pound package A: 2.89 Percent lean package A: 85 Price per pound package B: 3.49 Percent lean package B: 93
Package A cost per pound of lean:3.4 Package B cost per pound of lean:3.752688 Package A is the best value Assume that the two packages will not come out equal in value. 
# Exercise 19 - Y2K Problem Detector
Write a program that asks a user for their birth year encoded as two digits (like "62") and for the current year, also encoded as two digits (like "99"). The program is to correctly write out the users age in years. 
Year of Birth: 62 Current year: 99 Your age: 37
----- another run of the program -------
Year of Birth:
62 Current year: 00 Your age: 38
# Exercise 20 - Internet Delicatessen
Sam and Ella's Delicatessen wants you to write a program to take orders from the Internet. Your program asks for the item, its price, and if overnight shipping is wanted. Regular shipping for items under $10 is $2.00; for items $10 or more shipping is $3.00. For overnight delivery add $5.00. 
Enter the item: Tuna Salad Enter the price: 450 Overnight delivery (0==no, 1==yes) 1
Invoice:  Tuna Salad    4.50  shipping      7.00  total         11.50
(Use our ordinary IO methods. A real Internet order form would use different I/O methods, but ignore this.)
# Exercise 21 - Steam Engine Efficiency
The maximum possible efficiency of a steam engine depends on the temperature of the steam in the boiler and the temperature of the outside air: 
efficiency = 1 - Tair / Tsteam
where Tair is the air temperature and Tsteam is the steam temperature. The temperatures are give in degrees above absolute zero. Normal air temperature is about 300oK. Boiling is 373oK. Write a program that asks the user for the air temperature and the steam temperature and writes out the maximum possible efficiency of a steam engine. However, if the steam temperature is less than 373oK there is no steam, so the efficiency is zero. 
Use integer or floating point input, but do the calculations in floating point. 
# Exercise 22 - Microwave Oven
A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time, and when heating three items double the heating time. Heating more than three items at once is not recommended. 
Write a program that asks the user for the number of items and the single-item heating time. The program then writes out the recommended heating time. 
Hint: do this with four successive single-branch if statements each of which tests for one of the four cases: 1 item, 2 items, 3 items, more than three items. 
# Exercise 23 - Fantasy Game
In a new role-playing fantasy game players must design their character by picking a point value for each of three characteristics: 
• Strength, from 1 to 10 • Health, from 1 to 10 • Luck, from 1 to 10 
Write a program that asks for a name for the character and asks for the point value of for each of the three characteristics. However, the total points must be less than 15. If the total exceeds 15, then 5 points are assigned to each characteristic 
Welcome to Yertle's Quest Enter the name of your character: Chortle Enter strength (1-10): 8 Enter health (1-10): 4 Enter luck (1-10): 6
You have give your character too many points!  Default values have been assigned: Chortle, strength: 5, health: 5, luck: 5
# Exercise 24 - Check Charge
A bank has the following rule: if a customer has more than $1000 dollars in their checking account or more than $1500 dollars in their savings account, then there is no service charge for writing checks. Otherwise there is a $0.15 charge per check. Write a program that asks for the balance in each account and then writes out the service charge. 
# Exercise 25 - Tire Pressure
The front tires of a car should both have the same pressure. Also, the rear tires of a car should both have the same pressure (but not neccessarily the same pressure as 
the front tires.) Write a program that reads in the pressure of the four tires and writes a message that says if the inflation is OK or not. 
Input right front pressure 38 Input left front pressure 38 Input right rear pressure 42 Input left rear pressure 42
Inflation is OK
# Exercise 26 - More Tire Pressure
Its not enough that the pressures are the same in the tires, but the pressures must also be within range. Modify the program in exercise 1 so that it also checks that each tire has a pressure between 35 and 45. If a tire is out of range, write out an error message immediately, but continue inputting values and processing them: 
Input right front pressure 32 Warning: pressure is out of range
Input left front pressure 32 Warning: pressure is out of range
Input right rear pressure 42 Input left rear pressure 42
Inflation is BAD
If there have been any warnings, write out a final error message. (To do this, declare a boolean variable goodPressure that is initialized to true but is changed to false when an out of range tire is first found.) 
# Exercise 27 - The Pressure is Building
Tires don't have to have exactly the same pressure. Modify the program for exercise 2 so that the front tires can be within 3 psi of each other, and the rear tires can be within 3 psi of each other. 
Input right front pressure 35 
Input left front pressure 37
Input right rear pressure 41 
Input left rear pressure 44
Inflation is OK
# Exercise 28
Write a program that asks the user for a starting value and an ending value and then writes all the integers (inclusive) between those two values. 
Enter Start: 5 Enter End: 9
5 
6 
7
8 
9
# Exercise 29 
Write a program that asks the user to enter a word. The program will then repeat word for as many times as it has characters: 
Enter a word: Hello
Hello
Hello
Hello
Hello
Hello
To do this you will need to use the length() method that counts the number of characters in a string: 
String inputString; int times;
 . . . .
times = inputString.length()
# Exercise 30
Write a program that asks the user to enter two words. The program then prints out both words on one line. The words will be separated by enough dots so that the total line length is 30: 
Enter first word: turtle Enter second word 153
turtle....................153
This could be used as part of an index for a book. To print out the dots, use System.out.print(".") inside a loop body. 
# Exercise 31 - Adding up Integers
Write a program that adds up integers that the user enters. First the programs asks how many numbers will be added up. Then the program prompts the user for each number. Finally it prints the sum. 
How many integers will be added: 5 
Enter an integer: 3 
Enter an integer: 4 
Enter an integer: -4
Enter an integer: -3
Enter an integer: 7
The sum is 7 
Be careful not to add the number of integers (in the example, 5) into the sum
# Exercise 32
Write a program that computes the following sum: 
sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N N will be an integer limit that the user enters. Enter N 4
Sum is: 2.08333333333
# Exercise 33
Write a program that computes the standard deviation of a set of floating point numbers that the user enters. First the user will say how many numbers N are to follow. Then the program will ask for and read in each floating point number. Finally it will write out the standard deviation. The standard deviation of a set of numbers Xi is: 
SD = Math.sqrt( avgSquare - avg2 ) Here, avg is the average of the N numbers, and avg2 is its square. 
avgSquare is the average of Xi * Xi. In other words, this is the average of the squared value of each floating point number. 
For example, if N = 4, say the numbers were: 
Xi    Xi * Xi     
2.0    4.0    
3.0    9.0     
1.0    1.0     
2.0     4.0     
----- -----  
sum  8.0 18.0 
then avg = 8.0/4 = 2.0 avg2 = 4.0
avgSquare = 18.0/4 = 4.5
SD = Math.sqrt( 4.5 - 4.0 ) = Math.sqrt( .5 ) = 0.7071067812 To do this you will need to do several things inside the loop body for each floating point value as it comes in: add it to a sum, square it and add it to a sum of squares. Then after the loop is finished apply the formula.
# Exercise 34 - Adding up Squares and Cubes
Write a program that adds up the squares and adds up the cubes of integers from 1 to N, where N is entered by the user: 
Upper Limit: 5 The sum of Squares is  55 The sum of Cubes   is  225
Do this by using just one loop that generates the integers. Of course, if you really needed to calculate these sums you would use the appropriate formulas: 
12 + 22 + 32 + ... + n2 = n(n+1)(2n+1)/6 13 + 23 + 33 + ... + n3 = n2(n+1)2/4
Add these formulas to your program and print out their results as well as that of the explicit summations. 
# Exercise 35 - Power of a number
Write a program that computes XN where X is a floating point number and N is a positive integer. The program informs the user that N must be positive if the user enters a negative value. Of course, 
XN = (X * X * X * ... * X)/ N times
The user dialog will look something like this: 
Enter X 1.3 Enter N 5
1.3 raised to the power 5 is:  3.71293
Enter X 5.6 Enter N -3
N must be a positive integer.
# Exercise 36 - Wedge of Stars
Write a program that writes a wedge of stars. The user enters the initial number of stars, and the program writes out lines of stars. Each line has one few star than the previous line: 
Initial number of stars: 7
*******
******
*****
****
***
**
*
# Exercise 37
Write a program that writes a tree made of stars on the terminal: 
       *      
      ***   
     *****   
    *******    
   *********  
  ***********
 ************* 
***************     
      ***      
      ***     
      ***

# Exercise 38 - Miles per Gallon
Write a program that calculates miles per gallon for a list of cars. The data for each car consists of initial odometer reading, final odometer reading, and number of gallons of gas. The user signals that there are no more cars by entering a negative initial odometer reading. 
Miles Per Gallon Program Initial miles: 15000 Final miles: 15250 Gallons 10 Miles per Gallon: 25.0
Initial miles: 107000 
Final miles: 107450 
Gallons 15 
Miles per Gallon: 30.0
Initial miles: -1 
bye

# Exercise 39 - In-range Adder
Write a program that asks the user for the low and high integer in a range of integers. The program then asks the user for integers to be added up. The program computes two sums: 
• The sum of integers that are in the range (inclusive), • and the sum of integers that are outside of the range. 
The user signals the end of input with a 0. 
In-range Adder Low end of range: 20 
High end of range: 50 
Enter data: 21
Enter data: 60 
Enter data: 49 
Enter data: 30 
Enter data: 91 
Enter data: 0 
Sum of in range values: 100 
Sum of out of range values: 151

# Exercise 40 - Shipping Cost Calculator
A mail order company charges $3.00 for handling, free shipping for orders 10 pounds or less, plus $0.25 for each pound over 10. Write a program that repeatedly asks the user for the weight of an order, then writes out the shipping charge. The program stops when a weight of zero or less is entered. 
Weight of Order: 5 
Shipping Cost: $3.00
Weight of Order 20 
Shipping Cost: $5.50
Weight of Order 0
bye

# Exercise 41
A computer aided design program expects users to enter the coordinates two corners for each of several of rectangles (see diagram.) The sides of the rectangles are assumed to be parallel to the X and Y axes. The coordinates of each corner is entered as a pair of integers, first the X coordinate and then the Y coordinate. The origin of the coordinate system (0,0) is in the upper left, so Y increases going downward, and X increases to the right. 
For each rectangle, the program calculates and writes out the height, the width, and the area of the rectangle. The two corners entered for each rectangle must be diagonally opposite (upper left and lower right, or upper right and lower left), but which choice is made for each rectangle is up to the user. The user can enter the corners in any order. Height and width are always positive (the program will have to adjust its calculations so that this is true.) 
The program ends gracefully when the user enters corners which cannot be those of a rectangle (either the height is zero, the width is zero, or both.) 
Computer Aided Design Program 
First corner X coordinate: 100 
First corner Y coordinate: 100 
Second corner X coordinate: 250 
Second corner Y coordinate 200
Width:  150  
Height: 100   
Area: 15000
First corner X coordinate: 250 
First corner Y coordinate: 200 
Second corner X coordinate: 100 
Second corner Y coordinate 100 
Width:  150  
Height: 100   
Area: 15000
# Exercise 42 - Credit Card Bill
Say that you owe the credit card company $1000.00. The company charges you 1.5% per month on the unpaid balance. You have decided to stop using the card and to pay off the debt by making a monthly payment of N dollars a month. Write a program that asks for the monthy payment, then writes out the balance and total payments so far for every succeeding month until the balance is zero or less.

Enter the monthly payment: 100 Month: 1        balance: 915.0  total payments: 100.0 
Month: 2        balance: 828.725        total payments: 200.0 Month: 3        balance: 741.155875     total payments: 300.0 
Month: 4        balance: 652.273213125  total payments: 400.0 
Month: 5        balance: 562.057311321875       total payments: 500.0 
Month: 6        balance: 470.4881709917031      total payments: 600.0 
Month: 7        balance: 377.54549355657866     total payments: 700.0 
Month: 8        balance: 283.20867595992735     total payments: 800.0 
Month: 9        balance: 187.4568060993263      total payments: 900.0 
Month: 10       balance: 90.26865819081618      total payments: 1000.0 
Month: 11       balance: -8.377311936321576     total payments: 1100.0
For each month, calculate the interest due on the unpaid balance. Then calculate the new balance by adding the interest and subtracting the payment. 
Improved Program:     Have the program prompt for the beginning balance, the monthly interest, and the payment amount. Also, when the balance falls below the amount of the monthly payment, write out the final payment that will bring the balance to exactly zero
# Exercise 43 - Drug Potency
A certain drug looses 4% of its effectivness every month it is in storage. When its effectiveness is below 50% it is considered expired and must be discarded. Write a program that determines how many months the drug can remain in storage. 
month: 0        effectiveness: 100.0 
month: 1        effectiveness: 96.0 
month: 2        effectiveness: 92.16 
month: 3        effectiveness: 88.47359999999999 
month: 4        effectiveness: 84.93465599999999 
month: 5        effectiveness: 81.53726975999999 
month: 6        effectiveness: 78.27577896959998 
month: 7        effectiveness: 75.14474781081599 
month: 8        effectiveness: 72.13895789838334 
month: 9        effectiveness: 69.253399582448 
month: 10       effectiveness: 66.48326359915008 
month: 11       effectiveness: 63.82393305518407 
month: 12       effectiveness: 61.27097573297671 
month: 13       effectiveness: 58.82013670365764 
month: 14       effectiveness: 56.46733123551133 
month: 15       effectiveness: 54.20863798609088
month: 16       effectiveness: 52.04029246664724 
month: 17       effectiveness: 49.95868076798135 DISCARDED

# Exercise 44
One of the more amazing facts from calculus is that the following sum gets closer and closer to the value ex the more terms you add in: 
ex = 1 + x + x2/2! + x3/3! + x4/4! + x5/5! + x6/6! + . . . . 
Remember that n! means n factorial, n*(n-1)*(n-2)* ... *1. For example, if x is 2 then 
e2 = 1 + 2 + 22/2! + 23/3! + 24/4! + 25/5! . . . . e2 = 1 + 2 + 4/2 + 8/6 + 16/24 + 32/120 + . . . .
e2 = 1 + 2 + 2 + 1.3333 + 0.6666 + 0.2666 + . . . . 
e2 ~ 7.266
More exactly, e2 = 7.38907... 
Write a program that asks the user to enter x, then calculates ex using a loop to add up successive terms until the current term is less than 1.0E-12. Then write out the value Math.exp(x) to see how your value compares.
To do this program sensibly, the loop will add in a term each iteration. 
sum = sum + term; 
Look carefully at the first equation for ex. Notice that each term is: 
x N/N! 
for some N. This is the same as: 
x(N-1)/(N-1)!   *   x/N 
This is the same as the previous term times x/N. So each iteration of the loop merely has to multiply the previous term by x/N and add it to the accumulating sum. 
Don't let the math scare you away! This is actually a fairly easy program, and is typical of a type of calculation that computers are often used for. 
Enter x: 2 
n:1     term: 2.0               sum: 3.0 
n:2     term: 2.0               sum: 5.0 
n:3     term: 1.3333333333333333                sum: 6.333333333333333 
n:4     term: 0.6666666666666666                sum: 7.0 
n:5     term: 0.26666666666666666               sum: 7.266666666666667
n:6     term: 0.08888888888888889               sum: 7.355555555555555 
n:7     term: 0.025396825396825397              sum: 7.3809523809523805 
n:8     term: 0.006349206349206349              sum: 7.387301587301587 
n:9     term: 0.0014109347442680777             sum: 7.3887125220458545 
n:10    term: 2.8218694885361555E-4             sum: 7.388994708994708 
n:11    term: 5.130671797338464E-5              sum: 7.389046015712681 
n:12    term: 8.551119662230774E-6              sum: 7.3890545668323435 
n:13    term: 1.3155568711124268E-6             sum: 7.389055882389215 
n:14    term: 1.8793669587320383E-7             sum: 7.3890560703259105 
n:15    term: 2.5058226116427178E-8             sum: 7.389056095384136 
n:16    term: 3.1322782645533972E-9             sum: 7.389056098516415 
n:17    term: 3.6850332524157613E-10            sum: 7.389056098884918 
n:18    term: 4.094481391573068E-11             sum: 7.389056098925863 
n:19    term: 4.309980412182177E-12             sum: 7.3890560989301735 
n:20    term: 4.309980412182177E-13             sum: 7.389056098930604 my   e^x: 7.389056098930604 real e^x: 7.38905609893065

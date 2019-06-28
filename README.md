# Sample Java Programs
This repository contains some sample programs.
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

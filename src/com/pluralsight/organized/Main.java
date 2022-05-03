package com.pluralsight.organized;

public class Main {

    public static void main(String[] args) {
        System.out.println("we got organized");
        int valA=21;
        int valB=9;
        int valC=3;
        int valD=1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;
        System.out.println("Result1 =" +result1);
        System.out.println("Result2 ="+result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * valD + valB);

        System.out.println("Result3 ="+result3);
        System.out.println("Result4 ="+result4);
	// write your code here
    }
}

/* Variables
Named area storage
Strongly Typed

Variable Naming
use only letters and number

Style Names Using Camel Case
start each word after the first with Upper case
All other letters are lower case
eg: sum
    studentCount

Variable can be Declared Final
use final modifier
value cannot be changed once set
helps avoid error caused by inadvertent variable changes

Primitive Data Types
Integer
Floating point
Character
Boolean

Integer Type
byte    8bits   -128        127         0
short   16bits  -32768      32767       0
int     32bits  -2147483648 2147483647  0
long    64bits  -92xxx      922xxxx     0L

Floating Point Types
float   32bits  0.0f
double  64bits  0.0or 0.0d

character data Type
Stores a single Unicode character
Literal values placed between single qoutes
for unicode points, use followed by 4-digit hex value

Boolean Type
Stores true/false values
Literal values are true and false
 */
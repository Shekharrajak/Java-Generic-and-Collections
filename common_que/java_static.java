/*(

Static import is a feature introduced in the Java programming language 
that allows members (fields and methods) defined in a class as public static 
to be used in Java code; without specifying the class in which the field is
 defined. This feature was introduced into the language in version 5.0.

 Static import is introduced in Java 5 along with other features like 
 Generics, Enum, Autoboxing and Unboxing and variable argument methods.


 Adv: 

 1. reduce code size and static import in Java is saving keystrokes
If you are frequently using System.out.println() statements and
 tried of typing it, you can static import System.out or System.* 
 and subsequently you can type out.println() 



 2. allow you to freely use static field of external class without prefixing class name on that.

diadv : 

One more disadvantage is naming conflicts.

*/

import static java.lang.Math.PI;
import static java.lang.Math.pow;

import static java.lang.System.out;

import static java.lang.Integer.*;
import static java.lang.Long.*;

public class java_static {
    public static void main(String[] args) {

    	//  can be used to reference individual members of a class:
        System.out.println("Hello World!");
        System.out.println("Considering a circle with a diameter of 5 cm, it has");
        System.out.println("a circumference of " + (Math.PI * 5) + " cm");
        System.out.println("and an area of " + (Math.PI * Math.pow(2.5, 2)) + " sq. cm");

// Can instead be written as:
        out.println("***Hello World!");
        out.println("Considering a circle with a diameter of 5 cm, it has");
        out.println("a circumference of " + (PI * 5) + " cm");
        out.println("and an area of " + (PI * pow(2.5, 2)) + " sq. cm");


/*

In this case, MAX_VALUE is ambiguous, as the MAX_VALUE field is an attribute of both
 java.lang.Integer and java.lang.Long. Prefixing the field with its class name will 
 disambiguate the class from which MAX_VALUE is derived, but doing so makes the use 
 of a static import redundant.[2]
*/
        // System.out.println(MAX_VALUE);
    }
}


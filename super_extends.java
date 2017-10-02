
public class super_extends {
	
	//  extends wildcards

	public static double sum(Collection<Number> numbers) {
		double result = 0.0;

		for (Number num : numbers) result += num.doubleValue();

		return result;
	/*

List<Integer> integers = Arrays.asList(2, 4, 6);
double sum = sum(integers);

error : 

sum(java.util.Collection<java.lang.Number>) in GenericsWildcards
cannot be applied to (java.util.List<java.lang.Integer>)
	*/
	
	}


//In this case, the extends wildcard is the answer. This wildcard has the notion of <? extends E>. 

	private static double sum(Collection<? extends Number> numbers) {
	    double result = 0.0;
	 
	    for (Number num : numbers) result += num.doubleValue();
	 
	    return result;
	/*

List<Integer> integers = Arrays.asList(2, 4, 6);
double sum = sum(integers);
System.out.println("Sum of integers = " + sum);
 
 
List<Double> doubles = Arrays.asList(3.14, 1.68, 2.94);
sum = sum(doubles);
System.out.println("Sum of doubles = " + sum);
 
List<Number> numbers = Arrays.<Number>asList(2, 4, 6, 3.14, 1.68, 2.94);
sum = sum(numbers);
System.out.println("Sum of numbers = " + sum);
	*/

	}
	
/*
Rule : 

However, an important rule you need to keep in mind about the extends wildcard 
is that you cannot add elements to the collection declared with the extends wildcard.
 For instance, if we attempt to add an element like this:

 ```
List<? extends Number> numbers = new ArrayList<Integer>();
numbers.add(123);   // COMPILE ERROR

 ```

The compiler will throw an error! Otherwise, we could add a double 
number to a collection which is designed to accept only integer numbers. You got this rule?

 List<?> is the abbreviation for List<? extends Object>. They are absolutely identical.


You cannot add anything into a type declared with an extends wildcard, 
except null - which belongs to every reference type:


 ```
List<? extends Number> numbers = new ArrayList<Integer>();
numbers.add(null);  // OK
numbers.add(357);   // Compile error
 ```
*/


// The super wildcard

	public static void append(Collection<Integer> integers, int n) {
	    for (int i = 1; i <= n; i++) {
	        integers.add(i);
	    }
	}


/*

And we have a list of numbers, in which we want to add some integers to::

List<Number> numbers = new ArrayList<Number>();

How can we pass this collection of Numbers to the append() method above?
As the append() method accepts a Collection<Integer>,
 it’s illegal to pass a List<Number>. The extends wildcard cannot be used like this:


Solution : 



As the append() method accepts a Collection<Integer>, 
it’s illegal to pass a List<Number>. The extends wildcard cannot be used like this:

```
public static void append(Collection<? extends Integer> integers, int n)


```

because Number is supertype of Integer.

In this case, the super wildcard is the solution.

*/



	public static void append(Collection<? super Integer> integers, int n) {
	    for (int i = 1; i <= n; i++) {
	        integers.add(i);
	    }

/*
	List<Number> numbers = new ArrayList<Number>();
	append(numbers, 5);
	numbers.add(6.789);
	 
	System.out.println(numbers);



With the super wildcard, we can also pass a list of Objects like this:

List<Object> objects = new ArrayList<Object>();
 
append(objects, 3);
 
objects.add("Four");
 
System.out.println(objects);

*/
	}


/*


Here are other noteworthy points with regard to a type declared with a wildcard <? super T>:
- It can accept any type that is super type of T.
- We can add elements to the collection. However the type is restricted to only T.
- It cannot be passed to a method having a parameter declared with the extends wildcard. 
The following code snippet illustrates this point:


```

public static double sum(Collection<? extends Number> numbers) {
    double result = 0.0;
 
    for (Number num : numbers) result += num.doubleValue();
 
    return result;
}
 
List<? super Integer> integers = new ArrayList<Integer>();
 
sum(integers);  // COMPILE ERROR!


// Why does the compiler prevent this? Consider the following code:

List<Object> objects = new ArrayList<Object>();
objects.add("Hello");
integers = objects; // OK
sum(integers);      // Compile error



```
*/

	public static void main(String[] args){
		
	}	
}

public class GenericMethod {
	
	/*

String[] helloWorld = {"h", "e", "l", "l", "o", "w", "o", "r", "l", "d"};
int count = count(helloWorld, "l");
System.out.println("#occurrences of l: " + count);

	*/
	public static int count(String[] array, String item) {
	    int count = 0;
	 
	    if (item == null) {
	        for (String s : array) {
	            if (s == null) count++;
	        }
	    } else {
	        for (String s : array) {
	            if (item.equals(s)) {
	                count++;
	            }
	        }
	    }
	 
	    return count;
	 
	}

// generic form : 

	/*

Integer[] integers = {1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0};
int count = count(integers, 0);
System.out.println("#occurrences of zeros: " + count);

	*/

	public static <T> int count(T[] array, T item) {
	    int count = 0;
	 
	    if (item == null) {
	        for (T element : array) {
	            if (element == null) count++;
	        }
	    } else {
	        for (T element : array) {
	            if (item.equals(element)) {
	                count++;
	            }
	        }
	    }
	 
	    return count;
	 
	}

/*

Here are some noteworthy points with regard to writing generic methods in Java:

- The <T> is always placed before the return type of the method. It indicates that the 
T identifier is a type parameter, to distinguish it with concrete types.

- Of course we can use any name for the type parameter. However, T is a convention in
 Java and we should follow.

- Note that if the type parameter of a non-static generic method is same as the enclosing 
class, the indicator <T> is not required. The following class illustrates this point:


```
public class Util<T> {
 
    public int count(T[] array, T item) {
        // code...
    }
}
```

The following code shows you the differences between the type parameters in the 
class and in the method:

```
public class Util<E> {
 
    public static <T> int count(T[] array, T item) {
        // code...
    }
}
```
*/


// Using bounded type parameters in generic methods:


	public static <T> int count(Collection<T> col, T item) {
	int count = 0;

	if (item == null) {
	    for (T element : col) {
	        if (element == null) count++;
	    }
	} else {
	    for (T element : col) {
	        if (item.equals(element)) {
	            count++;
	        }
	    }
	}

	return count;

	}
	
/*

 The following code shows how to use the bounded type parameter
 <T extends X> to update the method to accept only collection of sub types of Number:


```

public static <T extends Number> int count(Collection<T> col, T item) {
    // code...
}

```

Here, Number is upper bound of the type parameter T. 
Remember the upper bound can be a class or an interface or both 
(the extends keyword is also used for interface here).



Ex: 

List<Integer> integers = Arrays.asList(0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1);
int count = count(integers, 1);
System.out.println("#occurrences of 1s: " + count);


*/

// bound it : 

/*

The following code shows the count() method now accepts only types that are sub types 
of JComponent (class) and Runnable (interface):


```
public <T extends JComponent & Runnable> int count(Collection<T> col, T item) {

}

```


For 2 types : 


```

public static <T, U> void paring(T first, U second) {
    Map<T, U> map = new HashMap<T, U>();
    map.put(first, second);
}

```
*/


// * Using type wildcards in generic methods:

// The count() method above can be rewritten using wildcards instead of bounded types like this:


	public static int count(Collection<? extends Number> col, Number item) {
	    int count = 0;
	     
	    if (item == null) {
	        for (Number element : col) {
	            if (element == null) count++;
	        }
	    } else {
	        for (Number element : col) {
	            if (item.equals(element)) {
	                count++;
	            }
	        }
	    }
	 
	    return count;
	 
	}



/*

*/
	public static void main(String[] args){
		
	}	
}
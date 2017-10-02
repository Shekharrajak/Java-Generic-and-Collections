
public class GenericMulti {
	
	public class Pair<T, U> {
	    T first;
	    U second;
	 
	    public Pair(T first, U second) {
	        this.first = first;
	        this.second = second;
	    }
	 
	    public T getFirst() {
	        return first;
	    }
	 
	    public U getSecond() {
	        return second;
	    }
	}

	public class Color<R, G, B> {
		R red;
		G green;
		B blue;

		public Color(R red, G green, B blue) {
		    this.red = red;
		    this.green = green;
		    this.blue = blue;
		}
	}
	
	public static void main(String[] args){
		
	}	
}
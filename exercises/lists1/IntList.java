public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size(){
		if (rest == null){
			return 1;
		}
		else {
			return 1 + this.rest.size();
		}
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		return 0;
	}

	/** Returns the ith value in this list.*/
	public int get(int i){
		if (i == 0){
			return first;
		}
		else{
			return this.rest.get(i-1);
		}
	}

	public String toString() {
        if (rest == null)
            return Integer.toString(first);
        return Integer.toString(first) + " " + rest.toString();
    }

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.get(1));
	}
} 
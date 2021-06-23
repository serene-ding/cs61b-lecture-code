public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList Q = new IntList(L.first, L.rest);
        if (Q.rest == null){
            Q.first += x;
            return Q;
        }
        else {
            Q.first += x;
            Q.rest = incrList(Q.rest, x);
            return Q;
        }
    /** The more concise solution 
        if (L == null){
            return null;
        }
        IntList Q = new IntList(L.first+x, null);
        Q.rest = incrList(L.rest, x);
        return Q; */
                
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        IntList Q = L;
        if (Q == null){
            return null;
        } 
        Q.first += 1;
        Q.rest = dincrList(Q.rest, x);
        return Q;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(incrList(L, 3));
        System.out.println(L);
        System.out.println(dincrList(L, 3));
        System.out.println(L);

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));        
    }
}
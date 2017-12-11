import java.util.*;     // BitSet class
public class dsBitSet
{  public static void main(String[] args)
   {  int    N = 5;
      BitSet bset = new BitSet(N);
	for (int i=0 ; i<N ; i++)
         System.out.println(i + " : " + bset.get(i));
      System.out.println();
	bset.set(0); 	// Set 0, 3 bit
    bset.set(3);
	for (int i=0 ; i<N ; i++)
         System.out.println(i + " : " + bset.get(i));
	System.out.println("\n" + bset);
   }
}

import java.util.*;          // Vector Class
public class dsVector
{  public static void main(String[] args)
   {  int   N = 100000;
      int[] a = new int[N];
      Vector vt = new Vector();
      for (int i=0 ; i<N ; i++)
      {  vt.addElement(new Integer(i));
         a[i] = i;
      }
       long mcho = System.currentTimeMillis();
	   for (int i=N-2 ; i!=0 ; i--)
            a[i] = a[i+1];
        a[0] = 999;
		long sigak = System.currentTimeMillis() - mcho;
		System.out.println("Array SoYoSiGan(milli Cho) : " + sigak );

		mcho = System.currentTimeMillis();
		vt.insertElementAt(new Integer(999), 0);
		sigak = System.currentTimeMillis() - mcho;
		System.out.println("Vector SoYoSiGan(milli Cho) : " + sigak );

		Integer[] arr = new Integer[vt.size()];
		vt.copyInto(arr);
		for (int i=0 ; i<10 ; i++)
			System.out.println( arr[i] + " ");
		System.out.println();
	}
}

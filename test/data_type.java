class data_type{
	public static void main(String[] args){
		// float a = 3.14; <-- this code make error;
		// 3.14 return double class object
		// Q : why demotion does not occured
		// A : demotion is occured only if data's are integer types
		// only>> byte, short, int types
		float a = 3.14f;
		double b = 3.14;
		System.out.println(a +" "+ b);

	}
}

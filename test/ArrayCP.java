class ArrayCP{
	public static void main(String[] args){
		int []arr = {1,2,3,4,5};
		int []brr = new int[10];
		//brr = arr;
		System.arraycopy(arr,0,brr,2,5);
		System.out.println(brr[6]);
	}
}

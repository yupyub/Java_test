class array_test{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4,5};
		int[] arr2 = new int[5];
		//arr2 = arr1;
		System.arraycopy(arr1,1,arr2,2,3);
		arr2[0] = 1;
		for(int i = 0;i<arr1.length;i++){
			System.out.println(arr1[i] + " " + arr2[i]);
		}
	}
}

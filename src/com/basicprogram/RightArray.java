package com.basicprogram;

import java.util.Arrays;

public class RightArray {
	
	public static void main(String args[]) {
		int n=2;
		int temp;
		int arr[] = {4,7,9,2,6,1};
		n = n%arr.length;
		for(int j=1;j<=n;j++){
		int lastelement =arr[arr.length-1];
		int i;
		for(i=arr.length-1;i>0;i--){
		arr[i]=arr[i-1];
		}
		arr[0]=lastelement;
		}
		System.out.println(Arrays.toString(arr));
	}

}

import java.util.*;
public class ET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
/*		Q1)Sum of the array  */
		        // Input number of rows and columns
//		        System.out.print("Enter number of rows: ");
//		        int rows = sc.nextInt();
//
//		        System.out.print("Enter number of columns: ");
//		        int cols = sc.nextInt();
//
//		        int[][] arr = new int[rows][cols];
//
//		        // Input elements
//		        System.out.println("Enter elements:");
//		        for (int i = 0; i < rows; i++) {
//		            for (int j = 0; j < cols; j++) {
//		                arr[i][j] = sc.nextInt();
//		            }
//		        }
//
//		        // Calculate sum
//		        int sum = 0;
//		        for (int i = 0; i < rows; i++) {
//		            for (int j = 0; j < cols; j++) {
//		                sum += arr[i][j];
//		            }
//		        }
//
//		        // Output result
//		        System.out.println("Sum = " + sum);


/*Q2 Find the largest and smallest number in an array	*/	        
		        
//		        int ar[][]= {{0,2,3},{4,5,6}};
//		        
//		        
////		        Smallest array
//		        int min=ar[0][0];
//		        
//		        for(int i=0;i<ar.length;i++) {
//		        	for(int j=0;j<ar[i].length;j++) {
//		        		if(ar[i][j]<min) {
//		        			min=ar[i][j];
//		        		}
//		        	}
//		        }
//		        
//		        
////		        Largest array
//		        int max=ar[0][0];
//		        
//		        for(int i=0;i<ar.length;i++) {
//		        	for(int j=0;j<ar[i].length;j++) {
//		        		if(ar[i][j]>max) {
//		        			max=ar[i][j];
//		        		}
//		        	}
//		        }
//		        System.out.println(min);
//		        System.out.println(max);
		        
// Q3  Calculate the average of elements in an array.
		        
		
//		1D array avg
//		int arr[]= {1,2,3,4,5,6,7,8,100};
//		int sum=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			sum +=arr[i];
//		}
//		
//		double avg=(double)sum/arr.length;
//		System.out.println("Average:"+ avg);
//		
		
		
//      2D array avg
//		int arr[][]= {{1,2,3,4,5,6,7,8,100},{56,29,37,1,2,3,5,6,7}};
//		int sum=0;
//		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				sum +=arr[i][j];
//				count++;
//			}
//		}
//		double avg=(double)sum/count;
//		System.out.println("Average:"+ avg);
//		
		
		
//Q4) Count how many even and odd numbers are present in an array.
		
//		int arr[]= {1,2,3,4,5,6,7};
//		int count=0;
		
//		System.out.println("The even numbers in the array are:");
//		for(int i=0;i<arr.length;i++) {
//			if(i%2==0) {
//				count++;
//				System.out.println(arr[i]);
//			}
//		}
//		System.out.println("Total number of even number:"+count);
//		
		
//		System.out.println("The odd numbers in the array are:");
//		for(int i=0;i<arr.length;i++) {
//			if(i%2!=0) {
//				count++;
//				System.out.println(arr[i]);
//			}
//		}
//		System.out.println("The number od odd number:"+count);
//		
//		int even=0;                   /*this is only counting not printing*/
//		int odd=0;
//		for(int i=0;i<arr.length;i++) {         
//			if(arr[i]%2==0) {
//				even++;
//			}else {
//				odd++;
//			}
//		}
//		System.out.println("even number:"+even);
//		System.out.println("odd number:"+odd);
		
		
		
//5Q)  Print all elements greater than a given number X
		
//		int arr[]= {1,34,11,35,2,87,13};
//		int num=12;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>num) {
//				System.out.println(arr[i]);
//			}
//		}

		
		
// 6Q) Reverse an array using a loop. 		
		
//		DONE SEPARATE
		
		
// 7Q) 	 Check whether a given number exists in an array. 
		
//		int arr[]= {1,2,3,4,5};
//		System.out.println("Enter the element you want to search:");
//		int target=sc.nextInt();
//		boolean found=false;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target) {
//				System.out.println(target+" "+"element found");
//				found=true;
//				break;
//			}
//		}
//		if(!found) {
//			System.out.println("Element not found");
//		}
		
		
		
		
// 8Q) Count how many times a target number appears in an array. 		
		
//		int arr[]= {1,2,3,4,5,6,7,8,1,2,1};
//		System.out.println("Enter the number:");
//		int target=sc.nextInt();
//		int count=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target) {
//				count++;
//			}
//		}
//		System.out.println("The target Number appears"+" "+count+" "+"times in an array.");
		
		
// 9Q) Sum of even Numbers
//		int arr[]= {23,44,1,8,12,3,5,7,9};
//		
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				sum +=arr[i];
//			}
//		}
//		System.out.println(sum);
		
		
// 10Q) Replace all negative numbers in an array with 0.
		
//		int arr[]= {1,2,-3,-5,9,-21};
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<0) {
//				arr[i]=0;
//			}
//		}
//		
//		/* printing array*/
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
// 11Q) Create a new array containing only even numbers from the original array.
		
//		int arr[]= {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88};	
//		int evenarr[]=new int[arr.length];
//		int index=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2 == 0) {
//				evenarr[index]=arr[i];
//				index++;
//			}
//		}
//		
//		for(int i=0;i<index;i++) {
//			System.out.print(evenarr[i]+" ");
//		}
		
		
//	12Q) Find the second largest number in an array
		
//		int arr[]= {1,2,3,49,22,44,190};
//		
//		/* step 1 find largest */
//		int max=arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println("Largest:"+max);
//		
//		
//		/* second largest */
//		int secondMax=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=max && arr[i]>secondMax) {
//				secondMax=arr[i];
//			}
//		}
//		System.out.println("Second Largest:"+secondMax);
		
	
// 13Q) Check if an array is sorted in ascending order
		

//		 for(int i=1;i<arr.length;i++) {
//			 if(arr[i]<arr[i-1]) {
//				 sorted=false;
//				 break;
//			 }
//		 }
//		 if(sorted) {
//			 System.out.println("array is sorted");
//		 }else {
//			 System.out.println("Array is not sorted");
//		 }
		 
		 /*  OR  */
		 /* another way by using method (done separately , folder name is SortedArray */
		 
		 
		 
//	14Q)  Move all zeros in an array to the end while keeping the order of non-zero elements.	 
		
		/*Leet code #283  */
//		int arr[]= {1,2,0,8,5,0,4,7,0,4};
//		int nz=0,z=0;     /* nz=non zero & z=zero */
//		
//		while(nz<arr.length) {
//			if(arr[nz]!=0) {
//				int temp=arr[nz];
//				arr[nz]=arr[z];
//				arr[z]=temp;
//				
//				nz++;
//				z++;
//			}else {
//				nz++;
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
//	15Q) Find the first element in an array that is greater than a given value X. 	
//	        int[] arr = {3,2, 5, 1, 8};
//	        int x = 1;
//
//	        for (int i = 0; i < arr.length; i++) {
//	            if (arr[i] > x) {
//	                System.out.println("First element greater than " + x + " is: " + arr[i]);
//	                return; // stop after first match
//	            }
//	        }
//
//	        System.out.println("No element greater than " + x);
		
		
//	16Q)  Print elements at even indexes and odd indexes separately.	

//		 int arr[]= {1,2,3,4,5,6,7,8,9,10};
//		 
//		 System.out.println("Element at even indexes:");
//		 for(int i=0;i<arr.length;i++) {
//			 if(arr[i]%2==0) {
//				System.out.print(arr[i]+" ");
//			 }
//		 }
//		 System.out.println();
//		 System.out.println("Element at odd indexes:");
//		 for(int i=0;i<arr.length;i++) {
//			 if(arr[i]%2!=0) {
//				System.out.print(arr[i]+" ");
//			 }
//		 }
		 
// 17Q) Count the number of elements divisible by 3 and by 5.
		
//		int  arr[][]= {{1,2,3,4,5},{6,7,8,9,10}};
//		
//		int count=0;
//		int five=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				if(arr[i][j]%3==0) {
//					count++;
//				}
//				if(arr[i][j]%5==0) {
//					five++;
//				}
//			}
//		}
//		System.out.println("Elements divisible by 3 are:"+count);
//		System.out.println("Elements divisible by 5 are:"+five);
		
		
// 18Q)  Compare two arrays and print common elements. 
		
//		int arr1[]= {1,2,3,4,5};
//		int arr2[]= {5,6,7,8,2};
//		
//		System.out.println("Common elements are:");
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]==arr2[j]) {
//					System.out.print(arr2[j]+" ");
//				}
//			}
//		}
		
		
// 19Q)  Find the difference between the maximum and minimum element in an array.
		
//		int arr[]= {77,12,34,52,9,44,59};
//		
//		int max=arr[0];
//		int min=arr[0];
//		int diff=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println("max element :"+max);
//		System.out.println("min element :"+min);
//		
//		diff=max-min;
//		System.out.println("The differen between the maximum and minimum element in an array :"+diff);

		
// 20Q) Check if all elements in an array are positive.
		
//		int arr[]= {1,2,3,-21,33};
//		
//		 for (int i = 0; i < arr.length; i++) {
//	            if (arr[i] <0) {
//	                System.out.println("Not all elements are positive");
//	                return;
//	            }
//	        }
//
//	        System.out.println("All elements are positive");
		

// 21Q) Given an integer array nums, return true if any value appears
//		at least twice in the array, and return false if every element is distinct		

		/* done in SortedArray.java file */

// 23Q) FInd the duplicate element
//		int arr[]= {2,3,1,4,2,6};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Duplicate element is :"+arr[i]);
//				}
//			}
//		}
	
		
// 24Q) Transpose of a Matrix
		
		/* shortest way */
//		System.out.print("Enter the rows:");
//		int r=sc.nextInt();
//		System.out.print("Enter the columns:");
//		int c=sc.nextInt();
//		int arr[][]=new int[r][c];
//		int arr2[][]=new int[c][r];
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j = 0;j<arr[i].length;j++) {
//				arr[i][j]=sc.nextInt();
//				arr2[j][i]=arr[i][j] ;	
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j = 0;j<arr[i].length;j++) {
//				System.out.print(arr2[i][j]+" ");	
//			}
//			System.out.println();
//		}
//		
		
		/* FUlly understandable code */
		
//		System.out.print("Enter the rows:");
//		int row=sc.nextInt();
//		System.out.print("Enter the columns:");
//		int col=sc.nextInt();
//		
//		int arr1[][] = new int[row][col];
//		int arr2[][]=new int[row][col];
//		
//		for(int i=0;i<=arr1.length-1;i++) {
//			for(int j=0;j<=arr1[i].length-1;j++) {
//				arr1[i][j]=sc.nextInt();
//			}
//		}
//		
//		System.out.println("Original matrix:");
//		
//		for(int i=0;i<=arr1.length-1;i++) {
//			for(int j=0;j<=arr1[i].length-1;j++) {
//				System.out.print(arr1[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for(int i=0;i<=arr1.length-1;i++) {
//			for(int j=0;j<=arr1[i].length-1;j++) {
//				arr2[j][i]=arr1[i][j];
//			}
//		}
//		
//		System.out.println("Transposed matrix:");
//		
//		for(int i=0;i<=arr1.length-1;i++) {
//			for(int j=0;j<=arr1[i].length-1;j++) {
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();		
//		}
		
		

//  25Q) Find missing number (1 to n)		
		
//		int arr[]= {1,2,4,5};
//		
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
//		}
//		
//		int n=arr.length+1;
//		int actualSum= n*(n+1)/2;
//		int missingNum=actualSum-sum;
//		
//		System.out.println(missingNum);
		
		/* for missing number from anywhere like {95,94,91,92}  go to missing.jva file*/ 
		
	}
}

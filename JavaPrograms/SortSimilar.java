import java.util.*;
import java.io.*;

public class SortSimilar


	{
		public static void main(String[] args)

			{
				System.out.println("Enter the size of the array");
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();

				int[] arr1=new int[n];

				System.out.println("Enter the integer elements of first array");

				for(int i=0;i<n;i++)

						{
							arr1[i]=sc.nextInt();
						}

				int[] arr2=new int[n];

				System.out.println("Enter the integer elements of Second array");

				for(int i=0;i<n;i++)

						{
							arr2[i]=sc.nextInt();
						}

				ArrayList<StackIntegersSample> arr3 = new ArrayList<StackIntegersSample>();

				for(int i=0;i<n;i++)

						{
							for(int j=0;j<n;j++)

									{
										if(arr1[i]==arr2[j])
												{

													arr3.add(arr1[i]);
													break;
				
												}

									}

							
						}

				int len = arr3.size();
				StackIntegersSample[] res = new StackIntegersSample[len];
				res = arr3.toArray(res);
		
				System.out.println();
				System.out.println("The resultant array before sorting  : ");
				System.out.println(Arrays.toString(res));
				for(int i=0;i<len-1;i++)
					{			
						for(int j=0;j<len-i-1;j++)
							{
								if(res[j] > res[j+1])
									{
										int temp = res[j];
										res[j] = res[j+1];
										res[j+1] = temp;
									}
							}
					}
				System.out.println();
				System.out.println("After sorting: ");
				System.out.println(Arrays.toString(res));
				sc.close();	



			}


	}
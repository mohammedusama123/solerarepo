package daytwo;

public class AddingMatricesOld {
		  public static void main(String[] args) {
			int[][]arr1= {{1,2,3},{4,5,6},{7,8,9}};
			int[][]arr2= {{1,2,3},{4,5,6},{7,8,9}};
			int[][]result=new int[3][3];
			int rowsOfArr1=arr1.length;
			int columsOfArr1=arr1[0].length;
			int rowsOfArr2=arr2.length;
			int columsOfArr2=arr2[0].length;
			
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[i].length;j++) {
					
					result[i][j]=(arr1[i][j]+arr2[i][j]);	
				}
			}
			for(int i=0;i<result.length;i++) {
				for(int j=0;j<result[i].length;j++) {
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
		}
		}


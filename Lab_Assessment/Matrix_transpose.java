package classPractice;

public class Matrix_transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [][] = {{1,2,3}, {4, 5,6}, {7,8,9}};
		
		System.out.println("Original maatrix:");
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println();
		}

	}

}

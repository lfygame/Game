package mainPGC;

public class array2D 
{
	
	public static int[][] field = new int[mainClass.x][mainClass.x];
	
		
	void get2DArrayContent(int[][] array)
	{
		for (int i = 0; i < field.length; i++) 
		{
			for (int j = 0; j < field.length; j++) 
			{
				System.out.println("[Debug]\ti: [" + i + "] j: [" + j + "] - " + field[i][j]);
			}
		}
	}
	
	void createField()
	{
		for (int i = 0; i < mainClass.x; i++) 
		{
			for (int j = 0; j < mainClass.x; j++) 
			{
				field[i][j] = 0;
			}
		}
	}

}

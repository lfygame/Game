package mainPGC;

import java.util.Random;

public class mines 
{
	public static int[][] minesOnField = new int[mainClass.x][mainClass.x];
	
	
	void setMine(int[][] arrayXY)
	{
		Random r = new Random();

		for(int i = 0; i < mainClass.x; ++i)
		{
			int x = r.nextInt(mainClass.x);
			int y = r.nextInt(mainClass.x);	
			
			if(!hasMine(arrayXY, x, y))
			{
				arrayXY[x][y] = 1;
				
				if(mainClass.debug == true) 
					System.out.println("[Debug]\tMine set to x: [" + x + "] y: [" + y + "]");	
			}
			else
			{
				i--;
				if(mainClass.debug == true) 
					System.out.println("[Debug]\tPlace already in use.. trying again!");
			}
		}
	}
	
	
	boolean hasMine(int[][] array, int x, int y)	
	{ 
		if(array[x][y] == 1)
		{
			return true;
		}
		else
			minesOnField[x][y] = 1;
			return false; 
	}
	
	
	void getMines()
	{
			System.out.println("\n----------------------------------");
			for (int i = 0; i < mainClass.x; i++)
			{
				for (int j = 0; j < mainClass.x; j++) 
				{
					if(minesOnField[i][j] == 1)
					{					
						System.out.println("[Debug]\tMine found on: [" + i + "] [" + j + "]");	
					}
				}
			}
			System.out.println("[Debug]\tNo more mines found!");
			System.out.println("----------------------------------\n");
	}
	
}

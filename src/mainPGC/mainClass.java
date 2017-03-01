package mainPGC;

import java.util.Scanner;

public class mainClass 
{
	
	public static int x;
	public static boolean debug = false; //SET TO TRUE/FALSE IF YOU WANT TO USE DEBUG MODE

	public static String BUG = "[BUG]";
	public static String FIX = "[FIX]";
	
	public static void main(String[] args)
	{
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select youre level..\n1 - [5x5]");
		System.out.println("2 - [8x8]");
		System.out.println("3 - [16x16]");
		System.out.println("4 - [32x32]");
		
		switch (s.nextInt()) 
		{
		case 1:
			x = 5;
			s.close();
			break;
		case 2:
			x = 8;
			s.close();
			break;
		case 3:
			x = 16;	
			s.close();
		break;
		case 4:
			x = 32;
			s.close();
		break;
		
		default:
				System.out.println("Couldn't get youre choise try again!");
				s.close();
			break;	
		}
		
		array2D field = new array2D();
		mines mine = new mines();
		int size = (x * x) - 1;
		
		
		System.out.println("\n----------------------------------");
		System.out.println("[Load]\tCreating field with " + size + " fields.. " + BUG + FIX);
			field.createField(); //create the field
			
		System.out.println("[Load]\tSetting up mines..");
			mine.setMine(array2D.field); //set the mines to the field
			
		System.out.println("[Load]\tDone!");
		System.out.println("----------------------------------\n");
		
		
		//mine.getMines(); //print out all fields with mines on
		//field.get2DArrayContent(array2D.field); //print 2DArray
	}
	
	
}

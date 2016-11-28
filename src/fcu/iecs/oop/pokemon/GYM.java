package fcu.iecs.oop.pokemon;

public class GYM
{
	public static void fight(Pokemon p1, Pokemon p2)
	{
		int num = (int)(Math.random()*2+1);
		if(num == 1)
		{
			System.out.printf("Winner is [%s].\n",p1.Name);
			p1.CP = p1.CP + 500;
		}
		else
		{
			System.out.printf("Winner is [%s].\n",p2.Name);
			p2.CP = p2.CP + 500;
		}
	}
	public class Pokemon
	{
		
		String Name;
		int CP;
		
		public Pokemon(String name,int cp)
		{	
			this.Name = name; 
			this.CP = cp;
		}
			
	}
}

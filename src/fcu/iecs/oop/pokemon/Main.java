package fcu.iecs.oop.pokemon;

public class Main 
{
	public static 
	class Pokemon
	{
		
		private String Name;
		private int CP;
		
		public Pokemon(String name,int cp)
		{	
			this.Name = name; 
			this.CP = cp;
			
		}
			
	}

	public static void main(String[] args) 
	{
		 Pokemon p1 = new Pokemon("Psyduck",100);
		 Pokemon p2 = new Pokemon("Pikachu",300);
		 GYM.fight(p1,p2);


	}
	
	
	public static class GYM
	{
		public static void fight(Main.Pokemon p1,Main.Pokemon p2)
		{
			int num = (int)(Math.random()*2);
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
			
	}
}

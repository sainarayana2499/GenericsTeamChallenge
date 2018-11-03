package Challenge;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Football Team");
		System.out.println("-----------------------------------------------------");
		Football Messi=new Football("Messi");
		Team<Football> Barcelona=new Team<Football>("Barcelona");
		Barcelona.addPlayer(Messi);
		Football Vidal=new Football("Vidal");
		Barcelona.addPlayer(Vidal);
		Football Gerrad=new Football("Gerrad");
		Barcelona.addPlayer(Gerrad);
		Football Suaraz=new Football("Suaraz");
		Barcelona.addPlayer(Suaraz);
		System.out.println("-----------------------------------------------------");
		System.out.println("Cricket Team");
		System.out.println("-----------------------------------------------------");
		Cricket Sachin=new Cricket("Sachin");
		Team<Cricket> India=new Team<Cricket>("India");
		India.addPlayer(Sachin);
		Cricket Virat=new Cricket("Virat");
		India.addPlayer(Virat);
		Cricket Dhawan=new Cricket("Dhawan");
		India.addPlayer(Dhawan);
		Cricket Dhoni=new Cricket("Dhoni");
		India.addPlayer(Dhoni);
		System.out.println("-----------------------------------------------------");
		Team<Football> Liverpool=new Team<Football>("Liverpool");
		Team<Football> Juventus=new Team<Football>("Juventus");
		Team<Football> Manchester=new Team<Football>("Manchester");
		Team<Cricket> Australia=new Team<Cricket>("Australia");
		Team<Cricket> SouthAfrica=new Team<Cricket>("SouthAfrica");
		Team<Cricket> Afganistan=new Team<Cricket>("Afganistan");
		System.out.println("Football Result");
		System.out.println("-----------------------------------------------------");
		Barcelona.score(Liverpool, 12, 6);
		Liverpool.score(Juventus, 25, 23);
		Juventus.score(Manchester, 7, 3);
		Manchester.score(Barcelona, 2, 1);
		System.out.println("------------------------------------------------------");
		System.out.println("Cricket Result");
		System.out.println("------------------------------------------------------");
		India.score(Australia,999,899);
		Australia.score(SouthAfrica,124,145);
		SouthAfrica.score(Afganistan, 325, 324);
		Afganistan.score(India, 652, 650);
		System.out.println("------------------------------------------------------");
		System.out.println("Football Rank");
		System.out.println("------------------------------------------------------");
		System.out.println(Barcelona.rank());
		System.out.println(Juventus.rank());
		System.out.println(Liverpool.rank());
		System.out.println(Manchester.rank());
		System.out.println("------------------------------------------------------");
		System.out.println("Cricket Rank");
		System.out.println("------------------------------------------------------");
		System.out.println(India.rank());
		System.out.println(Australia.rank());
		System.out.println(SouthAfrica.rank());
		System.out.println(Afganistan.rank());
		System.out.println("------------------------------------------------------");
		System.out.println(India.compareTo(Australia));
		
		
		
		

	}

}

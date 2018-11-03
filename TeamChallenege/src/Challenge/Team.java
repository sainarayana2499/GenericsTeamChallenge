package Challenge;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team>
{
	String name;
	int win=0;
	int lose=0;
	int draw=0;
	int played=0;
	
	ArrayList<T> memebers=new ArrayList<T>();

	public Team(String name)
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	public int numberofplayer()
	{
		return this.memebers.size();
	}
	public boolean addPlayer(T player)
	{
		if(memebers.contains(player))
		{
			System.out.println(player.name+" Is already been added ");
			return false;
		}
		else
		{
			System.out.println(player.name+" Added to the team ");
			memebers.add(player);
			return true;
		}
	}
	public void score(Team<T> opponent,int ourscore,int theirscore)
	{
		String message;
		if(ourscore>theirscore)
		{
			win++;
			message=" wins over ";
		}
		else if(ourscore<theirscore)
		{
			lose++;
			message=" lost from ";
		}
		else
		{
			draw++;
			message=" draws with ";
		}
		played++;
		if(opponent!=null)
		{
			System.out.println(this.getName()+ message + opponent.getName());
			score(null,ourscore,theirscore);
		}
	}
	public int rank()
	{
		return (win*2)+draw;
	}
	@Override
	public int compareTo(Team t) 
	{
		if(this.rank()<t.rank())
		{
			return -1;
		}
		else if(this.rank()>t.rank())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}	
}

import java.util.ArrayList;

public class Playlist
	{
		static ArrayList <Song> playlist = new ArrayList <Song>();
		public static void addSong()
		{
			playlist.add(new Song(153, "tiger", "cat"));
			playlist.add(new Song(162, "mouse", "dog"));
			playlist.add(new Song(132, "fox", "frog"));
			playlist.add(new Song(169, "deer", "lion"));
			playlist.add(new Song(133, "elephant", "alligator"));
			
		}
		public static void printList()
		{
			for (int i = 0; i < playlist.size(); i++)
				{
					System.out.println("The song is "+playlist.get(i).getName()+". The singer is "+playlist.get(i).getPerson()+". The length in second is "+playlist.get(i).getLength());
				}
		}
		public static void changeLength()
		{
			for (int i = 0; i < playlist.size(); i++)
				{
					playlist.get(i).setLength(playlist.get(i).getLength()-10);
				}
		}
		public static void delete()
		{
			String longest = playlist.get(0).getName();
			for (int i = 1; i < playlist.size(); i++)
				{
					if (playlist.get(i).getName().length() > playlist.get(i-1).getName().length())
						{
							longest = playlist.get(i).getName();
						}
				}
			for (int i = 0; i < playlist.size(); i++)
				{
					if (longest.equals(playlist.get(i).getName()))
						{
							playlist.remove(i);
						}
				}
		}
		public static void changeName()
		{
			playlist.get(0).setPerson("xxx");
		}
		public static void main(String[] args)
			{
				addSong();
				System.out.println("I don't know about songs, so I just type in random stuff");
				printList();
				changeLength();
				System.out.println();
				printList();
				System.out.println();
				delete();
				printList();
				System.out.println();
				changeName();
				printList();
			}

	}

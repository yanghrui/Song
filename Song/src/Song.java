public class Song
	{
		int length;
		String name;
		String person;
		public Song (int l, String n, String p)
		{
			length = l;
			name = n;
			person = p;
		}
		public int getLength()
			{
				return length;
			}
		public void setLength(int length)
			{
				this.length = length;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getPerson()
			{
				return person;
			}
		public void setPerson(String person)
			{
				this.person = person;
			}
	}

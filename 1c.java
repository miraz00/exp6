import java.io.*;
class main
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("expc.txt");
			int i;
			while((i=fin.read())!=-1)
				System.out.println((char)i);
			fin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
}

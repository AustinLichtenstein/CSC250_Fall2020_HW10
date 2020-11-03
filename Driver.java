import java.util.Random;

public class Driver {

	public static void main(String[] args) 
	{
		int[] PlayerAge = new int [4];
		Random r = new Random();
		System.out.println(r.nextInt(25));
		for(int i = 0; i < PlayerAge.length; i++)
		{
			PlayerAge[i] = r.nextInt(25);
		}
		//Driver.displayArray(PlayerAge);
		mergeSort(PlayerAge, 0, PlayerAge.length -1);
		Driver.displayArray(PlayerAge);
	
	
	
	
	}
		static void mergeSort(int[] PlayerAge, int begin, int end)
		{
			if (begin != end)
			{
				int begin1 = begin;
				int end1 = begin +(end - begin)/2;
				int begin2 = end1 + 1;
				int end2 = end;
				 mergeSort(PlayerAge, begin1, end1);
				 mergeSort(PlayerAge, begin2, end2);
				 merge(PlayerAge, begin1, end1, begin2 , end2);
			}
				
		}
		
		
	static void displayArray(int[] PlayerAge)
	{
		for(int i = 0; i < PlayerAge.length; i++)
		{
			System.out.println(PlayerAge[i]);
		}
		}
	static void merge(int[] PlayerAge, int begin1, int end1 , int begin2 , int end2 )
	{
		int[] temp = new int[ end2 - begin1 +1];
		int pos1 = begin1;
		int pos2 = begin2;
		for(int i = 0; i < temp.length; i++)
		{
			if(pos1 <= end1 && pos2 <= end2)
			{
				if(PlayerAge[pos1] < PlayerAge[pos2])
				{
					temp[i] = PlayerAge[pos1];
					pos1++;
					
				}
				else
				{
					temp[i] = PlayerAge[pos2];
							pos2++;
				}
			}
				else
			{
				if(pos1 > end1)	
				{
					temp[i] = PlayerAge[pos2];
					pos2++;
				}
				else
				{
					temp[i] = PlayerAge[pos1];
					pos1++;
				}
			}
			
		}
		int posInTemp = 0;
		for(int i = begin1; i <= end2; i++)
		{
			PlayerAge[i] = temp[posInTemp];
			posInTemp++;
		}
	}
	
	
}

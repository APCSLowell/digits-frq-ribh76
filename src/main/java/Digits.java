import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
		digitList = new ArrayList<Integer> () ;
		if (num == 0){ 
			digitList.add(0);
		}
		while (num >0) {
			digitList.add(0,(num%10));
			num/=10;
		}   
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for (int i = 1; i<digitList.size(); i++){
			if (digitList.get(i-1).compareTo(digitList.get(i)) >=0){
				return false;
			}
		}
		return true; 
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}

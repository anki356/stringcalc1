package testadd;

public class StringCalculator {
		public static int Add(String numbers) {
		if (numbers.equals("")) {
			return 0;
		}
		else
		{
			String delimiter=",";
			if(numbers.matches("//(.*)\n(.*)")) {
				delimiter=Character.toString(numbers.charAt(2));
			    numbers=numbers.substring(4);
		}
		
		
		String numlist[]=splitNumbers(numbers,delimiter+ "|\n");
		return sum(numlist);
		}
	}	
	
	private static int toInt(String number) {
		return Integer.parseInt(number);
			}
	private static String[] splitNumbers(String numbers ,String divider) {
		return numbers.split(divider);
	}
	private static int sum(String[] numbers) {
		int total=0;
		String negStr="";
	for (String number:numbers) {
		if(toInt(number)<0) {
			if (negStr.equals(""))
				negStr=number;
			else
				negStr+=(","+number);
		}
		if(toInt(number)<1000) 
			total+=toInt(number);
	}
		if(!negStr.equals(""))  {
			throw new IllegalArgumentException("Negatives not allowed:" + negStr);
		}
		return total;
	}
	
	
	
			
			
		
			
		}
	
		
	
	

   


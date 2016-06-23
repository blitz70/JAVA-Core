package codefights.codebots.ratiorg;

public class Ratiorg3 {

	public static String fancyRide(int l, double[] fares) {
		  String[] cars = {"UberX", "UberXL", "UberPlus", "UberBlack", "UberSUV"};
		  String answer = "";
		  for (int i = 0; i < 5; i++) {	//
		    if (fares[i] * l <= 20) {
		      answer = cars[i];
		    }
		  }
		  return answer;
		}
	
	public static boolean crossroads(int[] road1, int[] road2, int crossTime) {
		  int j = 0;
		  for (int i = 0; i < road1.length; i++) {  
		    while (j < road2.length && road1[i] > road2[j]) {	//
		      if (road2[j] + crossTime > road1[i]) {
		        return true;
		      }
		      j++;
		    }
		    if (j < road2.length && road1[i] + crossTime > road2[j]) {
		      return true;
		    }  
		  }
		  return false;
	}

	public static String myConcat(String[] arguments, String separator) {
		String answer = "";
		for (int i = 0; i < arguments.length; i++) {
			answer += arguments[i] + separator;
		}
		return answer;
	}

	public static void main(String[] args) {
		
		int[] roada1 = {1, 5, 6, 7};
		int[] roadb1 = {3, 10};
		int crossTime1 = 2;
		System.out.println(crossroads(roada1, roadb1, crossTime1));
		
		String[] arguments1 = {"Code", "Fight", "On", "!"};
		String separator1 = "/";
		String[] arguments2 = {"Code", "Fight", "On", "!"};
		String separator2 = " ";
		System.out.println(myConcat(arguments1, separator1));
		System.out.println(myConcat(arguments2, separator2));
		
	}
}

package operation;

import org.json.JSONObject;

public class BaseOperation {
	private static double sum(double a, double b) {
		return a+b;
	}
	
	private static double diff(double a, double b) {
		return a-b;
	}
	
	private static double times(double a, double b) {
		return a*b;
	}
	
	private static double ratio(double a, double b) {
		double c = 0;
		if(b!=0) {
			c = a/b;
		}
		return c;
	}
	
	public static void main(String[] arg) {
		double a = 3.0, b = 7.0;
		double dSum = sum(a, b);
		double dDiff = diff(a, b);
		double dTimes = times(a, b);
		double dRatio = ratio(a, b);
		
		JSONObject jo = new JSONObject();
		jo.put("Sum", dSum);
		jo.put("Diff", dDiff);
		jo.put("Times", dTimes);
		jo.put("Ratio", dRatio);
		
		System.out.println(jo);
	}
}

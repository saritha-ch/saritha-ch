package week3.day1;

public class Calculator {
		public int add(int num1, int num2) {
		return num1+num2;
		}
		public int add(int num1,int num2,int num3) {
			return num1+num2+num3;
		}
		public int mul(int num1,int num2) {
			return num1*num2;
			
		}
		public double mul(int num1,double num2)
		{
			return num1*num2;
		}
		public static void main(String[] args) {
			 Calculator cal = new Calculator();
			 System.out.println("addition is" +(cal.add(10, 10)));
		}

	
}

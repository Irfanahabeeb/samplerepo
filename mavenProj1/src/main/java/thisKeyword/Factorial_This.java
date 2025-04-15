package thisKeyword;

public class Factorial_This {
	int num;
    long result;
    public void calculate(int num) 
    {
        this.num = num; 
        result = 1;

        for (int i = 1; i <= num; i++)
        {
            result = result*i;
        }   
        
        this.printResult();
        
    }
   public  void printResult() {
        System.out.println("Factorial of " + num + " is: " + result);
    }

	public static void main(String[] args) {

		Factorial_This obj = new Factorial_This();
	        obj.calculate(5); 
	}

}

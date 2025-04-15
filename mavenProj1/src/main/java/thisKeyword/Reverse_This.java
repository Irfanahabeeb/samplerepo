package thisKeyword;

public class Reverse_This {
	int num;
	
	public Reverse_This(int num)
	{
		this();
		this.num=num;
		int reverse = 0, temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reverse of " + num + " is: " + reverse);
    
	}
	
	public Reverse_This() {
	        System.out.println("Finding reverse.....");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_This obj = new Reverse_This(1234);
	}

}

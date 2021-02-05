package toys;


//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design and create
//your Toy class

//Use the lab handout
//and sample runner
//code provided
//to help you

public class Toy {
	
	private String name;
	private int count;
	
	public Toy(String n) {
		name = n;
		count = 1;
	}

	public int getCount() {
		return count;
}
	
	public String getName() {
		return name;
	}

	public void setCount(int c) {
		if (c <= Integer.MAX_VALUE) {
			count = c;
		}
		
	}
	

	
	}

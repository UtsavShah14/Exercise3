//Search the number of zeros in an array
public class SearchZero {

	public static void main(String[] args) {

		int n=1000000;
		int list[] = new int[n];
//		int count=0; //initialized to check the initial program
		for (int i = 0; i<list.length; i++) { //created the array of input
			list[i]= (int) (Math.random()*100);
		}
//		To check the initial trial output of array
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		
//		Creating instances of the thread
		SearcherZero instance1 = new SearcherZero(list,0,n/4);
		SearcherZero instance2 = new SearcherZero(list,n/4,n/2);
		SearcherZero instance3 = new SearcherZero(list,n/2,n*(3/4));
		SearcherZero instance4 = new SearcherZero(list,n*(3/4),n);
		
//		Starting the instances
		instance1.start();
		instance2.start();
		instance3.start();
		instance4.start();
		
//		Join the instances for synchronized output
		try {
			instance1.join();
			instance2.join();
			instance3.join();
			instance4.join();
		}
//		Check for errors
		catch(InterruptedException e) {
		}
		
//		Output
		System.out.println("The number of zeros in the array are: " + (instance1.getZeroCount()+instance2.getZeroCount()+instance3.getZeroCount()+
		instance4.getZeroCount()));
	}

}

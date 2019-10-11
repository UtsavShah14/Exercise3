
public class SearcherZero extends Thread{
	
	int f[], lb, ub;
	int count=0;
	
//	Parameterized COnstructor
	SearcherZero(int f1[], int a, int b){
		f=f1;
		lb=a;
		ub=b;
	}
	
//	Runnable function with the logical code
	public void run() {
		for (int i = lb; i < ub; i++) { //Loop to count the number of zeros
			if(f[i]==0) {
				count++;
//				System.out.println(" Utsav----"+i); To check the position of where 0 is printed
			}
		}
	}
	
	int getZeroCount() { //create a return function to return the value
		return count;  //returns value
	}
}

import java.util.*;
class ChildThread1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread "+i);
		}
	}
	
}

public class ThreadLearn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread1 ct1=new ChildThread1();
		ct1.start();
	//	ct1.setPriority(1);
		System.out.println(ct1.getName());
		ct1.setName("Human");
		System.out.println(ct1.getName());
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread "+i);
		}
	}

}
/*Output
 *Child Thread 1
Main Thread 1
Child Thread 2
Main Thread 2
Child Thread 3
Main Thread 3
Child Thread 4
Main Thread 4
Child Thread 5
Main Thread 5 
 * */
 
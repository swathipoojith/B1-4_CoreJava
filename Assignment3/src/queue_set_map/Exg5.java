package queue_set_map;
import java.util.PriorityQueue;
import java.util.Queue;
public class Exg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(1);
		q.add(2);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
	}

}

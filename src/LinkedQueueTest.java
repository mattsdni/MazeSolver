//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//
//public class LinkedQueueTest
//{
//	@Test
//	public void test()
//	{
//		LinkedQueue<Integer> q1 = new LinkedQueue<>();
//
//		assertEquals(true, q1.isEmpty());
//		System.out.println(q1.isEmpty());
//
//		for (int i = 0; i < 5; i++)
//		{
//			q1.enqueue(i);
//		}
//		assertEquals("0, 1, 2, 3, 4", q1.toString());
//		System.out.println(q1);
//
//		assertEquals(false, q1.isEmpty());
//		System.out.println(q1.isEmpty());
//
//		for (int i = 5; i < 10; i++)
//		{
//			q1.enqueue(i);
//		}
//
//		assertEquals(10, q1.size());
//		System.out.println(q1.size());
//
//		q1.dequeue();
//		System.out.println(q1);
//
//		assertEquals(1, (int)q1.first());
//		System.out.println((int)q1.first());
//	}
//}

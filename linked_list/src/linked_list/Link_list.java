package linked_list;

import java.util.LinkedList;

public class Link_list 
{
	public static void main(String[] args)
	{
		LinkedList p= new LinkedList();
		p.add(23);
		p.add(7);
		p.add(8);
		p.add(1);
    //	p.add("hi");
		p.add(3);
		System.out.println(p);
		System.out.println("get method");
		System.out.println(p.get(2));
		
		
		System.out.println("=====before========");
		System.out.println(p);
		System.out.println("===peek===");
		System.out.println(p.peek());
		System.out.println("===after  peek===========");
		System.out.println(p);
		
		System.out.println("=====before========");
		System.out.println(p);
		System.out.println("===poll===");
		System.out.println(p.poll());
		System.out.println("===after  poll===========");
		System.out.println(p);	
		
		System.out.println("=====before========");
		System.out.println(p);
		System.out.println("===peek===");
		System.out.println(p.peek());
		System.out.println("===after  peek===========");
		System.out.println(p);
		
		System.out.println("get method");
		System.out.println(p.get(3));
		
		
		System.out.println("=====before========");
		System.out.println(p);
		System.out.println("===poll===");
		System.out.println(p.poll());
		System.out.println("===after  pool===========");
		System.out.println(p);	
	}
}

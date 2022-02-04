package collection;

import java.util.ArrayList;
import java.util.Collections;

public class coll {

	public static void  main(String[] args)
	{
		ArrayList l1 = new ArrayList();
		l1.add(56);
		l1.add('A');
		l1.add(9.7);
	//	l1.add("True");
		
		ArrayList l2 = new ArrayList();
		l2.add(true);
		l2.add("hii");
		l2.add(9.7);
		
		ArrayList l3 = new ArrayList();
		l3.add(24);
		l3.add(9);
		l3.add(97);
		
		
		System.out.println("======before==========");
		System.out.println(l1);
		System.out.println(l2);
		
	//	l1.addAll(l2);//addall method
		
	//	l1.addAll(1, l2);	//addall at index place
		
	//	l1.retainAll(l2);	//duplicates only retain
		
	//	l1.removeAll(l2);	// dulicate only removed
		
	//	l1.remove(1);		//remove index value
		
	//	l1.remove('A');		//remove value
		
	/*	for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}*/
		
	//	Collections.sort(l3);

		if(l1.contains(56))
		{
			System.out.println("**************present**********");
		}
		else
		{
			System.out.println("********not present**********");
		}
		
		System.out.println("======after=======");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
	}

}

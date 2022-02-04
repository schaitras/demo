package map1;
// multiple prg
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Example1
{
	// prg for Hashmap 
/*	public static void main(String[] args)
	{
		Map <String, Integer> m = new HashMap<String,Integer>();
		String[] arr= {"hi","gn","gm","gn","hi","gm","gn","gm"};
		for (String s : arr)
		{
			if(!m.containsKey(s))
			{
				m.put(s,1);
			}
			else
			{
				int count=m.get(s);
				m.put(s,count+1);
			}
		}
		for(Entry<String, Integer> o1 : m.entrySet())
		{
			System.out.println(o1.getKey()+" "+o1.getValue());
		}
	}		*/
	
// prg for Linkedhashmap 
	
/*	public static void main(String[] args)
	{
		Map <String, Integer> m = new LinkedHashMap<String,Integer>();
		String[] arr= {"hi","gn","gm","gn","hi","gm","gn","gm"};
		for (String s : arr)
		{
			if(!m.containsKey(s))
			{
				m.put(s,1);
			}
			else
			{
				int count=m.get(s);
				m.put(s,count+1);
			}
		}
		for(Entry<String, Integer> o1 : m.entrySet())
		{
			System.out.println(o1.getKey()+" "+o1.getValue());
		}
	}		*/
	
	
//prg for Treemap 
	
/*	public static void main(String[] args)
	{
		Map <String, Integer> m = new TreeMap<String,Integer>();
		String[] arr= {"hi","gn","gm","gn","hi","gm","gn","gm"};
		for (String s : arr)
		{
			if(!m.containsKey(s))
			{
				m.put(s,1);
			}
			else
			{
				int count=m.get(s);
				m.put(s,count+1);
			}
		}
		for(Entry<String, Integer> o1 : m.entrySet())
		{
			System.out.println(o1.getKey()+" "+o1.getValue());
		}
	}				*/
	
	//prg for find highest duplicate string
	public static void main(String[] args)
		{
			Map <String, Integer> m = new HashMap<String,Integer>();
			String[] arr= {"hi","gn","gm","gn","hi","gm","gn","gm","gn"};
			for (String s : arr)
			{
				if(!m.containsKey(s))
				{
					m.put(s,1);
				}
				else
				{
					int count=m.get(s);
					m.put(s,count+1);
				}
			}
			int largest=0;
			String x=null;
			for(Entry<String, Integer> o1 : m.entrySet())
			{
				if(o1.getValue() > largest)
				{
					largest = o1.getValue();
					x=o1.getKey();
				}
			
			}
			System.out.println(x+" "+largest);
	}		
}

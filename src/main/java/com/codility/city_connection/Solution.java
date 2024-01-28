package com.codility.city_connection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution
{
	public int[] solution(int[] T) 
	{
		Graph graph = new Graph(T);

		HashMap<Integer, Set<Integer>> map = graph.get();
		
		List<Integer> openList	= new LinkedList<Integer>();
		List<Integer> closeList = new LinkedList<Integer>();
		int[] result = new int[T.length-1];
		
		int captial = graph._Captial;
		openList.add(captial);
		
		int k = 0;
		while (!openList.isEmpty())
		{
			int size = openList.size();

			int num = 0;
			int i = 0;
			while (i < size)
			{
				int key = openList.remove(0);
				closeList.add(key);

				Set<Integer> set = map.get(key);
				for (int val : set)
				{
					if (closeList.contains(val)) continue;
					num++;
					openList.add(val);
				}
				i++;
			}
			result[k++] = num;
		}
		return result;
	}
}

class Graph
{
	int _Captial = -1;
	HashMap<Integer, Set<Integer>> _map;

	public Graph(int[] nums) 
	{
		_map = new HashMap<Integer, Set<Integer>>();
		
		int len = nums.length;
		for (int i=0; i<len; i++)
		{
			int v1 = i, v2 = nums[i];
			this.addEdge(v1, v2);
			this.addEdge(v2, v1);
		}
	}
	
	public void addEdge(int v1, int v2)
	{
		if (v1 == v2) {
			this._Captial = v1;
			return;
		}

		Set<Integer> keys = this._map.keySet();
		Set<Integer> sons = (keys.contains(v1)) 
				 ? this._map.get(v1) : new HashSet<Integer>();

		if (!sons.contains(v2)) {
			sons.add(v2);
			this._map.put(v1, sons);
		}
	}

	public HashMap<Integer, Set<Integer>> get() { return this._map; }
	
	public String toString()
	{
		Set<Integer> set = this._map.keySet();
		int[] keys = set.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(keys);

		String format = "\r\n	%d = %s";
		StringBuffer sb = new StringBuffer();
		for (int key : keys)
		{
			Set<Integer> vals = this._map.get(key);
			String str = String.format(format, key, vals.toString());
			sb.append(str);
		}
		sb.insert(0,"{").append("\r\n}");
		
		return sb.toString();
	}
}

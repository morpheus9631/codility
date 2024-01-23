package com.example.CountVisibleNodesInBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeUtils 
{
  public static String toJSON(Tree T)
  {
    if (T == null) return "null";
    String json = String.format("{%s}", toJSONSub(T));
    return json;
  }
  
  private static String toJSONSub(Tree T)
  {
    String format = ":{%s,%s}";
    if ((T.l   != null && T.r   != null && 
         T.l.l == null && T.l.r == null && T.r.l == null && T.r.r == null)
     || (T.l   == null && T.r   != null && T.r.l == null && T.r.r == null)
     || (T.l   != null && T.r   == null && T.l.l == null && T.l.r == null)) 
    {
      format = ":[%s,%s]";
    }
    
    String lstr = "null";
    if (T.l != null) lstr = toJSONSub(T.l); 
    
    String rstr = "null"; 
    if (T.r != null) rstr = toJSONSub(T.r); 
      
    String outstr = String.format("\"%d\"", T.x);
    if (lstr != "null" || rstr != "null") {
      outstr += String.format(format, lstr, rstr);
    }
    return outstr;
  }
  
  // ---------------------------------------------------------------------------
  
  public static List<Integer> toList(Tree T)
  {
    if (T == null) return null;

    List<Integer> list = new ArrayList<Integer>();
    
    LinkedList<Tree> queue = new LinkedList<Tree>();
    queue.add(T);
    
    while (!queue.isEmpty()) 
    {
      Tree tmp = queue.removeFirst();
      if (tmp == null) {
        list.add(null);
        continue;
      }
      list.add(tmp.x);
      
      if (tmp.l != null || tmp.r != null) {
        queue.add(tmp.l);
        queue.add(tmp.r);
      }
    }
    
    return list;
  }

  
}

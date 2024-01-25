package com.codility.count_visible_nodes;

public class TestCase02 implements TestCase 
{
  @Override
  public Tree getCase()
  {
    Tree T = new Tree();
    T.x = 8;

    T.l = new Tree();
    T.l.x = 2;

    T.r = new Tree();
    T.r.x = 6;
    
    T.l.l = new Tree();
    T.l.l.x = 8;

    T.l.r = new Tree();
    T.l.r.x = 7;
    return T;
  }

  @Override
  public int getReturn() {
    return 2;
  }

}

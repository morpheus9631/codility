package main.MonkeyJumpCrossRiver;

public class TestCase02 implements TestCase 
{
  @Override
  public int getD() {
    return 1;
  }

  @Override
  public int[] getCase() {
    return new int[] { 3, 2, 1 };
  }
  
  @Override
  public int getReturn() {
    return 3;
  }
}

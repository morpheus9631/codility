package main.MonkeyJumpCrossRiver;

public class TestCase01 implements TestCase 
{
  @Override
  public int getD() {
    return 3;
  }

  @Override
  public int[] getCase() {
    return new int[] { 1, -1, 0, 2, 3, 5 };
  }
  
  @Override
  public int getReturn() {
    return 2;
  }
}

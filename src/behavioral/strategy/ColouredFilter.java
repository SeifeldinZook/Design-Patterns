package behavioral.strategy;

public class ColouredFilter implements Filter {

  @Override
  public void filter(String fileName) {
    System.out.println("Apply Coloured Filter");
  }
}

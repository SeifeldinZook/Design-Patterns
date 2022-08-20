package behavioral.strategy;

public class BlackWhiteFilter implements Filter {

  @Override
  public void filter(String fileName) {
    System.out.println("Apply Black & White Filter");
  }
}

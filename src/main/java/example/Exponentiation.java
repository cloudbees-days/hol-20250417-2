package example;

public class Exponentiation {
  public int calc(int x, int y) {
    int exp = 1;
    for (; y != 0; y--) {
    exp = new Mul().calc(exp, x);
    }
    return exp;
  }
}

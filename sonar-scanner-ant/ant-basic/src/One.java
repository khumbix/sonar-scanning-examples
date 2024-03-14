public class One {
  String message = "test";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
  }
}

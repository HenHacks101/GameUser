class Main {
  public static void main(String[] args) {
GameUser one = new GameUser ("name 1");
GameUser two = new GameUser ("name 2");


    one.takeDamage(10, 5);
      System.out.println(one.takeDamage());
    two.heal(20, 45);
    System.out.println(one.getHealth());
      System.out.println(two.getHealth());
  }
}
public class GameUser {
  int level;
  String username;
  double health;


  
  public  GameUser(String name){
 level = 1;
  health = 100.0;
  username = name;
    
  }
  public double getHealth(){
return health;
  
    
  }

  public double takeDamage(double amount){
health = health - amount;
  return amount;
    
  }
public double heal(double amount);{
  health = health + amount;
return health;
}
  
}
//同时能进行物理和魔法伤害的英雄
public class ADAPHero implements AD,AP{
  
    
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
  
    
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
  
}
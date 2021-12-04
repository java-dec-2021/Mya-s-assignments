
public class Test {
public static void main(String[] args) {
    Ninja n = new Ninja();
    Wizard w= new Wizard();
    Samurai s = new Samurai();
    Human h = new Human();
    
    n.steal(n);
    n.runAway();

    s.meditate();
    s.deathBlow(s);
    h.attackHuman(s);
    System.out.println("Numbe of Samurai: " + Samurai.howMany());
    
    
    w.heal(w);
    w.fireball(w);
    
    h.attackHuman(h);
}
    
}
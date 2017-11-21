import com.sun.org.apache.xpath.internal.SourceTree;

public class TestClass
{
    public static void main(String[] args)
    {
        System.out.println("Weapon without any addition");
        IWeapon weapon = new Weapon();

        weapon.makeWeapon();

        System.out.println("\n" + "Rifle with additions");
        weapon = new ScopeDecorator(weapon);
        weapon = new Stock(weapon);
        weapon = new GrenadeLaucherDecorator(weapon);

      //  scope = new Stock(scope);
     //   scope = new GrenadeLaucherDecorator(scope);


       //


        weapon.makeWeapon();
      //  scope.makeWeapon();

    }
}

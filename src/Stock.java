public class Stock extends WeaponDecorator
{
    public Stock(IWeapon decoratedWeapon) {
        super(decoratedWeapon);
    }

    @Override
    public void makeWeapon() {
        decoratedWeapon.makeWeapon();
        setRedBorder(decoratedWeapon);
    }

    private void setRedBorder(IWeapon decoratedWeapon)
    {
        System.out.println("Stock added");
    }
}

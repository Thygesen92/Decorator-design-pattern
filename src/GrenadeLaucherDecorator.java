public class GrenadeLaucherDecorator extends WeaponDecorator
{
    public GrenadeLaucherDecorator(IWeapon decoratedWeapon) {
        super(decoratedWeapon);
    }

    @Override
    public void makeWeapon() {
        decoratedWeapon.makeWeapon();
        setRed(decoratedWeapon);
    }

    private void setRed(IWeapon decoratedWeapon)
    {
        System.out.println("Grenadelauncer added");
    }
}

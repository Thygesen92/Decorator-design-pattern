public class ScopeDecorator extends WeaponDecorator
{
    public ScopeDecorator(IWeapon decoratedWeapon) {
        super(decoratedWeapon);
    }

    @Override
    public void makeWeapon() {
        decoratedWeapon.makeWeapon();
        setRedBorder(decoratedWeapon);
    }

    private void setRedBorder(IWeapon decoratedWeapon)
    {
        System.out.println("Scope added");
    }
}

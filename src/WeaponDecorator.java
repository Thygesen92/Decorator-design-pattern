public abstract class WeaponDecorator implements IWeapon
{
    protected IWeapon decoratedWeapon;

    public WeaponDecorator(IWeapon decoratedWeapon){
        this.decoratedWeapon = decoratedWeapon;
    }

    public void makeWeapon(){
        decoratedWeapon.makeWeapon();
    }
}

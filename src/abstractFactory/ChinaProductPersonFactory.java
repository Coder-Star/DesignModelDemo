package abstractFactory;

public class ChinaProductPersonFactory extends AbstractProductPersonFactory {
    @Override
    public AbstractPerson product() {
        return new ChinaPerson();
    }
}

package abstractFactory;

public class EnglandProductPersonFactory extends AbstractProductPersonFactory {
    @Override
    public AbstractPerson product() {
        return new EnglandPerson();
    }
}

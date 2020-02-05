package components;

public class Tyre extends Components{

    private TyreType tyreType;

    public Tyre(String make, String model, TyreType tyreType) {
        super(make, model);
        this.tyreType = tyreType;
    }

    public TyreType getTyreType() {
        return tyreType;
    }

}

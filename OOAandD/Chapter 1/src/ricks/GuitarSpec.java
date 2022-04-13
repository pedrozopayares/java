package ricks;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if (otherSpec.getBuilder() != null && !otherSpec.getBuilder().equals(builder)) {
            return false;
        }
        if (!otherSpec.getModel().equals(model)) {
            return false;
        }
        if (otherSpec.getType() != null && !otherSpec.getType().equals(type)) {
            return false;
        }
        if (otherSpec.getNumStrings() != 0 && otherSpec.getNumStrings() != numStrings) {
            return false;
        }
        if (otherSpec.getBackWood() != null && !otherSpec.getBackWood().equals(backWood)) {
            return false;
        }
        if (otherSpec.getTopWood() != null && !otherSpec.getTopWood().equals(topWood)) {
            return false;
        }
        return true;
    }
}

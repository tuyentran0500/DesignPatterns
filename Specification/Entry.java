package Specification;

public abstract class Entry implements IEntry {
    protected String name;
    protected String extension;
    protected int size;

    public String getName() {
        return name;
    }
    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }
}

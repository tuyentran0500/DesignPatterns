package Specification;

public class File  extends Entry {
    public File(String name, String extentsion){
        this.name = name;
        this.extension = extentsion;
        this.size = name.length();
    }

    @Override
    public boolean isDirectory() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + "." + this.extension;
    }
}

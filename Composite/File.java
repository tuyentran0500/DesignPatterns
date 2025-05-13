package Composite;

public class File implements FileSystemComponent {
    private int size;
    private String fileName;

    public File(String filename, int size){
        this.fileName = filename;
        this.size = size;
    }
    @Override
    public void showDetails() {
        System.out.println("File name: " + fileName + ", size: " + size);
    }

    @Override
    public int getSize() {
        return size;
    }
    
}

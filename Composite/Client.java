package Composite;

public class Client {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt", 10);
        FileSystemComponent file2 = new File("File2.txt", 20);
        FileSystemComponent file3 = new File("File3.txt", 30);

        Directory dir1 = new Directory("Dir1");
        Directory dir2 = new Directory("Dir2");

        dir1.addComponent(file1);
        dir1.addComponent(file2);

        dir2.addComponent(file3);
        dir2.addComponent(dir1);

        System.out.println("Showing details of Dir2:");
        dir2.showDetails();

        System.out.println("\\nTotal size of Dir2: " + dir2.getSize() + "KB");
    }
}

package writer;

public class NiceWriterlmpl implements Writer{
    @Override
    public void write(String s) {
        System.out.println("The String is " + s);
    }
}

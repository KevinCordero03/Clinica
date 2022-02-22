package writer;

public class SimpleWriterlmpl implements Writer{
    @Override
    public void write(String s) {
        System.out.println("+++++-->" + s);
    }
}

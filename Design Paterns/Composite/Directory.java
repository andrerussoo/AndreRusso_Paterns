
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long total = 0;

        for (FileSystemComponent component : components) {
            total += component.getSize();
        }

        return total;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + name + "/");

        for (int i = 0; i < components.size(); i++) {

            FileSystemComponent component = components.get(i);

            String symbol = (i == components.size() - 1) ? "└─ " : "├─ ";

            String nextIndentation =
                    indentation + (i == components.size() - 1 ? "   " : "│  ");

            if (component instanceof Directory) {
                System.out.print(indentation + symbol);
                ((Directory) component).display(nextIndentation);
            } else {
                component.display(indentation + symbol);
            }
        }
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }
}

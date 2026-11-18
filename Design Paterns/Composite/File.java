
public class File implements FileSystemComponent {

    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void display(String indentation) {
        System.out.printf("%s%s (%.1f MB)%n",
                indentation, name, size / 1_000_000.0);
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException(
                "Não é possível adicionar componentes a um arquivo.");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException(
                "Não é possível remover componentes de um arquivo.");
    }
}


public class Main {

    public static void main(String[] args) {

        Directory root = new Directory("root");

        Directory docs = new Directory("docs");

        docs.add(new File("projeto.pdf", 2_000_000));
        docs.add(new File("relatorio.docx", 1_000_000));

        Directory fotos = new Directory("fotos");

        fotos.add(new File("vacacao.jpg", 3_000_000));
    
        Directory familia = new Directory("familia");

        familia.add(new File("casal.jpg", 2_000_000));
        familia.add(new File("filhos.jpg", 1_000_000));

        fotos.add(familia);


        root.add(docs);
        root.add(fotos);
        root.add(new File("readme.txt", 500_000));

        root.display("");

        System.out.printf("%nTamanho total: %.1f MB%n",
                root.getSize() / 1_000_000.0);

        System.out.printf("Tamanho da pasta 'docs': %.1f MB%n",
                docs.getSize() / 1_000_000.0);

        System.out.printf("Tamanho da pasta 'familia': %.1f MB%n",
                familia.getSize() / 1_000_000.0);
    }
}

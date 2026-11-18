
public class Main {

    public static void main(String[] args) {

      
        Computador basico = new ComputadorBuilder()
                .setProcessador("Intel Core i5")
                .setMemoriaRAM("8GB")
                .setArmazenamento("256GB SSD")
                .build();

        
        Computador gamer = new ComputadorBuilder()
                .setProcessador("Intel Core i9")
                .setMemoriaRAM("32GB")
                .setArmazenamento("1TB SSD")
                .setPlacaVideo("NVIDIA RTX 4070")
                .build();

    
        System.out.println("=== Computador Básico ===");
        basico.exibirDados();

        System.out.println();

        System.out.println("=== Computador Gamer ===");
        gamer.exibirDados();
    }
}

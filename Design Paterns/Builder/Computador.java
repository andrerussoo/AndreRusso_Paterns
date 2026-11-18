
public class Computador {

    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaVideo;
    private String sistemaOperacional;

    public Computador(String processador, String memoriaRAM,
                      String armazenamento, String placaVideo,
                      String sistemaOperacional) {

        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaVideo = placaVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void exibirDados() {
        System.out.println("Processador: " + processador);
        System.out.println("RAM: " + memoriaRAM);
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Placa de vídeo: " + placaVideo);
        System.out.println("Sistema operacional: " + sistemaOperacional);
    }
}

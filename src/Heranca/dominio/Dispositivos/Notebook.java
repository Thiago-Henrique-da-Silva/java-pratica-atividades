package Heranca.dominio.Dispositivos;

    //criando a classe Notebook filha de Dispositivo

public class Notebook extends Dispositivo {
    private  int memoriaRAM;

    //herdando atributos da classe pai

    public Notebook(String marca, String modelo, int memeriaRAM) {
        super(marca, modelo);
        this.memoriaRAM = memeriaRAM;
    }

    public void compilarCodigo() {
        if (!isLigado()) {
            System.out.println("ligue o dispositivo para compilar o codigo.");
            return;
        }
        System.out.println("compilando o codigo...");
    }
}

package Heranca.dominio.Dispositivos;

//criando a classse Celular filha de Dispositivo

public class Celular extends Dispositivo {
    private  String numeroTelefone;

    //herdando atributos da classe pai

    public Celular(String marca,String modelo, String numeroTelefone) {
        super(marca, modelo);
        this.numeroTelefone = numeroTelefone;
    }

    public void fazerLigacao(String numero) {
        if (!isLigado()) {
            System.out.println("ligue o dispositivo para fazer ligações.");
            return;
        }
        System.out.println("ligando para o numero " + numero + "...");
    }

    @Override
    public String toString() {
        return "marca: " + getMarca() + "\nmodelo: " + getModelo() + "\n ,numero: " + numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}

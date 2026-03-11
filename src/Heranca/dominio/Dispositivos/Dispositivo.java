package Heranca.dominio.Dispositivos;

public class Dispositivo {
    private String marca;
    private String modelo;
    private boolean ligado;

    //Se quero saber se é verdadeiro uso o nome direto.
    //if (ligado) significa está ligado.

    //Se quero saber se é falso → uso negação.
    //if (!ligado) significa não está ligado.

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void ligar(){
        //verificando se ESTÁ ligado.
        if (ligado) {
            System.out.println("o dispositivo ja está ligado.");
            return;
        }
        System.out.println("Ligando o dispositivo.");
        ligado = true;
    }

    public void desligar(){
        //verificando se ESTÁ desligado.
        if (!ligado) {
            System.out.println("o dispositivo ja  está deligado.");
            return;
        }
        System.out.println("Desligando o dispositivo.");
        ligado = false;
    }

    @Override
    public String toString() {
        return " marca : " + marca + "\nmodelo : " + modelo + "\nligado : " + ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}

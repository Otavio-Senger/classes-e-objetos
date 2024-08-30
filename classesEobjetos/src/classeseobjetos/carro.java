
package classeseobjetos;


public class carro {
    String marca;
    String modelo;
    int ano;
    int velocidade = 0;
    int acelerar;
    int desacelerar;
    int velocidadefinal;

    public carro(String marca, String modelo, int ano, int acelerar, int desacelerar) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.acelerar = acelerar;
        this.desacelerar = desacelerar;
        this.velocidadefinal = velocidade + acelerar - desacelerar;

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAcelerar() {
        return acelerar;
    }

    public void setAcelerar(int acelerar) {
        this.acelerar = acelerar;
    }

    public int getDesacelerar() {
        return desacelerar;
    }

    public void setDesacelerar(int desacelerar) {
        this.desacelerar = desacelerar;
    }

    public int getVelocidadefinal() {
        return velocidadefinal;
    }

    public void setVelocidadefinal(int velocidadefinal) {
        this.velocidadefinal = velocidadefinal;
    }
    
    
    
    
    
}


package classeseobjetos;

public class retangulo {
    double altura;
    double largura;
    double area = 0;
    double perimetro = 0;

    public retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
        area = altura * largura;
        perimetro = altura + largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    
}

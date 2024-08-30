
package classeseobjetos;

public class estudante {
    String nome;
    int idade;
    String diciplinasJaMatriculadas;
    String paramatricular;
    String diciplinasMatricualdas;

    public estudante(String nome, int idade, String diciplinasJaMatriculadas, String paramatricular) {
        this.nome = nome;
        this.idade = idade;
        this.diciplinasJaMatriculadas = diciplinasJaMatriculadas;
        this.paramatricular = paramatricular;
        diciplinasMatricualdas = diciplinasJaMatriculadas + ", " + paramatricular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDiciplinasJaMatriculadas() {
        return diciplinasJaMatriculadas;
    }

    public void setDiciplinasJaMatriculadas(String diciplinasJaMatriculadas) {
        this.diciplinasJaMatriculadas = diciplinasJaMatriculadas;
    }

    public String getParamatricular() {
        return paramatricular;
    }

    public void setParamatricular(String paramatricular) {
        this.paramatricular = paramatricular;
    }

    public String getDiciplinasMatricualdas() {
        return diciplinasMatricualdas;
    }

    public void setDiciplinasMatricualdas(String diciplinasMatricualdas) {
        this.diciplinasMatricualdas = diciplinasMatricualdas;
    }
    
    
    
}

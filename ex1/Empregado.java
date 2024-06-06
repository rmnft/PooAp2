public class Empregado {
    private int matricula;
    private String nome;
    private float salario;

    public Empregado(int matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public void reajusteSalario() {
        if (salario <= 1000.0f) {
            salario *= 1.2f;
        } else if (salario <= 2000.0f) {
            salario *= 1.15f;
        } else if (salario <= 3000.0f) {
            salario *= 1.1f;
        } else {
            salario *= 1.05f;
        }
    }
}
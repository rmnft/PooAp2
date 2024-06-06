package ex3.exerciciosrp;

public class Aluno {
    private int nota1;
    private int nota2;
    private int nota3;
    private int media;

    public Aluno(int nota1, int nota2, int nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        calcularMedia();
    }

    private void calcularMedia() {
        this.media = (nota1 + nota2 + nota3) / 3;
    }

    public int getMedia() {
        return media;
    }

    public String getNota() {
        if(media < 4) {
            return "E";
        } else if(media < 5) {
            return "D";
        } else if(media < 7) {
            return "C";
        } else if(media < 8) {
            return "B";
        } else {
            return "A";
        }
    }
}

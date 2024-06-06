import java.util.ArrayList;
import java.util.Scanner;

public class EmpregadoDAO {
    private ArrayList<Empregado> empregados;
    private Scanner scanner;

    public EmpregadoDAO() {
        empregados = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void lerDadosEmpregados() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os dados do empregado " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Salário: ");
            float salario = scanner.nextFloat();

            Empregado empregado = new Empregado(matricula, nome, salario);
            empregado.reajusteSalario();
            empregados.add(empregado);
        }
    }

    public void imprimirEmpregadosComSalarioAcimaDe3000() {
        System.out.println("\nEmpregados com salário acima de R$ 3.000,00:");
        for (Empregado empregado : empregados) {
            if (empregado.getSalario() > 3000.0f) {
                System.out.println("Matrícula: " + empregado.getMatricula() +
                        ", Nome: " + empregado.getNome().toUpperCase());
            }
        }
    }
}
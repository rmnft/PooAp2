public class Main {
    public static void main(String[] args) {
        EmpregadoDAO empregadoDAO = new EmpregadoDAO();
        empregadoDAO.lerDadosEmpregados();
        empregadoDAO.imprimirEmpregadosComSalarioAcimaDe3000();
    }
}
public class SistemaAvaliacao {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova: "));
        double notaTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho: "));
        
        double media = (nota1 + nota2 + notaTrabalho) / 3;
        
        String status = media >= 6 ? "Aprovado" : "Reprovado";
        
        JOptionPane.showMessageDialog(null, "Média: " + media + "\nStatus: " + status);
    }
}
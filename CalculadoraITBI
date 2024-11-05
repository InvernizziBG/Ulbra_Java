public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transação do imóvel: "));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal do imóvel: "));
        double percentualITBI = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do ITBI: "));

        double valorBase = Math.max(valorTransacao, valorVenal);
        double impostoITBI = (percentualITBI / 100) * valorBase;

        JOptionPane.showMessageDialog(null, "O imposto ITBI é: R$ " + impostoITBI);
    }
}

import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F): ").toUpperCase();
        int anosContribuicao = Integer.parseInt(JOptionPane.showInputDialog("Digite seus anos de contribuição: "));

        boolean podeAposentar = (sexo.equals("M") && (idade >= 65 || anosContribuicao >= 30)) || 
                                 (sexo.equals("F") && (idade >= 62 || anosContribuicao >= 25));
        
        if (podeAposentar) {
            JOptionPane.showMessageDialog(null, "Você pode se aposentar.");
        } else {
            int anosFaltando = sexo.equals("M") ? (65 - idade) : (62 - idade);
            JOptionPane.showMessageDialog(null, "Faltam " + anosFaltando + " anos para a aposentadoria.");
        }
    }
}

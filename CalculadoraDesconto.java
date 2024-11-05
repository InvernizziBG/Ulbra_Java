import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        
        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();
        
        double desconto = (porcentagemDesconto / 100) * valorProduto;
        double precoFinal = valorProduto - desconto;
        
        System.out.printf("Valor do desconto: R$ %.2f\n", desconto);
        System.out.printf("Preço final: R$ %.2f\n", precoFinal);
        
        scanner.close();
    }
}

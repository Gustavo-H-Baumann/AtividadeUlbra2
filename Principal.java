import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String marcaCarro = JOptionPane.showInputDialog("Informe a marca do carro:");
        String modeloCarro = JOptionPane.showInputDialog("Informe o modelo do carro:");
        int anoCarro = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro:"));
        int numeroPortas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de portas do carro:"));
        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, numeroPortas);

        String marcaMoto = JOptionPane.showInputDialog("Informe a marca da moto:");
        String modeloMoto = JOptionPane.showInputDialog("Informe o modelo da moto:");
        int anoMoto = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da moto:"));
        int cilindradas = Integer.parseInt(JOptionPane.showInputDialog("Informe as cilindradas da moto:"));
        Moto moto = new Moto(marcaMoto, modeloMoto, anoMoto, cilindradas);

        System.out.println("Informações do Carro:\n" + carro.informacoesVeiculo());
        System.out.println("/n");
        System.out.println("Informações da Moto:\n" + moto.informacoesVeiculo());
    }
}


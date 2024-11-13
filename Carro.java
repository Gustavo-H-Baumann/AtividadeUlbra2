public class Carro extends Veiculo {
    public int numeroPortas;  

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);  
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String informacoesVeiculo() {
        return "Marca: " + marca +
               ", Modelo: " + modelo +
               ", Ano: " + getAno() +
               ", Número de Portas: " + numeroPortas;
    }
}

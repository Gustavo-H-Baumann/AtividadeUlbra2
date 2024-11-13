public class Moto extends Veiculo {
    private int cilindradas; 

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);  
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        if (cilindradas > 0) {
            this.cilindradas = cilindradas;
        } else {
            throw new IllegalArgumentException("Número inválido. Deve ser um número positivo.");
        }
    }

    @Override
    public String informacoesVeiculo() {
        return "Marca: " + marca +
               ", Modelo: " + modelo +
               ", Ano: " + getAno() +
               ", Cilindradas: " + getCilindradas();
    }
}

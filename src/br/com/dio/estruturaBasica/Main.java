package br.com.dio.estruturaBasica;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("Vermelho");
        carro.setModelo("Fusca");
        carro.setCapacidadeDoTanque(41.0);
        System.out.printf("O %s %s tem capacidade de %.2fL\n", carro.getModelo(), carro.getCor(), carro.getCapacidadeDoTanque());
        System.out.printf("E com a gasoli a R$4,81, gastaria %.2f para encher o tanque.", carro.encherOTanque(4.81));
    }
}

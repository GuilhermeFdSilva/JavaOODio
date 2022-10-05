package br.com.dio.estruturaBasica;

public class Carro {
    private String cor;
    private String modelo;
    private Double capacidadeDoTanque;
    public Carro(){}
    public Carro(String cor, String modelo, Double capacidadeDoTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }
    public void setCapacidadeDoTanque(Double capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }
    public Double encherOTanque(Double precoGasolina){
        return precoGasolina * this.capacidadeDoTanque;
    }
}

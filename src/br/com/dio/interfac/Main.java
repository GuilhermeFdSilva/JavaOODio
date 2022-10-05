package br.com.dio.interfac;

public class Main implements OperacoesMatematicas{
    public static void main(String[] args) {

    }
    @Override
    public void sum(int a, int b) {
        System.out.println("Soma: " + (a + b));
    }
    @Override
    public void sub(int a, int b) {
        System.out.println("Subitração: " + (a - b));
    }
    @Override
    public void mult(int a, int b) {
        System.out.println("Multiplicação: " + (a * b));
    }
    @Override
    public void div(int a, int b) {
        System.out.println("Divisão: " + ((double)a / b));
    }
}

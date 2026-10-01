package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractFactory fabricaModerna = FactoryMethod.getInstance().getFabrica("MODERNA");
        Cliente clienteModerno = new Cliente(fabricaModerna);
        System.out.println(clienteModerno.descreverCadeira());
        System.out.println(clienteModerno.descreverMesa());

        AbstractFactory fabricaClassica = FactoryMethod.getInstance().getFabrica("CLASSICA");
        Cliente clienteClassico = new Cliente(fabricaClassica);
        System.out.println(clienteClassico.descreverCadeira());
        System.out.println(clienteClassico.descreverMesa());

        System.out.println("Mesma instância do FactoryMethod (Singleton)? "
                + (FactoryMethod.getInstance() == FactoryMethod.getInstance()));
    }
}


package lista2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Zoo meuZoo = new Zoo();
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("1. Add Cat | 2. Listar | 3. Remover | 4. Som | 5. Habilidade | 6. Sair");
            opcao = ler.nextInt();

            if (opcao == 1) { // Adicionar
                System.out.print("ID: ");
                long id = ler.nextLong();
                System.out.print("Idade: ");
                int idade = ler.nextInt();
                System.out.print("Peso: ");
                double peso = ler.nextDouble();
                meuZoo.addAnimal(new Cat(id, idade, peso)); // Exemplo com Cat
            } else if (opcao == 2) { // Listar
                for (Animal a : meuZoo.listAnimals()) {
                    System.out.println("ID: " + a.getId() + " | Nome: " + a.getName());
                }
            } else if (opcao == 4) { // Emitir Som (Busca por ID)
                System.out.print("Digite o ID: ");
                long idBusca = ler.nextLong();
                for (Animal a : meuZoo.listAnimals()) {
                    if (a.getId() == idBusca) {
                        System.out.println(a.getName() + " says " + a.sound());
                    }
                }
            }
            // Opção 5: Testar Habilidade
            else if (opcao == 5) {
                System.out.print("ID: ");
                long idHab = ler.nextLong();
                System.out.print("Habilidade para testar: ");
                String hab = ler.next();
                for (Animal a : meuZoo.listAnimals()) {
                    if (a.getId() == idHab) {
                        System.out.println(a.performAbility(hab));
                    }
                }
            }
            ler.close();
        }
    }
}
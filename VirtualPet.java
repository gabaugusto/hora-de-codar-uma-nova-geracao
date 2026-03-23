import java.util.Scanner;

class VirtualPet {
    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;

    public VirtualPet(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome -= 10;
        System.out.println(nome + " foi alimentado. O nível de fome diminuiu.");
    }

    public void brincar() {
        nivelFelicidade += 10;
        System.out.println(nome + " está brincando e se sentindo mais feliz.");
    }

    public void verificarStatus() {
        System.out.println("Status atual de " + nome + ":");
        System.out.println("Nível de fome: " + nivelDeFome);
        System.out.println("Nível de felicidade: " + nivelFelicidade);
    }

    public void passarTempo() {
        nivelDeFome += 5;
        System.out.println(nome + " está ficando mais faminto com o passar do tempo.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Animal de Estimação Virtual!");
        System.out.println("Digite o nome do seu animal de estimação:");
        String nomePet = scanner.nextLine();

        VirtualPet pet = new VirtualPet(nomePet);

        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Alimentar " + nomePet);
            System.out.println("2. Brincar com " + nomePet);
            System.out.println("3. Verificar o status de " + nomePet);
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    pet.alimentar();
                    break;
                case 2:
                    pet.brincar();
                    break;
                case 3:
                    pet.verificarStatus();
                    break;
                case 4:
                    System.out.println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!");
                    return;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }

            pet.passarTempo(); // Simula o tempo que passa após cada ação
        }
    }
}

package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.AbrigoService_v1;
import br.com.alura.service.PetService_v1;
import java.util.Scanner;

public class AdopetConsoleApplication {

    public static void main(String[] args) {

          ClientHttpConfiguration client = new ClientHttpConfiguration();
        

        AbrigoService_v1 abrigoService = new AbrigoService_v1(client);
        PetService_v1 petService = new PetService_v1(client);

        System.out.println("##### BOAS VINDAS AO SISTEMA ADOPET CONSOLE #####");
        try {
            int opcaoEscolhida = 0;
            while (opcaoEscolhida != 5) {
                System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
                System.out.println("1 -> Listar abrigos cadastrados");
                System.out.println("2 -> Cadastrar novo abrigo");
                System.out.println("3 -> Listar pets do abrigo");
                System.out.println("4 -> Importar pets do abrigo");
                System.out.println("5 -> Sair");

                String textoDigitado = new Scanner(System.in).nextLine();
                opcaoEscolhida = Integer.parseInt(textoDigitado);

                if (opcaoEscolhida == 1) {

                    abrigoService.listarAbrigo();

                } else if (opcaoEscolhida == 2) {

                    abrigoService.cadastrarAbrigo();

                } else if (opcaoEscolhida == 3) {

                    petService.listarPetsDoAbrigo();

                } else if (opcaoEscolhida == 4) {

                    petService.importarPetsDoAbrigo();

                } else if (opcaoEscolhida == 5) {
                    break;
                } else {
                    System.out.println("NÚMERO INVÁLIDO!");
                    opcaoEscolhida = 0;
                }
            }
            System.out.println("Finalizando o programa...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

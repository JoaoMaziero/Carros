package Test;

import domínio.Menu;

import java.util.Scanner;

public class CheckpointFirstApplication {
    public static void main(String[] args) {

        Menu mostrarMenu = new Menu();
        String[][] arrayCarros = new String[6][4];

        arrayCarros[0][0] = "GM";
        arrayCarros[0][1] = "Suburbano";
        arrayCarros[0][2] = "Malibu";
        arrayCarros[0][3] = "Silverado";
        arrayCarros[1][0] = "Hyundai";
        arrayCarros[1][1] = "Azera";
        arrayCarros[1][2] = "Sonata";
        arrayCarros[1][3] = "Veloster";
        arrayCarros[2][0] = "Volkswagen";
        arrayCarros[2][1] = "Golfe";
        arrayCarros[2][2] = "Jetta";
        arrayCarros[2][3] = "Pólo";
        arrayCarros[3][0] = "Audi";
        arrayCarros[3][1] = "A4";
        arrayCarros[3][2] = "Q7";
        arrayCarros[3][3] = "R8";
        arrayCarros[4][0] = "Mercedes";
        arrayCarros[4][1] = "C 180";
        arrayCarros[4][2] = "C 200";
        arrayCarros[4][3] = "ABL 200";
        arrayCarros[5][0] = "Peugeot";
        arrayCarros[5][1] = "206";
        arrayCarros[5][2] = "208";
        arrayCarros[5][3] = "2008";
        Scanner teclaSair = new Scanner(System.in);
        boolean sair = true;

        while (sair) {
            mostrarMenu.menu(" 1-----> Listagem de Veiculos          0----->Sair");
            int leituraTeclado = teclaSair.nextInt();
            if (leituraTeclado == 1) {
                for (int i = 0; i < arrayCarros.length; i++) {
                    System.out.print(" " + (i+1) + " --> " + arrayCarros[i][0] + " ");
                }
                leituraTeclado = teclaSair.nextInt();
                System.out.println("\n Veiculos Disponiveis: ");
                for (int j = 0; j < arrayCarros[leituraTeclado].length; j++) {
                    System.out.print(" "+arrayCarros[(leituraTeclado-1)][j]+ ", ");
                }
                System.out.println("\n ------------------------------------");
                System.out.println("Deseja continuar 1 ---> Sim       0 ---> Não");
                leituraTeclado = teclaSair.nextInt();
            }
            if (leituraTeclado == 0) {
                sair = false;
            }
        }

    }
}
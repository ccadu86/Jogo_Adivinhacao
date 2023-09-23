import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int t = 0;
        JOptionPane.showMessageDialog(null, "Bem vindo ao JOGO da ADIVINHAÇÂO \nSua tarefa será adivinhar o numero aleatório gerado pelo sistema \nVoce tem apenas 5 tentativas");
        while (t == 0) {
            Numeros valor = new Numeros();
            int valorAleatorio = valor.numAleatorio();
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] - Iniciar o jogo \n[2] - Sair do jogo \n\n Informe o que deseja"));
            int s = 0;
            int cont = 0;
            int c;
            while (s == 0) {
                switch (menu) {
                    case 1:
                        c = cont + 1;
                        int chute = Integer.parseInt(JOptionPane.showInputDialog(null, "Chute um valor \nTentativa: 0"+ c));
                        if (valor.numCompara(valorAleatorio, chute) == 0) {
                            s = 1;
                        }                        ;
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "SAINDO...");
                        s = 1;
                        t = 1;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor Invalido");
                }
                cont++;
                if (cont == 5) {
                    JOptionPane.showMessageDialog(null, "Voce usou todas as tentativas, o numero era: " + valorAleatorio + "\n\nUm novo numero será gerado");
                    valorAleatorio = valor.numAleatorio();
                    cont = 0;
                }
            }
        }
    }
}
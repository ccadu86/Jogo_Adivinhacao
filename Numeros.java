import javax.swing.*;
import java.util.Random;

public class Numeros {
    private int num;

    public Numeros(){

    }
    Random numAle = new Random();

    public int numAleatorio(){
        num = numAle.nextInt(101);
        return num;
    }

    public int numCompara(int x, int y){
        if (x == y){
            JOptionPane.showMessageDialog(null, "PARABENS... VOCE ACERTOU O NUMERO");
            return 0;
        }
        else if (x > y){
            JOptionPane.showMessageDialog(null, "O numero gerado é MAIOR");
            return 1;
        }
        else{
            JOptionPane.showMessageDialog(null, "O numero gerado é MENOR");
            return 2;
        }
    }
}


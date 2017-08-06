package ii.proyecto;

import static java.lang.Thread.sleep;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class comienzo_hilos5 extends Thread {
    int PosiInicioX, limite;
    JLabel competidor;
    JTextArea txtArea;
    public comienzo_hilos5(int PosiInicioX, int limite, JLabel competidor, JTextArea txtArea){
        this.PosiInicioX= PosiInicioX;
        this.limite=limite ;
        this.competidor=competidor;
        this.txtArea=txtArea;
    }
    
    @Override
    public void run (){ //constructor 
        Random rand = new Random();
        int rnd=rand.nextInt(50-20+1)+20;
        int inicio = (int) new GregorianCalendar().getTimeInMillis(); 
        for (int i=limite-100; i>-38 ;i--){
            competidor.setBounds(PosiInicioX, i, 73, 100);
            try{
                sleep(rnd);
            }catch(InterruptedException e){
            }
        }
        int fin = (int) new GregorianCalendar().getTimeInMillis();
        txtArea.append("Player 5: "+(fin - inicio)+" ms\n");
    }
}
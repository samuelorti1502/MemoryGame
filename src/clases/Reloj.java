package clases;

import static java.lang.Thread.sleep;
import java.util.Calendar;
import javax.swing.JLabel;

public class Reloj implements Runnable{
    
    private Thread tiempo = null;
    private int  miliseg, seg, min, hora, minuto, segundo;
    boolean estado;
    Thread hilo;
    
    public Reloj(){
        //tempo();
        hilo = new Thread(this);
        hilo.start();
    }
    
    public String hora(){
        Calendar calendario = Calendar.getInstance();
        setHora(calendario.get(Calendar.HOUR_OF_DAY));
        setMinuto(calendario.get(Calendar.MINUTE));
        setSegundo(calendario.get(Calendar.SECOND));
        
        String hr;
        hr = null;

        hr = (getHora()<=9?"0"+getHora():getHora()) + ":" + (getMinuto()<=9?"0"+getMinuto():getMinuto()) + ":" + (getSegundo()<=9?"0"+getSegundo():getSegundo());
        tempo();
        return hr;
    }
    
    public void tempo() {
        estado = true;

        hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (estado == true) {
                        try {
                            sleep(1);
                            //label.setText(hora());
                            //lblReloj.setFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("alarm clock.ttf").openStream()));
                        } catch (Exception e) {

                        }
                    } else {
                        break;
                    }
                }
            }
        };
        hilo.start();
    }


    public int getMiliseg() {
        return miliseg;
    }

    public void setMiliseg(int miliseg) {
        this.miliseg = miliseg;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}



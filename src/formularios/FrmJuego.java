package formularios;

//package clases;

import clases.Reloj2;
import clases.TableroMemoria;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmJuego {

    private JFrame ventana;
    private JPanel panelPresentacion, panelJuego;
    private int numFilas = 8, numCol = 8, contador, temp, temp2, f1, c1, f2, c2, miliseg, seg, min;
    private int matriz[][], matrizAux[][];
    JLabel fondo, titulo, lblReloj, lblNombre, lblCasillas[][], lblTiempo;
    private ImageIcon Img;
    private Icon icono;
    Thread hilo;
    boolean estado;

    Reloj2 reloj = new Reloj2();
    TableroMemoria tablero = new TableroMemoria();
    FrmLogin usuario = new FrmLogin();

    public FrmJuego() {
        ventana();
    }

    public void tempo(JLabel lblTiempo) {
        estado = true;

        hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (estado == true) {
                        try {
                            sleep(1);
                            if (miliseg >= 1000) {
                                miliseg = 0;
                                seg++;
                            }
                            if (seg >= 60) {
                                miliseg = 0;
                                seg = 0;
                                min++;
                            }
                            if (min >= 60) {
                                miliseg = 0;
                                seg = 0;
                                min = 0;
                            }
                            lblTiempo.setText(((min <= 9) ? "0" + min : min) + ":" + (seg <= 9 ? "0" + seg : seg));
                            miliseg++;
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

    public void ventana() {
        ventana = new JFrame("Memory Game");
        ventana.setSize(800, 800);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        panelPresentacion = new JPanel();
        panelPresentacion.setSize(ventana.getWidth(), ventana.getHeight());
        panelPresentacion.setLocation(0, 0);
        panelPresentacion.setLayout(null);
        panelPresentacion.setVisible(true);
        ventana.add(panelPresentacion);

        // <editor-fold defaultstate="collapsed" desc="Imagen de fondo"> 
        fondo = new JLabel();
        fondo.setSize(ventana.getWidth(), ventana.getHeight());
        fondo.setLocation(0, 0);

        Img = new ImageIcon("./src/images/emoji.png");
        icono = new ImageIcon(Img.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(),
                Image.SCALE_DEFAULT));

        fondo.setIcon(icono);
        fondo.setVisible(true);
        panelPresentacion.add(fondo, 0);
        // </editor-fold>  

        // <editor-fold defaultstate="collapsed" desc="Imagen de titulo">    
        titulo = new JLabel();
        titulo.setSize(300, 150);
        titulo.setLocation(260, 5);
        Img = new ImageIcon("./src/images/titulo.png");
        icono = new ImageIcon(Img.getImage().getScaledInstance(300, 150,
                Image.SCALE_DEFAULT));

        titulo.setIcon(icono);
        titulo.setVisible(true);
        panelPresentacion.add(titulo, 0);
        // </editor-fold>  

        dibujarCasillas();

        // <editor-fold defaultstate="collapsed" desc="Reloj">    
        lblReloj = new JLabel();
        lblReloj.setSize(95, 40);
        lblReloj.setLocation(5, 700);

        reloj.setLblReloj(lblReloj);
        reloj.start();

        lblReloj.setFont(new java.awt.Font("Segoe UI", 0, 18));
        lblReloj.setForeground(new java.awt.Color(102, 255, 0));
        lblReloj.setBackground(Color.black);
        lblReloj.setOpaque(true);

        lblReloj.setVisible(true);
        panelPresentacion.add(lblReloj, 0);
        // </editor-fold>  

        // <editor-fold defaultstate="collapsed" desc="Nombre">    
        lblNombre = new JLabel();
        lblNombre.setText(usuario.getUsuario());
        lblNombre.setSize(95, 40);
        lblNombre.setLocation(5, 20);
        lblNombre.setBackground(Color.black);
        lblNombre.setForeground(Color.white);
        lblNombre.setOpaque(true);

        lblNombre.setVisible(true);
        panelPresentacion.add(lblNombre, 0);

        // </editor-fold>  
        // <editor-fold defaultstate="collapsed" desc="Tiempo">    
        lblTiempo = new JLabel();
        lblTiempo.setSize(95, 40);
        lblTiempo.setLocation(700, 20);
        lblTiempo.setBackground(Color.black);
        lblTiempo.setForeground(Color.white);
        lblTiempo.setOpaque(true);

        tempo(lblTiempo);

        lblTiempo.setVisible(true);
        panelPresentacion.add(lblTiempo, 0);

        // </editor-fold>  
        ventana.setVisible(true);
    }

    public void dibujarCasillas() {
        int posx = 110, posy = 150, ancho = 70, alto = 75;

        lblCasillas = new JLabel[this.numFilas][this.numCol];
        for (int i = 0; i < lblCasillas.length; i++) {
            for (int j = 0; j < lblCasillas[i].length; j++) {
                lblCasillas[i][j] = new JLabel();
                //lblCasillas[i][j].setText(i+","+j);
                lblCasillas[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                lblCasillas[i][j].setForeground(Color.blue);
                lblCasillas[i][j].setBackground(Color.lightGray);
                lblCasillas[i][j].setOpaque(true);

                if (i == 0 && j == 0) {
                    lblCasillas[i][j].setBounds(posx, posy, ancho, alto);
                } else if (i == 0 && j != 0) {
                    lblCasillas[i][j].setBounds(
                            lblCasillas[i][j - 1].getX() + lblCasillas[i][j - 1].getWidth(),
                            posy,
                            ancho, alto);
                } else {
                    lblCasillas[i][j].setBounds(
                            lblCasillas[i - 1][j].getX(),
                            lblCasillas[i - 1][j].getY() + lblCasillas[i - 1][j].getHeight(),
                            ancho, alto);
                }
                /*lblCasillas[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        //btnClick(e);
                        //contador = 0;
                        voltearCasillas(e);

                    }
                });*/

                panelPresentacion.add(lblCasillas[i][j], 0);
            }

        }
        rellenarCasillas();
    }

    public void rellenarCasillas() {
        //TableroMemoria tablero = new TableroMemoria();
        //matriz = tablero.getMataleatorio();
        matriz = tablero.getMatAux();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "   ");
                lblCasillas[i][j].setText(Integer.toString(matriz[i][j]));
                Img = new ImageIcon("./src/images/" + matriz[i][j] + ".png");
                icono = new ImageIcon(Img.getImage().getScaledInstance(70, 75,
                        Image.SCALE_DEFAULT));
                lblCasillas[i][j].setIcon(icono);
            }
            System.out.println("");
        }
        btnClick();
    }

    public void voltearCasillas(MouseEvent e) {
        matriz = tablero.getMataleatorio();
        matrizAux = tablero.getMatAux();
        JLabel lbl = (JLabel) e.getSource();

        // <editor-fold defaultstate="collapsed" desc="For voltear"> 
//        for (int i = 0; i < lblCasillas.length; i++) {
//            for (int j = 0; j < lblCasillas[i].length; j++) {
//                //System.out.print(matriz[i][j] + "   ");
//                if (lbl == (lblCasillas[i][j])) {
//                    if(matrizAux[i][j] == 0){
//                        matrizAux[i][j] = matriz[i][j];
//                        Img = new ImageIcon("./src/images/" + matrizAux[i][j] + ".png");
//                        icono = new ImageIcon(Img.getImage().getScaledInstance(70, 75,
//                                Image.SCALE_DEFAULT));
//                        lblCasillas[i][j].setIcon(icono);
//                        //System.out.println(getContador());
//                        if(contador == 2){
//                            for (int k = 0; k < matriz.length; k++) {
//                                for (int l = 0; l < matriz[k].length; l++) {
//                                    if (matrizAux[k][l] != 0 && matrizAux[k][l] != -1) {
//                                        matrizAux[k][l] = 0;
//                                        Img = new ImageIcon("./src/images/" + matrizAux[k][l] + ".png");
//                                        icono = new ImageIcon(Img.getImage().getScaledInstance(70, 75,
//                                                Image.SCALE_DEFAULT));
//                                        lblCasillas[i][j].setIcon(icono);
//                                        setContador(0);
//                                    }
//                                }
//                            }
//                            System.out.println("Ya volteo dos cartas");
//                            //setContador(0);
//                        }
//                        //System.out.println(contador);
//                    }
//                    
//                }
//            }
//        }
        // </editor-fold> 
        for (int i = 0; i < lblCasillas.length; i++) {
            for (int j = 0; j < lblCasillas[i].length; j++) {
                if (lbl == lblCasillas[i][j]) {
                    if (matrizAux[i][j] == 0) {
                        matrizAux[i][j] = matriz[i][j];
                        Img = new ImageIcon("./src/images/" + matrizAux[i][j] + ".png");
                        icono = new ImageIcon(Img.getImage().getScaledInstance(70, 75,
                                Image.SCALE_DEFAULT));
                        lblCasillas[i][j].setIcon(icono);
                        this.contador++;
                        System.out.println(this.contador);

                        if (contador == 3) {
                            for (int k = 0; k < lblCasillas.length; k++) {
                                for (int l = 0; l < lblCasillas[i].length; l++) {
                                    matrizAux[i][j] = 0;
                                    if (matrizAux[k][l] != 0 /*&& matrizAux[k][l] != -1*/) {
                                        Img = new ImageIcon("./src/images/" + matrizAux[i][j] + ".png");
                                        icono = new ImageIcon(Img.getImage().getScaledInstance(70, 75,
                                                Image.SCALE_DEFAULT));
                                        lblCasillas[i][j].setIcon(icono);
                                        this.contador = 0;
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }

    public void btnClick() {
        matriz = tablero.getMataleatorio();

        for (JLabel[] matriz1 : lblCasillas) {
            for (JLabel matriz11 : matriz1) {
                matriz11.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {

                        for (int k = 0; k < matriz.length; k++) {
                            for (int l = 0; l < matriz[k].length; l++) {
                                if (e.getSource() == lblCasillas[k][l]) {
                                    //System.out.println(contador);
                                    if (contador == 0) {
                                        temp = matriz[k][l];
                                        f1 = k;
                                        c1 = l;
                                        contador = 0;
                                    } else if (contador == 1) {
                                        temp2 = matriz[k][l];
                                        f2 = k;
                                        c2 = l;
                                        //contador = 0;
                                    }
                                    voltearCasilla(k, l);
                                }
                            }
                        }
                        System.out.println("Contador " + contador + " " + temp);
                        System.out.println("Contador " + contador + " " + temp2);

                        if (contador == 3) {
                            System.out.println(temp + " Contador 3");
                            System.out.println(temp2 + " temp2 Contador 3");
                            for (int k = 0; k < matriz.length; k++) {
                                for (int l = 0; l < matriz[k].length; l++) {
                                    //System.out.println(k + "," + l );
                                    if (temp == temp2) {
                                        lblCasillas[f1][c1].setIcon(null);
                                        lblCasillas[f2][c2].setIcon(null);
                                        System.out.println("Match");
                                    } else {
                                        Img = new ImageIcon("./src/images/0.png");
                                        icono = new ImageIcon(Img.getImage().getScaledInstance(70, 75,
                                                Image.SCALE_DEFAULT));
                                        lblCasillas[k][l].setIcon(icono);
                                    }

                                }
                            }

                            contador = 0;
                            //System.out.println(contador);
                        }
                    }
                });
            }
        }
    }

    public void voltearCasilla(int fil, int col) {
        matrizAux = tablero.getMatAux();
        matriz = tablero.getMataleatorio();

        matrizAux[fil][col] = matriz[fil][col];
        Img = new ImageIcon("./src/images/" + matrizAux[fil][col] + ".png");
        icono = new ImageIcon(Img.getImage().getScaledInstance(70, 75,
                Image.SCALE_DEFAULT));
        lblCasillas[fil][col].setIcon(icono);
        contador++;
    }
}

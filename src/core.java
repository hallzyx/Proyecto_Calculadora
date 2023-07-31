import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class core extends JFrame {

    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;

    private JButton aSigno;
    private JButton aBorrarTodo;
    private JButton a0Button;
    private JButton aPuntoDecimal;
    private JButton aMultiplicar;
    private JButton aRestar;
    private JButton aSumar;
    private JButton aBorrar;
    private JButton aDividir;
    private JButton aResultado;
    private JLabel rptaWindow;
    private JPanel panelin;
    private JPanel JP_ventana;
    private JPanel JP_teclas;



    double n1=0;
    double n2=0;

    String S_n1;
    String S_n2;

    int token=0;
    int turnoDeNumero=0;

    boolean PuntoDecimalSwitch=true;
    public core(){
        super("Calculadora V 2.0");
        setContentPane(panelin);
        rptaWindow.setText("");

        ListaDeNumeros controler=new ListaDeNumeros();

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("0");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "0");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("1");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "1");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("2");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "2");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("3");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "3");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("4");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "4");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("5");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "5");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("16");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "6");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("7");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "7");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });


        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("8");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "8");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Esta if del "token" es para cuando borrar la pantalla por completo y escribir un digito
                //o solo agregar el siguiente digito al texto previo
                if(token>0){
                    rptaWindow.setText("9");
                    token=0;
                }
                else{
                    rptaWindow.setText(rptaWindow.getText() + "9");
                }

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }


            }
        });

        aPuntoDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(PuntoDecimalSwitch==true){
                    rptaWindow.setText(rptaWindow.getText() + ".");
                    token=0;
                    PuntoDecimalSwitch=false;
                    //token=0;
                }
                /*else{
                    rptaWindow.setText(rptaWindow.getText() + ".");
                }*/

                if(turnoDeNumero==0){
                    S_n1=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 1 actual[String]: "+ S_n1);
                }
                else if(turnoDeNumero==1){
                    S_n2=rptaWindow.getText();
                    System.out.println("Digito guardado, numero 2 actual[String]: "+ S_n2);
                }
            }
        });



        aBorrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                S_n1="0.0";
                S_n2="0.0";
                controler.setNumero(0,0.0);
                controler.setNumero(1,0.0);
                rptaWindow.setText("0.0");
                token++;
                PuntoDecimalSwitch=true;
            }
        });

        aBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               if(turnoDeNumero==0){
                   if(S_n1.indexOf(".")==S_n1.length()-2){
                       S_n1=S_n1.substring(0,S_n1.length()-2);
                       PuntoDecimalSwitch=true;
                   }
                   else{
                       S_n1=S_n1.substring(0,S_n1.length()-1);
                   }
                   rptaWindow.setText(S_n1);
               }
                else if(turnoDeNumero==1){
                   if(S_n2.indexOf(".")==S_n2.length()-2){
                       S_n2=S_n2.substring(0,S_n2.length()-2);
                       PuntoDecimalSwitch=true;
                   }
                   else{
                       S_n2=S_n2.substring(0,S_n2.length()-1);
                   }
                   rptaWindow.setText(S_n2);
               }



            }
        });


        aSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controler.getNumero(0)==0.0){
                    controler.setNumero(0,Double.parseDouble(S_n1));
                    System.out.println(controler.getNumero(0));
                }

                /*else if (controler.getNumero(1)==0.0){
                    controler.setNumero(1,Double.parseDouble(S_n2));
                    System.out.println(controler.getNumero(1));
                }*/

                controler.setOperacion(1);
                turnoDeNumero++;
                token++;
                PuntoDecimalSwitch=true;
            }
        });

        aRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controler.getNumero(0)==0.0){
                    controler.setNumero(0,Double.parseDouble(S_n1));
                    System.out.println(controler.getNumero(0));
                }

                /*else if (controler.getNumero(1)==0.0){
                    controler.setNumero(1,Double.parseDouble(S_n2));
                    System.out.println(controler.getNumero(1));
                }*/

                controler.setOperacion(2);
                turnoDeNumero++;
                token++;
                PuntoDecimalSwitch=true;
            }
        });

        aMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controler.getNumero(0)==0.0){
                    controler.setNumero(0,Double.parseDouble(S_n1));
                    System.out.println(controler.getNumero(0));
                }

                /*else if (controler.getNumero(1)==0.0){
                    controler.setNumero(1,Double.parseDouble(S_n2));
                    System.out.println(controler.getNumero(1));
                }*/

                controler.setOperacion(3);
                turnoDeNumero++;
                token++;
                PuntoDecimalSwitch=true;
            }
        });

        aDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controler.getNumero(0)==0.0){
                    controler.setNumero(0,Double.parseDouble(S_n1));
                    System.out.println(controler.getNumero(0));
                }

                /*else if (controler.getNumero(1)==0.0){
                    controler.setNumero(1,Double.parseDouble(S_n2));
                    System.out.println(controler.getNumero(1));
                }*/

                controler.setOperacion(4);
                turnoDeNumero++;
                token++;
                PuntoDecimalSwitch=true;
            }
        });

        aSigno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(turnoDeNumero==0){
                    controler.setNumero(0,Double.parseDouble(S_n1));
                    controler.invertirSigno(0);
                    System.out.println("cambiadaso se signo prron: "+ controler.getNumero(0));
                    rptaWindow.setText(Double.toString(controler.getNumero(0)));
                    S_n1=Double.toString(controler.getNumero(0));
                }
                else if(turnoDeNumero==1){
                    controler.setNumero(1,Double.parseDouble(S_n2));
                    controler.invertirSigno(1);
                    rptaWindow.setText(Double.toString(controler.getNumero(1)));
                    S_n2=Double.toString(controler.getNumero(1));
                }



            }
        });



        aResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click igual");
                if (controler.getNumero(1)==0.0 && controler.getNumero(0)!=0.0){
                    controler.setNumero(1,Double.parseDouble(S_n2));
                    System.out.println(controler.getNumero(1));
                }

                System.out.println(controler.getNumero(0) + "+ " + controler.getNumero(1));
                rptaWindow.setText(Double.toString(controler.EfectuarOperacion()));

                S_n1=Double.toString(controler.EfectuarOperacion());
                S_n2=Double.toString(controler.EfectuarOperacion());
                controler.setNumero(0,0.0);
                controler.setNumero(1,0.0);
                token++;
                turnoDeNumero=0;
                PuntoDecimalSwitch=true;

            }
        });


        //System.out.println(((JTextField) JP_teclas.getComponent(1).getName());


        /*a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (token==0){
                    rptaWindow.setText("1");
                }else{
                    rptaWindow.setText(rptaWindow.getText() + "1");
                }

                if(n1==0){
                    S_n1=rptaWindow.getText();
                }
                else if(n2==0){
                    S_n2=rptaWindow.getText();
                }
                token++;
            }
        });*/


        /*aResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(token2==1){

                }

                if(n1==0){
                    System.out.println(S_n1);
                    n1=Double.parseDouble(S_n1);
                    System.out.println(n1);
                    rptaWindow.setText("");
                    token2++;
                }
                else if(n2==0){
                    System.out.println(S_n2);
                    n2=Double.parseDouble(S_n2);
                    System.out.println(n2);
                    n1=0;
                    n2=0;
                    token=0;

                }


            }
        });*/

    }

    /*Vamo a chambear*/










    private void createUIComponents() {
        // TODO: place custom component creation code here
    }






}

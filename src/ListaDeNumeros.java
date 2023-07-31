public class ListaDeNumeros {

    double [] numero;
    int operacion;

    double respuesta;
    ListaDeNumeros(){
        numero=new double[]{0.0,0.0};
        
    }

    public void setNumero(int index, double nuevo_numero){
        this.numero[index]=nuevo_numero;
    }
    public double getNumero(int index){
        return this.numero[index];
    }

    public void setOperacion(int operacion){
        this.operacion=operacion;
    }
    public int getOperaciopn(){
        return this.operacion;
    }

    public void setRespuesta(double respuesta){
        this.respuesta=respuesta;
    }


    public double suma(){
        return numero[0]+ numero[1];
    }

    public double resta(){
        return numero[0]-numero[1];
    }

    public double multiplicacion(){
        return numero[0] * numero [1];
    }

    public double division(){
        return numero[0]/numero[1];
    }
    public void invertirSigno(int index){
        numero[index]= numero[index] * (-1);
    }
    
    public double EfectuarOperacion() {
        double rpta = 0;
        switch (operacion) {

            case 1:
                rpta=suma();
                break;
            case 2:
                rpta=resta();
                break;
            case 3:
                rpta=multiplicacion();
                break;
            case 4:
                rpta=division();
                break;
        }
        
        return rpta;
    
    };

    



}



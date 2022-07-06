
import javax.swing.JOptionPane;


/**
 *
 * @author ERodríguez
 * @version 25/06/2022
 */
public class HashTable {
    int tamanhoTabla = 0;
    private int numElementos;
    private double factorCarga;
    private Resumen[] tabla;
    private keywordArr[] tabla2;
    
    // CONSTRUCTOR \\

    public HashTable() {
        tamanhoTabla = 23;
        tabla = new Resumen[this.tamanhoTabla];
        for (int i = 0; i < this.tamanhoTabla; i++) {
            this.tabla[i] = null;
        }
        this.numElementos = 0;
        this.factorCarga = 0.0;
         
    }
    
    // CONSTRUCTOR 2 \\   
    
    public HashTable(String aux) 
    {
    tamanhoTabla = 43;
    tabla2 = new keywordArr[this.tamanhoTabla];
        for (int i = 0; i < this.tamanhoTabla; i++) 
        {
            this.tabla2[i] = null;
        }
        this.numElementos = 0;
        this.factorCarga = 0.0;
    }
   

    // GETTERS Y SETTERS \\
    
    public int getTamanhoTabla() {
        return tamanhoTabla;
    }

    public void setTamanhoTabla(int tamanhoTabla) {
        this.tamanhoTabla = tamanhoTabla;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public double getFactorCarga() {
        return factorCarga;
    }

    public void setFactorCarga(double factorCarga) {
        this.factorCarga = factorCarga;
    }

    public Resumen[] getTabla() {
        return tabla;
    }

    public void setTabla(Resumen[] tabla) {
        this.tabla = tabla;
    }
    

    public keywordArr[] getTabla2() {
        return tabla2;
    }


    public void setTabla2(keywordArr[] tabla2) {
        this.tabla2 = tabla2;
    }
       
    // ASIGNAR LAS CLAVES \\
    
    public int direccion(String clave){
        int i =0;
        int index;
        long valorInicial;
        
        valorInicial = transformarClave(clave); 
        
        index = (int)(valorInicial % this.tamanhoTabla); //ARITMÉTICA MODULAR
        
        while((this.tabla)[index] != null && !((this.tabla)[index].getTitulo().equals(clave))){
            i++;
            index = index + i*i;
            index = index % this.tamanhoTabla;
            
        }
        return index;
    }
    
        public int direccion2(String clave)
        {
        int i =0;
        int index;
        long valorInicial;
        
        valorInicial = transformarClave(clave); 
        
        index = (int)(valorInicial % this.tamanhoTabla); //ARITMÉTICA MODULAR
        
        while((this.tabla2)[index] != null && !((this.tabla2)[index].getKeyword().equals(clave)))
        {
            i++;
            index = index + i*i;
            index = index % this.tamanhoTabla;
            
        }
        return index;
        }
    
    public long transformarClave(String clave){
        long d = 0;
        
        for (int i = 0; i < clave.length(); i++) {
            d += (i+1) * (int)clave.charAt(i); //ASCII
        }
        
        if(d<0) { //se supera el máximo de int y se generan numeros negativos 
            d = -d; //se convierte en positivo dicho numero            
        }
        return d;
    }
    
    public void insertar(Resumen resumen){
        int posicion;
        posicion = direccion(resumen.getTitulo());
        (this.getTabla())[posicion] = resumen;
        this.numElementos++;
        this.factorCarga = (double)(this.numElementos)/this.tamanhoTabla;
        if(this.factorCarga > 0.5){
            JOptionPane.showMessageDialog(null, "Conviene aumentar el tamanho");
        }
    }
    
    public void insertar2(keywordArr key)
    {
        int posicion;
        posicion = direccion2(key.getKeyword());
        (this.getTabla2())[posicion] = key;
        this.numElementos++;
        this.factorCarga = (double)(this.numElementos)/this.tamanhoTabla;
        if(this.factorCarga > 0.5)
        {
            JOptionPane.showMessageDialog(null, "Conviene aumentar el tamanho");
        }
    }

    public Resumen buscar(String clave){
        Resumen resumen;
        int index;
        
        index = direccion(clave);
        resumen = this.tabla[index];
        
        if(resumen != null){
            return resumen;
        }
        return resumen;
    } 

    public keywordArr buscar2(String clave)
    {
        keywordArr key;
        int index;
        
        index = direccion2(clave);
        key = this.tabla2[index];
        
        if(key != null){
            return key;
        }
        return key;
    } 


}

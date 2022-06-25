
import javax.swing.JOptionPane;


/**
 *
 * @author ERodríguez
 * @version 24/06/2022
 */
public class HashTable {
    int tamanhoTabla = 23;
    private int numElementos;
    private double factorCarga;
    private Resumen[] tabla;
    
    // CONSTRUCTOR \\

    public HashTable() {
        tabla = new Resumen[this.tamanhoTabla];
        for (int i = 0; i < this.tamanhoTabla; i++) {
            this.tabla[i] = null;
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
    
    public long transformarClave(String clave){
        long d = 0;
        
        for (int i = 0; i < Math.min(10, clave.length()); i++) {
            d = d * 27 + (int)clave.charAt(i); //ASCII
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
}

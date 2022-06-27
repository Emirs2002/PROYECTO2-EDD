

/**
 *
 * @author ERodríguez 
 * @version: 26/06/22
 * 
 */
public class Nodo{
    
    protected Nodo pnext;
    protected Object data;
   

    public Nodo(Object data) {
        this.pnext = null;
        this.data = data;
    }
    

    /**
    * @return pnext
    */
    public Nodo getPnext() {
        return pnext;
    }

    /**
    * @param pnext, asigna pnext
    */
    public void setPnext(Nodo pnext) {
        this.pnext = pnext;
    }

    /**
    *@return nombre
    */
    public Object getData() {
        return data;
    }

    /**
    * @param data, asigna data
    */
    public void setData(Object data) {
        this.data = data;
    }
    
   
}

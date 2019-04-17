package salvando_walle;

public class Instrucciones {

    private char instruccion;

    Instrucciones(char accion){
        setInstruccion(accion);
    }

    public void setInstruccion(char instr) {
        this.instruccion = instr;
    }

    public char getInstruccion() {
        return instruccion;
    }
}

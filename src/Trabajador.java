public class Trabajador {
    private String nombre;
    private int horas;
    private char sexo;
    
    public Trabajador(String nom, int hr, char sex)
    {
        nombre = nom;
        horas = hr;
        sexo = sex;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getHoras()
    {
        return horas;
    }
    
    public char getSexo()
    {
        return sexo;
    }
    public void setNombre(String nom)
    {
        nombre = nom;
    }
    public void setHoras(int hr)
    {
        horas = hr;
    }   
    public void setSexo(char sex)
    {
        sexo = sex;
    }
    
    
    public String toString()
    {
        return nombre + "\t" + horas + "\t" + sexo;
    }

}
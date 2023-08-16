public abstract class Animal {

    protected String nombre;
    protected Integer edad;


    public Animal( String nombre, Integer edad){

                this.nombre = nombre;
                this.edad = edad;


    }
    public String moverse() {
        return "El animal se esta moviendo ";

    }


    @Override
    public String toString() {
        return "Animal{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}


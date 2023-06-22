package evaluacion16162023.demo;

public class Estudiante {
    public String codigo;
    public String nombre;
    public String Apellidos;
    public String curso;
    public float nota1;
    public float nota2;
    public float nota3;
    float promedio;


    public Estudiante(String codigo, String nombre, String apellidos, String curso, float nota1, float nota2, float nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        Apellidos = apellidos;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }


    public float getPromedio() {
        return (float)(nota1 + nota2 + nota3) / 3;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public float promedio() {
        float sumaNotas = nota1 + nota2 + nota3;
        float promedio = sumaNotas / 3;
        return promedio;
    }




    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", curso='" + curso + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }
}

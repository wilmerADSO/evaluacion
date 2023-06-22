package evaluacion16162023.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EstudianteServicios {


    public List<Estudiante> estudy = new ArrayList<>();

    public EstudianteServicios(){

        estudy.add(new Estudiante("A1","SANTIAGO","SARTA","INFORMATICA",3.8f,2.5f,4.3f));
        estudy.add(new Estudiante("A2","ANDRES","PAEZ","INFORMATICA",3.3f,0.5f,2.3f));
        estudy.add(new Estudiante("A3","WILMER","PERDIGON","MATEMATICAS",3.1f,3.5f,3.3f));
        estudy.add(new Estudiante("A4","DAVID","ORTIZ","INGLES",4.1f,3.5f,4.3f));
        estudy.add(new Estudiante("A5","DANIEL","ORTIZ","INFORMATICA",2.5f,3.3f,3.0f));
        estudy.add(new Estudiante("A6","JHON","PEREZ","INGLES",3.1f,3.0f,3.5f));
        estudy.add(new Estudiante("A7","BRANDON","SOTELO","MATEMATICAS",2.1f,1.5f,2.9f));
    }

    public List<Estudiante> listaEstudiantes(){
        return estudy;
    }

    public Estudiante buscarCodigo(String codigo){
        for(Estudiante e: estudy){
            if(e.getCodigo().equals(codigo)){
                return e;
            }
        }
        return null;

    }

   public void actualizarDatos(Estudiante estudianteActualizado){
        for(Estudiante e: estudy){
            if(e.getCodigo().equals(estudianteActualizado.getCodigo())){
                e.setNombre(estudianteActualizado.getNombre());
                e.setApellidos(estudianteActualizado.getApellidos());
                e.setCurso(estudianteActualizado.getCurso());
                e.setNota1(estudianteActualizado.getNota1());
                e.setNota2(estudianteActualizado.getNota2());
                e.setNota3(estudianteActualizado.getNota3());
                return;
            }
        }

        }

    public void eliminarEstudiante(){
        List<Estudiante> lista = new ArrayList<>(estudy);
        for (Estudiante e : lista) {
            if (e.getPromedio()<3) {
                estudy.remove(e);
            }
        }
    }




        }









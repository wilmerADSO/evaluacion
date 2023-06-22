package evaluacion16162023.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5501")

@RestController
public class ControladorServicios {
    private EstudianteServicios servicios;
    public ControladorServicios(EstudianteServicios servicios){
        this.servicios=servicios;
    }

    @GetMapping("/listarEstudiante")
    public List<Estudiante> listaEstudiante(){
        return servicios.listaEstudiantes();

    }
    /*
  @PutMapping("/actualizarDatos/{codigo}")
    public ResponseEntity<Void> actualizarDatos(@PathVariable String codigo, @RequestBody Estudiante estudianteA){
        Estudiante e = servicios.buscarCodigo(codigo);
        if (e != null){
            estudianteA.setCodigo(codigo);
            servicios.actualizarDatos(estudianteA);
            //return new ResponseEntity<>(HttpStatus.OK);
            return ResponseEntity.ok().build();

        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
  }


     */

    @PutMapping("/actualizarDatos/{codigo}")
    public ResponseEntity<Estudiante> actualizarDatos(@PathVariable String codigo, @RequestBody Estudiante estudianteA) {
        Estudiante e = servicios.buscarCodigo(codigo);
        if (e != null) {
            estudianteA.setCodigo(codigo);
            servicios.actualizarDatos(estudianteA);
            return new ResponseEntity<>(estudianteA, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


/*
    @DeleteMapping("eliminarReprobados")
    public void eliminarEstudiante(){
        servicios.eliminarEstudiante();
  }

 */

  @DeleteMapping("/eliminarReprobados")
    public ResponseEntity<String> eliminarE(){
        servicios.eliminarEstudiante();
        return ResponseEntity.ok("Estudiantes reprobados eliminados correctamente");

  }







}

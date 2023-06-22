$(document).ready(function() {
    

$('#btnListar').click(function(event) {
let tabla = document.getElementById('tabla')
tabla.innerHTML = ''
event.preventDefault();
$.ajax({
url: 'http://localhost:8021/listarEstudiante',
type: 'GET',
dataType: 'json',
success: function(response) {
tabla.innerHTML ='';
for (i = 0; i < response.length; i++){
tabla.innerHTML += '<tr><td>' + response[i].codigo + 
'</td><td>' + response[i].nombre +
'</td><td>' + response[i].apellidos +
'</td><td>' + response[i].curso +
'</td><td>' + response[i].nota1 +
'</td><td>' + response[i].nota2 +
'</td><td>' + response[i].nota3 +
'</td></tr>';
}
/*
$('#resultadosConsultar').html(JSON.stringify(response));
*/
},
error: function(xhr, status, error) {
console.log(xhr);
console.log(status);
console.log(error);
}
})
});


                     //      ACTUALIZAR   //

$('#btnActualizar').click(function(e) {
e.preventDefault();
                
var codigo = $("#codigo").val();
var nombreN = $("#nombre").val();
var apellidoN = $("#apellido").val();
var cursoN = $("#curso").val();
var nota1N = $("#nota1").val();
var nota2N = $("#nota2").val();
var nota3N = $("#nota3").val();
                
                        
var data = { 
    codigo : codigo,
    nombre : nombreN,
    apellidos : apellidoN,
    curso : cursoN,
    nota1 : nota1N,
    nota2 : nota2N,
    nota3 : nota3N,
    

};
console.log(data);
                        
$.ajax({
    url: 'http://localhost:8021/actualizarDatos/'+codigo, 
    type: 'PUT',
    dataType: 'json',
    data: JSON.stringify(data),
    contentType: 'application/json',
        success: function() {
            alert('El estudiante fue actualizado exitosamente...');

            $("#codigo").val('');
            $("#nombre").val('');
            $("#apellido").val('');
            $("#curso").val('');
            $("#nota1").val('');
            $("#nota2").val('');
            $("#nota3").val('');
                
                            
    },
    error: function(xhr, status, error) {
                            
    console.log(xhr);
    console.log(status);
    console.log(error);
    }
    })
});


$('#IDdelete').click(function(e){
    
    e.preventDefault();
    
    $.ajax({
    url: 'http://localhost:8021/eliminarReprobados',
    method: 'DELETE',
    datatype: 'JSON',
    success: function(){
        alert("Los estudiantes reprobados fueron borrados exitosamente")
      
      
      },
    error: function(xhr, status, error) {
      console.error('Error al eliminar el registro:', error);
      alert('Error al eliminar'),
        console.log(xhr);
        console.log(status);
        console.log(error);
      
      }
      })
      })
                



})



        
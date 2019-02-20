$(document).ready(function(){
    //Post Password y correo
    /* Iniciar sesión */
    $("#formLog").submit(function(e){
        e.preventDefault();
        var log={
            correo:$('input[name="inputEmail"]').val(),
            password:$('input[name="inputPassword"]').val()
        }
        
        $.ajax({
           url: ("/gimnacios/acceso"), //.attr( "action"),
           data: JSON.stringify(log),
           type: "POST",
           beforeSend: function (xhr) {
               //xhr.setRequestHeader("Accept", "application/json");
               xhr.setRequestHeader("Content-Type", "application/json");
           },
           success: function (resp) {
               if(resp){
               alert("Sesion iniciada");
               }
               else{
                   alert("contraseña invalida");
               }
           }
       });
       
    });
    
   
    /* Registrar un nuevo entrenador */
     /* 
    $("#registro").submit(function(e){
        e.preventDefault();
        var newTrainer={
            nombre:$('input[name="nombre"]').val(),
            edad:$('input[name="edad"]').val(),
            correo:$('input[name="email"]').val(),
            direccion:$('input[name="direccion"]').val()
        }
        
        $.ajax({
           url: ("/entrenadores"), //.attr( "action"),
           data: JSON.stringify(newTrainer),
           type: "POST",
           beforeSend: function (xhr) {
               xhr.setRequestHeader("Content-Type", "application/json");
           },
           success: function (resp) {
               alert(resp);
           }
       });
       
    });
    */
    
    
       /* Registrar un nuevo gimnasio */
    $("#registro").click(function(e){
        e.preventDefault();
        var newUser={
            rfc:$('input[name="rfc"]').val(),
            nombrePropietario:$('input[name="name"]').val(),
            correo:$('input[name="email"]').val(),
            apellidoPropietario:$('input[name="lastname"]').val(),
            password:$('input[name="password"]').val(),
            telefono:$('input[name="phonenumber"]').val(),
            direccion:{
                    calle:$('input[name="address"]').val(),
                    estado:$('input[name="state"]').val()
                      }
        }
        
        $.ajax({
           url: ("/gimnacios"), //.attr( "action"),
           data: JSON.stringify(newUser),
           type: "POST",
           beforeSend: function (xhr) {
               xhr.setRequestHeader("Content-Type", "application/json");
           },
           success: function (resp) {
               alert(resp);
           }
       });
       
    });
    
     
    
        /* Registrar un nuevo cliente */
         $("#registrocliente").submit(function(e){
        e.preventDefault();
        var newCliente={
            nombreCliente:$('input[name="name"]').val(),
            apellidoCliente:$('input[name="lastname"]').val(), 
            gender:$('input[name="gender]').val(),
            direccion:{
                    calle:$('input[name="address"]').val(),
                    estado:$('input[name="state"]').val()
                      },
            birthdate:$('input[name="birthdate"]'),
            state:$('input[name="state"]').val(),
            telefono:$('input[name="phonenumber"]').val(),
            email:$('input[name="email"]').val(),
            password:$('input[name="password"]').val(),
            
        }

    
    $.ajax({
           url: ("/clientes"), //.attr( "action"),
           data: JSON.stringify(newCliente),
           type: "POST",
           beforeSend: function (xhr) {
               //xhr.setRequestHeader("Accept", "application/json");
               xhr.setRequestHeader("Content-Type", "application/json");
           },
           success: function (resp) {
               alert("yay");
           }
       });

             /* Traer los clientes de un gimnasio*/
             $.ajax({
                 type: 'GET',
                 url: 'gimnacios/5c63c0c86cc7ff2750e15198/clientes',
                 async: false,
                 jsonpCallback: 'jsonCallback',
                 contentType: "application/json",
                 dataType: 'jsonp',
                 success: function(data)
                 {
                     $('#jsonp-results').html(JSON.stringify(data));
                     console.log(json);
                 },
                 error: function(e)
                 {
                     alert(e.message);
                 }
             });

       
    });
    });

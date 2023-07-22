

const encabezadoTabla=document.getElementById('tablaMedico')
const tablaPaciente=document.querySelector('tbody')

let btnCrear=document.getElementById('btnCrear')

let btntbnGuardar=document.getElementById('btntbnGuardar')


class Medico{

    constructor(id, nombre, apellido, documento, especialidad, direccion){
        this.id=id
        this.nombre=nombre
        this.apellido=apellido
        this.documento=documento
        this.especialidad=especialidad
        this.direccion=direccion
    
    }

    }


async function traerDatosMedico(){
    await fetch ('http://localhost:8080/medicos')
        .then((res)=> res.json()
        )
        .then((medico)=>{
            medico.forEach((medico) => {

                let tr=document.createElement("tr")

                let td=document.createElement("td")
                td.innerText=medico.id
                tr.appendChild(td)

                td=document.createElement("td")
                td.innerText=medico.nombre
                tr.appendChild(td)

                td=document.createElement("td")
                td.innerText=medico.apellido
                tr.appendChild(td)

                td=document.createElement("td")
                td.innerText=medico.documento
                tr.appendChild(td)

                td=document.createElement("td")
                td.innerText=medico.especialidad
                tr.appendChild(td)

                td=document.createElement("td")
                td.innerText=medico.direccion
                tr.appendChild(td)


               td=document.createElement("Button")   
               td.setAttribute("class", "btnActualizar ")  
               td.setAttribute("class", "btn btn-outline-success ")             
                td.innerText="Actualizar"
                tr.appendChild(td)


                td=document.createElement("Button")
                
                td.setAttribute("name", "btnBorrar");
                td.setAttribute("class", "btn btn-outline-danger");
                td.innerText="Eliminar"
                tr.appendChild(td)



                tablaPaciente.appendChild(tr)
         

            


               
                
            })

            btntbnGuardar.addEventListener('submit', (e)=>{
                let id=document.getElementById('id')
                let nombre=document.getElementById('nombre').value
            
                let apellido=document.getElementById('apellido').value
            
                let documento=document.getElementById('documento').value
            
                let especialidad=document.getElementById('especialidad').value
                let direccion=document.getElementById('direccion').value

                
                const medico=new Medico(id, nombre, apellido, documento, especialidad,direccion)
                tablaPaciente=medico

                
                 
                 
                e.preventDefault()

            
            

            
            
            })

        

            


            function btnDelete(element){
                if (element.name==='btnBorrar'){
                    element.parentElement.remove()
                    
                }
                
            }
            

           tablaPaciente.addEventListener('click',(e)=>{
           btnDelete(e.target)
            
        
        })

        

           
            

        }
        

        
        )
        

        
            
    }
       
    
 


    traerDatosMedico()






class Persona (val nombre: String , var edad: Int){

    var email: String? = null
    constructor(nombre: String, edad: Int, email: String) : this(nombre, edad) {
        this.email = email
    }

    public fun presentarse(){
        print("Hola me llamo $nombre y tengo $edad años")
        if (this.email != null ){
            println("Mi email es: ${this.email}")
        }
    }
}
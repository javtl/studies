class Persona(var peso: Double, var altura:Double){

    val nombre: String= "SIN NOMBRE"

    val imc: Double
        get(){
            return peso/(altura*altura)
        }
    constructor(nombre: String, imc Doouble):this(peso, altura){
        this.nombre = nombre
    }

    override fun toString(): String {
        var resultado= "~{}"
    }
}
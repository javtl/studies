package E35Repaso

abstract class Empleado (val dni: String, val nombre:String) {

    companion object{
        const val SALARIO_MINIMO = 1200.00
    }

    var sueldoBase: Double = SALARIO_MINIMO
        set(value){
            if(value > SALARIO_MINIMO)
                field = value
        }
    init{
        this.sueldoBase = SALARIO_MINIMO
    }

    abstract fun getSueldo(): Double

    override fun compareTo(other: empleado): Int {
        return(this.getSueldo()-other.getSueldo()).toInt()
    }
}
package E35Repaso

class Tecnico(dni:String) {

    override fun getSueldo(): Double {
        return (this.sueldoBase + this.categoria *100)
    }
}
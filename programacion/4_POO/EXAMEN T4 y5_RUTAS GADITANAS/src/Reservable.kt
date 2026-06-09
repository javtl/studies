interface Reservable{
    fun reservar(plazas: Int) : Boolean
    fun cancelar(): Boolean
}
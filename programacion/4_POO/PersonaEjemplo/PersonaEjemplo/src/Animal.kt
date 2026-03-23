class Animal(private val especie: String , private var nombre: String, ) {

    public fun emitirSonido(){
        print("Hola soy un/una $especie, me llamo $nombre")
    }
}
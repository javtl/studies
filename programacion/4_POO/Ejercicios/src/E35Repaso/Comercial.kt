package E35Repaso

class Comercial (){
    var ventas:Double = 0.00
        set(value){
            if(value >120)
                field = value
            else
                field = (SALARIO_MINIMO/10)
        }


    override fun getSueldo(): Double{
        return sueldoBase + ventas * 0.1
    }
    
}
class RepositorioCompras () {


    val repositorio = mutableListOf<Compra>()
    fun agregarCompra(compra: Compra){
        //Agrega una compra al repositorio//
        repositorio.add(compra)
    }

    fun retornarDomicilios():Set<Domicilio>{

        val domicilios = mutableSetOf<Domicilio>()

        for (compra in repositorio){
            domicilios.add(compra.cliente.domicilio)
        }
        return domicilios
    }

    fun mostrarCliente(){
        for(compra in repositorio){
            println("${compra.cliente.nombre}, ${compra.dia}, ${compra.monto}, ${compra.cliente.domicilio.dirCompleta()}")
        }
    }
}

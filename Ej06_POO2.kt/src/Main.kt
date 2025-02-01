//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val cliente1 = Cliente("Nuria Costa", Domicilio(calle = "Calle Las Flores", numero = 355 ))
    val cliente2 = Cliente("Lucía Martínez", Domicilio(calle = "Piruleta", numero = 2))
    val compra1 = Compra(cliente1, 23, 150.00)
    val compra2 = Compra(cliente1, 15, 355.00)
    val compra3 = Compra(cliente2, 10, 50000.00)
    val repositorio = RepositorioCompras()
    repositorio.agregarCompra(compra1)
    repositorio.agregarCompra(compra2)
    repositorio.agregarCompra(compra3)

    println(repositorio.mostrarCliente())

    println(repositorio.retornarDomicilios())

}

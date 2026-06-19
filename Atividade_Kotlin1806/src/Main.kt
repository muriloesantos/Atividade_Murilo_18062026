class Produto(
    val nome: String,
    var valor: Double,
    var quantidade: Int
) {
    fun resumo(): String{
        return "Produto: $nome | R$ $valor | Estoque $quantidade"
    }
}

fun AplicarDesconto (percentual: Double){
    if ( percentual < 0.0 || percentual > 100 ){
        println("Erro: percentual inválido")
    } else {
        valor -= valor *( percentual/100)
        println("Novo valor de $ nome: R$ ${"%.2f".format(valor)}")
    }

}

fun main() {
    val Produto0 = Produto("Arroz", 8.50,100)
    val Produto1 = Produto("Feijão", 7.00,50)
    val Produto2 = Produto("Macarrão", 4.50,200)

    println(Produto0.resumo())
    println(Produto1.resumo())
    println(Produto2.resumo())
    Produto2.resumo()
}
package classes

class GlobalHandler : ResponseHandler {
    override fun handle(result: Result) {
        when (result) {
            is Result.Success -> {
                println("Handling Success: ${result.data}")
            }
            is Result.Error -> {
                println("Handling Error: ${result.message}")
            }
        }
    }
}

fun main() {
    val successResult = Result.Success("Data received")
    val errorResult = Result.Error("Error occurred")

    val responseHandler = GlobalHandler()

    responseHandler.handle(successResult)
    responseHandler.handle(errorResult)
}
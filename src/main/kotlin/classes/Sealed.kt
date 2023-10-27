package classes

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}

interface ResponseHandler {
    fun handle(result: Result)
}


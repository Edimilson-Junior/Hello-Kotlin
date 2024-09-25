package Books

open class Book( val title: String, val author: String ) {
    private var currentPage: Int = 0
    open fun readPage() {
        currentPage ++
        println("Current page: $currentPage")
    }
}

class eBook(title: String, author: String, val format: String = "Text") : Book(title, author) {
    private var words: Int = 0
    override fun readPage() {
        words += 250
        println("You have read $words words in the eBook $title (format: $format).")
    }
}

fun main() {
    // Criando uma instância da classe Book
    val book = Book("1984", "George Orwell")
    book.readPage() // Lendo uma página do livro físico

    // Criando uma instância da classe eBook
    val ebook = eBook("The Art of War", "Sun Tzu", "PDF")
    ebook.readPage() // Lendo palavras no eBook
    ebook.readPage() // Lendo mais uma página do eBook
}

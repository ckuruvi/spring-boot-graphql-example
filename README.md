Spring Boot with GraphQL Query Example

    Accessible under http://localhost:8080/rest/books
    Usage for allBooks { allBooks { isn title authors publisher } }
    Usage for book { book(id: "123") { title authors publisher }
    Combination of both allBooks and book { allBooks { title authors } book(id: "124") { title authors publisher } }

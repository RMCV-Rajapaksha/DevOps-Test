class HelloWorldPrinter {
    String message

    HelloWorldPrinter(String message) {
        this.message = message
    }

    void printHelloWorld(int times) {
        times.times {
            println message
        }
    }

    void printWithExclamation(int times) {
        times.times {
            println message + "!"
        }
    }

    void printWithNumbering(int times) {
        (1..times).each { number ->
            println "${number}: ${message}"
        }
    }
}

def printer = new HelloWorldPrinter('Hello, World')
printer.printHelloWorld(3)
printer.printWithExclamation(2)
printer.printWithNumbering(5)
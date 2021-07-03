class Test {
    static void main(String[] args) {
        println new Test().start()
        def pojo = new Pojo(id: 1, name: 'harry')
        pojo.name = "Harrison Wells"
        println pojo.name
        println pojo

//        def list=[] as LinkedList  Incase if we want the list to be linkedlist then define this way

        def list = []
        list.add('String1')
        list.add('String2')

        println list
//        list.each{
//            println it
//        }
        list.each { str -> println str }

        def map = [:]
        map = [name: 'Youtube', id: 12, salary: 9000]
        println map

        map.each { key, value ->
            println "key=$key"
            println value
        }

        //operator overloading
        A a = new A(i: 10)
        A b = new A(i: 20)
        println a.plus(b)
        println a + b

    }

    def start() {
        1 //last statement is considered as return so no need to explicitly mention return
    }

    static class A {
        private int i

        def plus(A a) {
            return a.i + this.i
        }
    }

    static class Pojo {
        private String name
        private int id

        @Override
        String toString() {
            return "Pojo{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
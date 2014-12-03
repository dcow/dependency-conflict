package bar

import foo.FooGenerator

class Main {
	public static void main(String[] args) {
		def classpath = System.getProperty('java.class.path')

		println ()
		println "Classpath:"
		classpath.split(':').each {
			println "\t${it}"
		}
		println ()
		println "Module says: '${FooGenerator.genFoo()}'!"

		System.exit(0)
	}
}
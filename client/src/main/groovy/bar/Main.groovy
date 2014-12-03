package bar

import foo.Foo

class Main {
	public static void main(String[] args) {
		def classpath = System.getProperty("java.class.path")
		println "Classpath: '${classpath}'"
		println "Foo: '${Foo.genFoo()}'"
		System.exit(0)
	}
}
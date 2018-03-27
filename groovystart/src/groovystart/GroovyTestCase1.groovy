package groovystart
import groovy.util.GroovyTestCase

class GroovyTestCase1 extends GroovyTestCase{
	def void testTT() {
		assertToString("book:asf", 'book:asf')
		print 'ss'
	}
	def void testToString() {}
}

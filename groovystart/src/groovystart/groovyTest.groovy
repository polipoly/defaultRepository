package groovystart

class groovyTest extends GroovyTestCase{
	static main(args) {
/*		def books=['a':'asd',b:'bsd',c:[]]
		def values=books.values()
		print new Test().getA()*/
		Map map=['a':'aaa','f':'sss']
		print map.a
	}
	static def sorst(a=false) {
		return [1,2,3,4];
	}
	def void testT(){
		def books=['a':'asd',b:'bsd',c:[]]
		def values=books.values()
		assertToString([a:'sdf'], 'book:asf')
		print new Test().getA()
	}
}
class Test{
	Test(n){}
	def a='ll';
}
interface tt{
	def coist()
}
package groovystart

class MT {

	static main(args) {
		/*def greet="hi there"
		def cold= {arg->print("${greet} to hell with your ${arg}")}
		func(){param->print "${param}"}
		func cold
		func {param->print "${param}"}*/
		def num=1
		2.upto(5){p->num*=p;print num+" "}
		['sdf':'ss',hh:'sds'].each(){st->print st.key+" "+st.value}
		def v= [1,2,3,5,6,8,4].find(){it>6}
		print v
		def cold= {arg->print("to hell with your ${arg}")}
		cold("d")
	}
	
	static def func(col) {
		col.call("d")
	}
}

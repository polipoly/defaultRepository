package groovystart

class FunAndClosure {
	static main(args) {
		def a="1234234"
		def b="23"
		print b-a
	}
	static ArrayList intersect(List list1,List list2) {
		List result=[]
		for(item in list1) {
			if(list2.contains(item)&&item!=null) {
				result+=item
			}
		}
		result;
	}
	static List findManager(String employee){
		Map map=['Ken':['John','Mark'],'Joe':['Jessie','Mark']];
		def result=[]
		map.each(){it.value.each(){param->if(param==employee)result+=it.key}
		}
		return result
	}
}

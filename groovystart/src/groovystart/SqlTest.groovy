package groovystart
import groovy.sql.*
class SqlTest {
	static main(args) {
		def DB='org.gjt.mm.mysql.Driver'
		def url='jdbc:mysql://localhost:3306/book'
		def user='root'
		def pwd='zx6911352'
		Sql sql=Sql.newInstance(url, user, pwd, DB)
		def q;
		DataSet ds= sql.dataSet('user')
		def map=[loginname:'addmm1',password:'1234a']
		//def i= ds.execute("delete from user where loginname=\'addmm\'")
		List list= ds.rows()
		
		print list
	}
}

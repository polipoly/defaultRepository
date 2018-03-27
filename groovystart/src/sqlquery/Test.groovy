package sqlquery

import groovy.sql.Sql

class Test {
	static main(args) {
		def DB='org.gjt.mm.mysql.Driver'
		def url='jdbc:mysql://localhost:3306/book'
		def user='root'
		def pwd='zx6911352'
		Sql sql=Sql.newInstance(url, user, pwd, DB)
		SqlQuery sq=new AccountQuery(sql);
		def result=sq.execute()
		print result
	}
}

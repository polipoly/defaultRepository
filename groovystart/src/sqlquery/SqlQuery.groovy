package sqlquery
import groovy.sql.*

abstract class SqlQuery {
	def query;
	Sql sql;
	SqlQuery(sql,query){
			this.sql=sql;
			this.query=query
	}
	def execute() {
		def rowList=sql.rows(query)
		def results=[]
		def size=rowList.size()	
		print size
		0.upto(size-1){
			index->results<<this.mapRow(rowList[index])
		}
		return results
	}
	def abstract mapRow(row)
}

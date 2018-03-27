package sqlquery

class AccountQuery extends SqlQuery{

	AccountQuery(sql){
		super(sql,'select * from user')
	}
	@Override
	public Object mapRow(Object row) {
		// TODO Auto-generated method stub
		def user=new User(row.id, row.loginname, row.password, 
			row.username, row.phone, row.address)
		return user;
		
	}

}

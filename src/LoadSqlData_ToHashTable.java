
public class LoadSqlData_ToHashTable implements SqlLiteFile {

	private LoadHashTables_ToSqlLite  mLoadHashTables_ToSqlLite;
	private String dbFileName;
	
	public LoadSqlData_ToHashTable(String fileName)
	{
		this.dbFileName = fileName;
	}
	@Override
	public void up_down_load_orders_customer_info() {
		// TODO Auto-generated method stub
		
		if (mLoadHashTables_ToSqlLite == null) {
			mLoadHashTables_ToSqlLite = new LoadHashTables_ToSqlLite(dbFileName);
			
		}
		
		mLoadHashTables_ToSqlLite.up_down_load_orders_customer_info();

	}

}

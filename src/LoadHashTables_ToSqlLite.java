
///
//  proxy  pattern 
///
public class LoadHashTables_ToSqlLite implements SqlLiteFile {

	private String dbFileName;
	
	public LoadHashTables_ToSqlLite(String fileName) {
		this.dbFileName = fileName;
		loadHashToSqlLiteFile(fileName);
	}
	@Override
	public void up_down_load_orders_customer_info() {
		// TODO Auto-generated method stub
		System.out.println("have the sqllite connect up and runing");
		System.out.println("have the hashtable content in sqllite format");
	}
	
	private void loadHashToSqlLiteFile(String fileName)
	{
		System.out.println("Loading the   Hash Table in sqllite format " + fileName);
		
	}

}


public class StringOperation {

	//1-	VPLUS is Backend

	String reponseText = "<sch:SessionID>SESS1</sch:SessionID><sch:TransactionID>Tr-1</sch:TransactionID><sch:InboundTimeStamp>2014-11-05T14:24:19.351+05:30</sch:InboundTimeStamp>";

	
	
	

	public void printTransactionID(){
	String temp[]	= reponseText.split("sch:TransactionID");
	System.out.println(temp[1]);
	//System.out.println(temp[1].length());
	for (int i =1;i<(temp[1].length()-2);i++)
		System.out.print(temp[1].charAt(i));
	}	
}
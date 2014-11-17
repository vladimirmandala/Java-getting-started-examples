public class RunnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "<sch:DatasourceTimestamp dsname=VPLUS><sch:Intime>2014-11-05T14:24:20.503+05:30</sch:Intime><sch:Outtime>2014-11-05T14:24:20.814+05:30</sch:Outtime></sch:DatasourceTimestamp>";

		String result[] = str.split("dsname");
		System.out.println("size "+result.length);
		for (int i =0;i<result.length;i++){
			
			System.out.println(i+" "+result[i]);
		}
	}
}

public class Main
{
	public static void main(String[] args) {
		Offering offering;
		offering=new Tea();
		offering=new Gin(offering);
		System.out.println(offering.getName()+". Rs:"+offering.getPrice());
	}
}

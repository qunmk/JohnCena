package One;

public class AmazonEmployee {

	public String companyName = "Amazon";

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Amazon");

		System.out.println(sb.reverse());

		sb.append(" Company");

		System.out.println(sb);

	}

}
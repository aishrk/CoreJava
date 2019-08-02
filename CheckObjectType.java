import java.util.ArrayList;
import java.util.List;

public class DifferentDataTypeList {

	public static void main(String[] args) {

		List<Object> intergers = new ArrayList<Object>();
		List<Object> strings = new ArrayList<Object>();
		List<Object> bolleans = new ArrayList<Object>();
		List<Object> doubles = new ArrayList<Object>();
		List<Object> chars = new ArrayList<Object>();

		System.out.println("Start of the Execution..");
		Object[] allItems = { 1, "shesha", "pagal", 'a', true, 5, 23.99, 99.90 };

		for (Object object : allItems) {

			if (object instanceof Integer) {

				intergers.add(object);

			} else if (object instanceof String) {
				strings.add(object);

			} else if (object instanceof Double) {
				doubles.add(object);

			} else if (object instanceof Character) {
				chars.add(object);
			} else if (object instanceof Boolean) {
				bolleans.add(object);

			}
		} // for
		System.out.println("interger data :: " + intergers);
		System.out.println("String data :: " + strings);
		System.out.println("Double data :: " + doubles);
		System.out.println("Character data :: " + chars);
		System.out.println("End of the execution");
	}// method

}

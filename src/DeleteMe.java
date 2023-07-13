import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DeleteMe {

	public static void main(String[] args) throws IOException {

		System.out.println(Outer.class.isNestmateOf(Outer.Inner.class));
		System.out.println(Outer.Inner.class.getNestHost());
		Set<String> nestedMembers = Arrays.stream(Outer.Inner.class.getNestMembers()).map(Class::getName)
				.collect(Collectors.toSet());
		System.out.println(nestedMembers);
	}

}

class Outer {

	public void outerPublic() {
	}

	private void outerPrivate() {
	}

	class Inner {

		public void innerPublic() {
			outerPrivate();
		}
	}
}

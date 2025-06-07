import java.util.Optional;

public class option1 {
public static void main(String[] args) {

	String str = "String is there";
	Optional <String> optional = Optional.ofNullable(str);
	System.out.println(optional.get());
	System.out.println(optional.isPresent());
	
	optional=optional.empty();
	System.out.println(optional.orElse("not found"));
	

}
}

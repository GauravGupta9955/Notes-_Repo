import java.util.Optional;

public class Option {
public static void main(String[] args) {

	String str = "String is there";
	Optional <String> optional = Optional.ofNullable(str);
	System.out.println(optional.get());
	

}
}

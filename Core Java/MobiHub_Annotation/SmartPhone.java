import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  // Makes annotation available at runtime
@Target(ElementType.TYPE)          // Specifies it can be used on methods
public @interface SmartPhone {
    String os();  // Annotation element
    int version();
}
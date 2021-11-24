package Misc.CustomAnnotation;

//We're going to create three custom annotations with the goal of serializing an object into a JSON string.
//We'll use the first one on the class level, to indicate to the compiler that our object can be serialized.
// Then we'll apply the second one to the fields that we want to include in the JSON string.
//Finally, we'll use the third annotation on the method level, to specify the method that we'll use to initialize our object.

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {
    //it has no methods, and thus serves as a simple marker to mark classes that can be serialized into JSON.
}

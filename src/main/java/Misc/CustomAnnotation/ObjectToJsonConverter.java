package Misc.CustomAnnotation;
import Misc.CustomAnnotation.JSONserializer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObjectToJsonConverter {
    public String convertToJson(Object object) throws JsonSerializationException {
        try {
            JSONserializer.checkIfSerializable(object);
            JSONserializer.initializeObject(object);
            System.out.println(JSONserializer.getJsonString(object));
            return JSONserializer.getJsonString(object);
        } catch (Exception e) {
            throw new JsonSerializationException(e.getMessage());
        }
    }
    @Test
    public void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
        Person person = new Person("soufiane", "cheouati", "34");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.convertToJson(person);
        assertEquals(
                "{\"personAge\":\"34\",\"firstName\":\"Soufiane\",\"lastName\":\"Cheouati\"}",
                jsonString);
    }
}

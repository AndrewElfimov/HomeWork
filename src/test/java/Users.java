import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.get;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {

	public int id;
	public String title;


	public static void main(String[] args) throws JsonProcessingException {
		String rowUsers = get("https://jsonplaceholder.typicode.com/posts").getBody().asString();

		ObjectMapper objectMapper = new ObjectMapper();
		Users[] usersJson = objectMapper.readValue(rowUsers, Users[].class);
		String changedUsersString = objectMapper.writeValueAsString(usersJson);

		System.out.println(changedUsersString);

	}

}

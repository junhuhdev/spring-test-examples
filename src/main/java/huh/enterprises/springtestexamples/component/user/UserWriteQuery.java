package huh.enterprises.springtestexamples.component.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserWriteQuery {

	@NotBlank
	private String email;

	@NotBlank
	private String name;

}
